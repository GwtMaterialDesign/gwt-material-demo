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
