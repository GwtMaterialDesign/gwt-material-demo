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


public enum Links {

    // DataTable
    DT_USAGE("Usage", "#datatable_usage"),
    DT_RESOURCES("Resources", "#datatable_resources"),
    DT_STANDARD("Standard Data Table (UPDATED)", "#standard_table"),
    DT_BASIC_PROPERTIES("Basic Properties", "#basic_properties"),
    DT_EVENTS("Events (UPDATED)", "#datatable_events"),
    DT_ROW_FACTORY("Row Factory", "#row_factory"),
    DT_ROW_API("Row APIs (NEW)", "#row_api"),
    DT_CATEGORY_FACTORY("Category Factory", "#category_factory"),
    DT_ADDING_CATEGORIES("Adding Categories (NEW)", "#adding_categories"),
    DT_ADDING_CATEGORY_COLUMNS("Adding Category Columns (NEW)", "#category_thead"),
    DT_RENDERER("Renderer", "#renderer"),
    DT_ADDING_COLUMNS("Adding Columns", "#adding_columns"),
    DT_ADDING_COLUMNS_MATERIAL("Adding Material Widget Columns", "#columns_material"),
    DT_AUTO_SORT_COLUMNS("Auto Sort Columns (NEW)", "#columns_auto_sort"),
    DT_SET_VISIBLE_RANGE("Set Visible Range", "#visible_range"),
    DT_SET_ROW_DATA("Set Row Data", "#set_row_data"),
    DT_FIELD_UPDATER("Field Updater", "#field_updater"),
    DT_REFRESH_REDRAW("Refresh and Redraw", "#refresh_redraw"),
    DT_CUSTOM("Customize DataTable", "#custom_table"),
    DT_ROW_SELECTION("Row Selection Design", "#row_selection"),
    DT_INFINITE("Infinite DataTable", "#infinite_table"),
    DT_DATA_SOURCE("Data Source", "#data_source"),
    DT_PAGER("Data Table Pager", "#data_pager"),
    DT_CONTEXT_MENU("Context Menu", "#context_menu");

    String title;
    String link;

    Links(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}
