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

import gwt.material.design.demo.selenium.test.constants.Elements;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Base Wrapper specific usecase for the Apps Structure and Behavior
 */
public class BaseSeleniumTest extends AbstractSeleniumTest {

    public BaseSeleniumTest(WebDriverManager manager, String component) {
        super(manager);
        searchComponent(component);
    }

    public BaseSeleniumTest(WebDriverManager manager) {
        super(manager);
        runTests();
    }

    @Override
    protected void runTests() {

    }

    protected void searchComponent(String component) {
        openSearch();
        typeSearch(component);
        submitSearch();
        runTests();
    }

    protected WebElement getSearchInput() {
        WebElement searchInput = findElement(Elements.SEARCH_INPUT);
        Assert.assertNotNull(searchInput);
        return searchInput;
    }

    protected WebElement getSearchResultPanel() {
        WebElement searchResult = findElement(Elements.SEARCH_RESULT);
        return searchResult;
    }

    protected void typeSearch(CharSequence keyword) {
        WebElement searchInput = getSearchInput();
        searchInput.clear();
        searchInput.sendKeys(keyword);
    }

    protected void openSearch() {
        WebElement searchIcon = findElement(Elements.SEARCH_OPEN_ICON);
        Assert.assertNotNull(searchIcon);
        searchIcon.click();
    }

    protected void closeSearch() {
        click(Elements.SEARCH_CLOSE_ICON);
    }

    protected void submitSearch() {
        getSearchInput().sendKeys(Keys.ENTER);
    }

    protected List<WebElement> getResultItems() {
        return getSearchResultPanel().findElements(By.cssSelector("a"));
    }

    protected void scrollToSection(int index) {
        scrollTo(findSection(index));
    }

    protected WebElement getAppTitle() {
        return findElement(Elements.APP_TITLE);
    }


    // It is a 1-based index
    protected WebElement findSection(int index) {
        return findElement(Elements.SHOWCASE_SECTION + ":nth-child(" + index + ")");
    }
}
