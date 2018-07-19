const args = process.argv;
const arguments = args.slice(2);

const buildFolderName = arguments[0];
const gwtModuleName = arguments[1];

if (typeof buildFolderName === 'undefined' || !buildFolderName) {
    console.log("Please provide the name of the build folder.");
    return;
}

const rootFolder = 'target/' + buildFolderName;
const fs = require('fs');
var Handlebars = require('handlebars');

var filesToCache = [];

browseAllFilesInDirectory(rootFolder);

function browseAllFilesInDirectory(folder) {
    const filesRegExp = /\.(html|css|js|gif|png|jpeg|eot|ttf|woff|woff2)$/i;
    const exceptions = ["WEB-INF", "META-INF"];

    fs.readdirSync(folder).forEach(fileName => {
        const resource = folder + "/" + fileName;
        if (exceptions.indexOf(fileName) < 0) {
            if (fileName.match(filesRegExp)) {
                filesToCache.push(resource.replace(rootFolder + "/", ""));
            } else if (fs.lstatSync(resource).isDirectory()) {
                browseAllFilesInDirectory(resource);
            }
        }
    });
}

var swData = {
    cacheName: gwtModuleName || "cache_" + new Date().getTime().toString(),
    filesToCache: filesToCache,
};

fs.readFile("bin/sw-template.js", "utf8", (error, data) => {
    if (error) {
        console.log("Unable to read template file");
    }
    var template = Handlebars.compile(data);
    var serviceWorkerJs = template(swData);

    fs.writeFile(rootFolder + "/service-worker.js", serviceWorkerJs, (error) => {
        console.log("Successfully generated service worker service-worker.js in " + rootFolder);
    });
});