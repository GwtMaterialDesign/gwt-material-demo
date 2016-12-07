#!/bin/bash
set -ev
if [ "$TRAVIS_JDK_VERSION" == "oraclejdk8" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "release_2.1" ]; then

if [[ -z "$GH_TOKEN" ]]; then
echo -e "GH_TOKEN is not set"
exit 1
fi

if [ ! -f $TRAVIS_BUILD_DIR/target/gwt-material-demo-*.war ]; then
echo -e "demo war file not found."
exit 1
fi

echo -e "Publishing demo to gh-pages . . .\n"

git config --global user.email "travis@travis-ci.org"
git config --global user.name "travis-ci"

# clone the gh-pages branch.
cd $HOME
rm -rf gh-pages
git clone --quiet --branch=gh-pages https://$GH_TOKEN@github.com/GwtMaterialDesign/gwt-material-demo gh-pages > /dev/null
cd gh-pages

# remove the GwtMaterialDemo directories from git.
if [[ -d ./2.1/gwtmaterialdemo ]]; then
git rm -rf ./2.1/gwtmaterialdemo
fi
if [[ -f ./2.1/index.html ]]; then
git rm -rf ./2.1/index.html
fi
if [[ -d ./2.1/META-INF ]]; then
git rm -rf ./2.1/META-INF
fi
if [[ -d ./2.1/WEB-INF ]]; then
git rm -rf ./2.1/WEB-INF
fi

# copy the new GwtMaterialDemo the snapshot dir.
unzip -u $TRAVIS_BUILD_DIR/target/gwt-material-demo-*.war -d ./2.1/
rm -rf ./2.1/META-INF
rm -rf ./2.1/WEB-INF

git add -f .
git commit -m "Auto-push demo to gh-pages successful. (Travis build: $TRAVIS_BUILD_NUMBER)"
git push -fq origin gh-pages > /dev/null

echo -e "Published demo to gh-pages.\n"

fi