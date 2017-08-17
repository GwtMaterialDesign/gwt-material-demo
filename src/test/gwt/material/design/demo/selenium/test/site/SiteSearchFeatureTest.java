package gwt.material.design.demo.selenium.test.site;

import gwt.material.design.demo.selenium.test.base.BaseSeleniumTest;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;
import gwt.material.design.demo.selenium.test.constants.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SiteSearchFeatureTest extends BaseSeleniumTest {

    public SiteSearchFeatureTest(WebDriverManager manager) {
        super(manager, "About");
    }

    @Override
    protected void runTests() {
        // Search Getting Started
        typeSearch("Getting Started");
        Assert.assertTrue(hasChildElements(Elements.SEARCH_RESULT));

        // Check the Search Result Panel
        Assert.assertEquals(1, getResultItems().size());
        Assert.assertTrue(isVisible(Elements.SEARCH_NAV));

        // Submit the Search field - Check the App Header Title if its updated
        submitSearch();
        Assert.assertTrue(isTextMatch(Elements.APP_TITLE, "Getting Started"));

        // Navigate thru arrow key
        typeSearch(Keys.ARROW_DOWN);
        Assert.assertEquals("rgba(238, 238, 238, 1)", getSearchResultPanel().findElement(By.cssSelector("a")).getCssValue("background-color"));

        // Clear the Search panel
        typeSearch(Keys.BACK_SPACE);
        Assert.assertTrue(isVisible(Elements.SEARCH_NAV));


        // Search thru scrolling the panel and choose one item : Forms
        WebElement formSearchItem = findElement(".search-result a[href='#forms']");
        scrollTo(formSearchItem);
        formSearchItem.click();
        Assert.assertTrue(isTextMatch(Elements.APP_TITLE, "Forms"));

        // Navigate without search result
        typeSearch("noresult");
        Assert.assertFalse(hasChildElements(Elements.SEARCH_RESULT));

        // Close the search bar
        closeSearch();
        Assert.assertFalse(isVisible(Elements.SEARCH_NAV));
    }
}
