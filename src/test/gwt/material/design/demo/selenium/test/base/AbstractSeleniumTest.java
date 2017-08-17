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
import gwt.material.design.demo.selenium.test.constants.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * An abstract util class that wraps and reassemble each WebDriver api methods
 * to build a reusable wrapper.
 */
public abstract class AbstractSeleniumTest {

    protected WebDriver driver;
    protected String gmdUrl;
    protected WebDriverWait wait;

    public AbstractSeleniumTest(WebDriverManager manager) {
        this.gmdUrl = manager.getBaseUrl();
        this.driver = manager.getDriver();
        wait = new WebDriverWait(driver, Config.EXPLICIT_WAITING_TIME);
    }

    protected abstract void runTests();

    protected void scrollTo(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    protected void visit(String url) {
        driver.get(url);
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
            return driver.findElement(By.cssSelector(selector));
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

    protected void reload() {
        driver.get(gmdUrl);
    }
}
