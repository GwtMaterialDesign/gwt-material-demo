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
import gwt.material.design.demo.selenium.test.constants.Elements;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SiteSearchFeatureTest extends BaseSeleniumTest {

    @Test
    public void testSearch() {
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
