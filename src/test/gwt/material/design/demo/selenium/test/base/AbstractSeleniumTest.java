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
package gwt.material.design.demo.selenium.test.base;

import gwt.material.design.demo.selenium.test.constants.Config;
import gwt.material.design.demo.selenium.test.constants.TestPlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

/**
 * An abstract util class that wraps and reassemble each WebDriver api methods
 * to build a reusable wrapper.
 */
public class AbstractSeleniumTest {

    protected WebDriverWait wait;

    private WebDriverManager manager = new WebDriverManager();

    protected void setup(TestPlatform testPlatform) throws MalformedURLException {
        if (testPlatform == TestPlatform.BROWSERSTACK) {
            manager.setUpBrowserStack();
        } else {
            manager.setupLocal();
        }
        manager.load(Config.BASE_URL);

        wait = new WebDriverWait(manager.getDriver(), Config.EXPLICIT_WAITING_TIME);
    }

    @AfterTest
    public void finish() {
        manager.getDriver().quit();
    }

    protected void scrollTo(WebElement element) {
        Actions actions = new Actions(manager.getDriver());
        actions.moveToElement(element);
        actions.perform();
    }

    protected void visit(String url) {
        manager.getDriver().get(url);
    }

    protected void navigateTo(String href) {
        findElement("a[href='#" + href + "']").click();
    }

    protected void click(String selector) {
        findElement(selector).click();
    }

    protected void sendKeys(CharSequence text, String selector) {
        findElement(selector).sendKeys(text);
    }

    protected WebElement findElement(String selector) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
            return manager.getDriver().findElement(By.cssSelector(selector));
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    protected boolean isTextMatch(String selector, String text) {
        try {
            wait.until(ExpectedConditions.textToBe(By.cssSelector(selector), text));
            return findElement(selector).getText().equals(text);
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isCssPropertyValueMatch(String selector, String property, String value) {
        try {
            wait.until(ExpectedConditions.attributeContains(By.cssSelector(selector), property, value));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean isVisible(String selector) {
        return isCssPropertyValueMatch(selector, "display", "block");
    }

    protected boolean hasChildElements(String selector) {
        return findElement(selector).findElements(By.xpath(".//*")).size() != 0;
    }

    public void waitUntilElementHidden(String selector) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(selector)));
    }

    protected void waitUntilPageLoad(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }

    protected void reload() {
        manager.getDriver().get(Config.BASE_URL);
    }
}
