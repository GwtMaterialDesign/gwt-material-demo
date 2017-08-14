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

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppDemoTest {

    private final String USERNAME = "*****";
    private final String AUTOMATE_KEY = "*****";
    private final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private final String GMD_URL = "https://gwtmaterialdesign.github.io/gwt-material-demo/";

    @Test(dataProvider = "ENVIRONMENT_DATA")
    public void testDatePicker(Platform platform, String browser) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setPlatform(platform);
        caps.setBrowserName(browser);
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("build", "First build");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get(GMD_URL);
        driver.manage().window().maximize();

        WebElement searchIcon = driver.findElement(By.cssSelector("header nav .nav-wrapper a:nth-child(3)"));
        Assert.assertNotNull(searchIcon);
        searchIcon.click();

        WebElement searchInput = driver.findElement(By.cssSelector("header nav .nav-wrapper .input-field input[type=search]"));
        Assert.assertNotNull(searchInput);
        searchInput.sendKeys("Date Picker");
        searchInput.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getCurrentUrl(), GMD_URL + "#pickers");

        // DatePicker
        WebElement datePicker = driver.findElement(By.cssSelector("main .code:nth-child(1) .input-field input"));
        datePicker.click();

        driver.get(GMD_URL);

        System.out.println(driver.getTitle());
        driver.quit();
    }

    @DataProvider(name = "ENVIRONMENT_DATA", parallel = true)
    public Object[][] getEnvironment() {
        Object[][] testData = new Object[][]{{Platform.WIN10, "chrome"},
                {Platform.ANDROID, "chrome"},
                {Platform.SIERRA, "firefox"}};
        return testData;
    }
}