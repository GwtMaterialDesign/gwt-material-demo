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