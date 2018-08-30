package gwt.material.design.demo.client.application.dto;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
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


import gwt.material.design.client.constants.Color;

import java.io.Serializable;

/**
 * Version DTO to display the downloadable links for gwt-material, addins , and theme repositories.
 * @author kevzlou7979
 */
public class Version implements Serializable {

    public enum VersionLink{

        // FOR gwt-material Core
        CORE_2_1_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.1.1"),
        CORE_2_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.1"),
        CORE_2_0_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0.1"),
        CORE_2_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0"),
        CORE_2_0_RC7("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc7"),
        CORE_2_0_RC6("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc6"),
        CORE_2_0_RC5("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc5"),
        CORE_2_0_RC4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc4"),
        CORE_2_0_RC3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc3"),
        CORE_2_0_RC2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc2"),
        CORE_2_0_RC1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/2.0-rc1"),
        CORE_1_6_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.6.2"),
        CORE_1_6_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.6.1"),
        CORE_1_6_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.6.0"),
        CORE_1_5_3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.5.3"),
        CORE_1_5_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.5.2"),
        CORE_1_5_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.5.1"),
        CORE_1_5_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.5.0"),
        CORE_1_4_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.4.1"),
        CORE_1_4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.4"),
        CORE_1_3_3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.3.3"),
        CORE_1_3_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.3.2"),
        CORE_1_3_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.3.1"),
        CORE_1_3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.3"),
        CORE_1_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.2"),
        CORE_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material/1.0"),

        // FOR gwt-material Themes
        THEME_1_4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/1.4"),
        THEME_1_5_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/1.5.0"),
        THEME_1_5_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/1.5.1"),
        THEME_1_5_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/1.5.2"),
        THEME_1_6_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/1.6.0"),
        THEME_2_0_RC1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc1"),
        THEME_2_0_RC2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc2"),
        THEME_2_0_RC3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc3"),
        THEME_2_0_RC4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc4"),
        THEME_2_0_RC5("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc5"),
        THEME_2_0_RC6("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc6"),
        THEME_2_0_RC7("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0-rc7"),
        THEME_2_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0"),
        THEME_2_0_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.0.1"),
        THEME_2_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.1"),
        THEME_2_1_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-themes/2.1.1"),

        // FOR gwt-material Addins
        ADDINS_1_5_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/1.5.0"),
        ADDINS_1_5_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/1.5.1"),
        ADDINS_1_5_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/1.5.2"),
        ADDINS_1_6_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/1.6.0"),
        ADDINS_1_6_2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/1.6.2"),
        ADDINS_2_0_RC1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc1"),
        ADDINS_2_0_RC2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc2"),
        ADDINS_2_0_RC3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc3"),
        ADDINS_2_0_RC4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc4"),
        ADDINS_2_0_RC5("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc5"),
        ADDINS_2_0_RC6("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc6"),
        ADDINS_2_0_RC7("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0-rc7"),
        ADDINS_2_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0"),
        ADDINS_2_0_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.0.1"),
        ADDINS_2_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.1"),
        ADDINS_2_1_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-addins/2.1.1"),

        // FOR gwt-material JQuery
        JQUERY_1_0_RC1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/1.0-rc1"),
        JQUERY_1_0_RC2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/1.0-rc2"),
        JQUERY_1_0_RC3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/1.0-rc3"),
        JQUERY_1_0_RC4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/1.0-rc4"),
        JQUERY_2_0_RC5("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.0-rc5"),
        JQUERY_2_0_RC6("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.0-rc6"),
        JQUERY_2_0_RC7("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.0-rc7"),
        JQUERY_2_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.0"),
        JQUERY_2_0_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.0.1"),
        JQUERY_2_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.1"),
        JQUERY_2_1_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-jquery/2.1.1"),

        // FOR gwt-material Table
        TABLE_1_0_RC1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/1.0-rc1"),
        TABLE_1_0_RC2("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/1.0-rc2"),
        TABLE_1_0_RC3("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/1.0-rc3"),
        TABLE_1_0_RC4("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/1.0-rc4"),
        TABLE_2_0_RC5("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.0-rc5"),
        TABLE_2_0_RC6("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.0-rc6"),
        TABLE_2_0_RC7("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.0-rc7"),
        TABLE_2_0("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.0"),
        TABLE_2_0_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.0.1"),
        TABLE_2_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.1"),
        TABLE_2_1_1("http://mvnrepository.com/artifact/com.github.gwtmaterialdesign/gwt-material-table/2.1.1");

        String name;
        VersionLink(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private String version;
    private String date;
    private String linkCore;
    private String linkAddins;
    private String linkThemes;
    private String linkJQuery;
    private String linkTable;
    private Color color;

    public Version() {}

    public Version(String version, String date, String linkCore, String linkAddins, String linkThemes, String linkJQuery, String linkTable, Color color) {
        this.version = version;
        this.date = date;
        this.linkCore = linkCore;
        this.linkAddins = linkAddins;
        this.linkThemes = linkThemes;
        this.linkJQuery = linkJQuery;
        this.linkTable = linkTable;
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLinkCore() {
        return linkCore;
    }

    public void setLinkCore(String linkCore) {
        this.linkCore = linkCore;
    }

    public String getLinkAddins() {
        return linkAddins;
    }

    public void setLinkAddins(String linkAddins) {
        this.linkAddins = linkAddins;
    }

    public String getLinkThemes() {
        return linkThemes;
    }

    public void setLinkThemes(String linkThemes) {
        this.linkThemes = linkThemes;
    }

    public String getLinkJQuery() {
        return linkJQuery;
    }

    public void setLinkJQuery(String linkJQuery) {
        this.linkJQuery = linkJQuery;
    }

    public String getLinkTable() {
        return linkTable;
    }

    public void setLinkTable(String linkTable) {
        this.linkTable = linkTable;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
