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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {

    private String baseUrl;
    private WebDriver driver;

    public void setUpBrowserStack() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("build", "BrowserStack Automate Selenium Test");
        caps.setCapability("browserName", Config.BROWSER_NAME);
        caps.setCapability("platform", Config.PLATFORM);
        caps.setCapability("version", Config.BROWSER_VERSION);
        driver = new RemoteWebDriver(new URL(Config.BROWSER_STACK_REMOTE_URL), caps);
    }

    public void setupLocal() {
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void load(String url) {
        this.baseUrl = url;
        driver.get(url);
        driver.manage().window().maximize();
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
