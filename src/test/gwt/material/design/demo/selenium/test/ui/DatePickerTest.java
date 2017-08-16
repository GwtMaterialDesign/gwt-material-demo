package gwt.material.design.demo.selenium.test.ui;

import gwt.material.design.demo.selenium.test.base.AbstractSeleniumTest;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;

public class DatePickerTest extends AbstractSeleniumTest {

    public DatePickerTest(WebDriverManager driver) {
        super(driver, "Date Picker");
    }

    @Override
    protected void runTests() {
        checkBasic();
    }

    protected void checkBasic() {
        reload();
    }
}
