package gwt.material.design.demo.selenium.test.ui;

import gwt.material.design.demo.selenium.test.base.AbstractSeleniumTest;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;

public class GlobalFunctionalityTest extends AbstractSeleniumTest {

    public GlobalFunctionalityTest(WebDriverManager driver) {
        super(driver);
    }

    @Override
    protected void runTests() {
        findElement("");
    }
}
