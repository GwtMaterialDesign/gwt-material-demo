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
package gwt.material.design.demo.selenium.test.ui;

import gwt.material.design.demo.selenium.test.base.AbstractSeleniumTest;
import gwt.material.design.demo.selenium.test.base.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TabsTest extends AbstractSeleniumTest {


    public TabsTest(WebDriverManager driver) {
        super(driver, "Tabs");
    }

    @Override
    protected void runTests() {
        checkBasic();
        checkDisabledTabItem();
        checkSetTabIndex();
        checkGetTabIndex();
        checkSelection();
    }

    protected void checkDisabledTabItem() {
        scrollToSection(2);
    }

    protected void checkSetTabIndex() {
        scrollToSection(4);
    }

    protected void checkGetTabIndex() {
        scrollToSection(5);
    }

    protected void checkSelection() {
        scrollToSection(9);
    }

    protected void checkBasic() {
        // Check the first tab
        WebElement firstTabItem = findTabItem(1, 1);
        WebElement secondTabItem = findTabItem(1, 2);
        WebElement thirdTabItem = findTabItem(1, 3);

        // Navigate to second tab item
        Assert.assertNotNull(secondTabItem);
        secondTabItem.click();

        // Check the active tab item
        Assert.assertFalse(isActive(firstTabItem));
        Assert.assertFalse(isActive(thirdTabItem));
        Assert.assertTrue(isActive(secondTabItem));
    }

    protected boolean isActive(WebElement element) {
        return element.findElement(By.cssSelector("a")).getAttribute("class").contains("active");
    }

    protected WebElement findTab(int index) {
        return findElement(".code:nth-child("+ index + ")");
    }

    protected WebElement findTabItem(int tabIndex, int itemIndex) {
        return findTab(tabIndex).findElement(By.cssSelector("ul.tabs li:nth-child(" + itemIndex + ")"));
    }
}
