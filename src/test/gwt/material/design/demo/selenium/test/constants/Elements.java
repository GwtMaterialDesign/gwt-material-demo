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
package gwt.material.design.demo.selenium.test.constants;

public interface Elements {

    String SEARCH_FIELD = "header nav .nav-wrapper .input-field";
    String SEARCH_NAV = "header nav:nth-child(2)";
    String SEARCH_INPUT = "header nav .nav-wrapper .input-field input[type=search]";
    String SEARCH_RESULT = ".search-result";
    String SEARCH_OPEN_ICON = "header nav .nav-wrapper a:nth-child(3)";
    String SEARCH_CLOSE_ICON = "nav .input-field > i";

    String SIDENAV_LEFT_ICON = "nav a[data-activates='sideBar']";
    String SIDENAV_RIGHT_ICON = "nav a[data-activates='rightSideBar']";
    String SIDENAV_LEFT = "ul#sideBar";
    String SIDENAV_RIGHT = "ul#rightSideBar";
    String SIDENAV_RIGHT_MENU = "ul#rightSideBar li:nth-child(2)";
    String SIDENAV_COMPONENTS_LINK = "ul#sideBar ul.collapsible > li:nth-child(1)";
    String MAIN = "main";

    String APP_TITLE = "main > div > div > span.material-label:nth-child(1)";
    String SHOWCASE_SECTION = ".code";
}
