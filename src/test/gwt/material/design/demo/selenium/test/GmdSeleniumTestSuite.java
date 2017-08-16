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
package gwt.material.design.demo.selenium.test;

import gwt.material.design.demo.selenium.test.base.TestPlatform;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;
import gwt.material.design.demo.selenium.test.constants.Config;
import gwt.material.design.demo.selenium.test.ui.GlobalFunctionalityTest;
import gwt.material.design.demo.selenium.test.ui.TabsTest;
import junit.framework.TestSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GmdSeleniumTestSuite extends TestSuite {

    private WebDriverManager manager = new WebDriverManager();

    @BeforeTest(description = "Launching up browser and opening the GMD Demo")
    public void setup() throws MalformedURLException {
        setup(TestPlatform.LOCAL);
    }

    protected void setup(TestPlatform testPlatform) throws MalformedURLException {
        if (testPlatform == TestPlatform.BROWSERSTACK) {
            manager.setUpBrowserStack();
        } else {
            manager.setupLocal();
        }
        manager.load(Config.BASE_URL);
    }

    @Test(description = "Checking Global Functionality")
    public void testGlobal() {
        new GlobalFunctionalityTest(manager);
    }

    @Test(description = "Checking Tabs")
    public void testTabs() throws MalformedURLException {
        new TabsTest(manager);
    }

    @AfterTest
    public void finish() {
        manager.getDriver().quit();
    }
}