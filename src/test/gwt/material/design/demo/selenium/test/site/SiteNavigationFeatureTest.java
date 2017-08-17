/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.demo.selenium.test.site;

import gwt.material.design.demo.selenium.test.base.BaseSeleniumTest;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;
import gwt.material.design.demo.selenium.test.constants.Elements;
import org.junit.Assert;

public class SiteNavigationFeatureTest extends BaseSeleniumTest {

    public SiteNavigationFeatureTest(WebDriverManager manager) {
        super(manager);
    }

    @Override
    protected void runTests() {
        // Check if by default the sidenav is opened
        // Take note mobile devices will probably closed by default
        if (!isSideNavOpen(Elements.SIDENAV_LEFT, "left")) {
            toggleSideNav(Elements.SIDENAV_LEFT_ICON);
        }

        // Expected Result - SideNav is open
        Assert.assertTrue(isSideNavOpen(Elements.SIDENAV_LEFT, "left"));

        // Must open sidenav and perform the navigation
        navigateTo("gettingstarted");
        Assert.assertTrue(isTextMatch(Elements.APP_TITLE, "Getting Started"));

        // Navigate to Nested Selection -> Components / Cards
        click(Elements.SIDENAV_COMPONENTS_LINK);
        navigateTo("cards");

        // Check the titles if the selection is successfully navigated the page
        Assert.assertTrue(isTextMatch(Elements.APP_TITLE, "Cards"));

        // Close the sidenav
        toggleSideNav(Elements.SIDENAV_LEFT_ICON);

        // Check if the content area has maximize its width
        Assert.assertTrue(isCssPropertyValueMatch(Elements.MAIN, "margin-left", "0px"));

        // Open the mini sidenav -> Perform open / close
        toggleSideNav(Elements.SIDENAV_RIGHT_ICON);
        Assert.assertTrue(isSideNavOpen(Elements.SIDENAV_RIGHT, "right"));
        click(Elements.SIDENAV_RIGHT_MENU);
        Assert.assertFalse(isSideNavOpen(Elements.SIDENAV_RIGHT, "right"));
    }


    protected void toggleSideNav(String selector) {
        findElement(selector).click();
    }

    protected boolean isSideNavOpen(String selector, String edge) {
        return isCssPropertyValueMatch(selector, edge, "0px");
    }
}
