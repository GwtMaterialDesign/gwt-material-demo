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


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Kevin on 8/4/2016.
 */
public class ScrollspyHelper {

    public static List<Links> getDataTable() {
        List<Links> links = new ArrayList<>();
        links.add(Links.DT_USAGE);
        links.add(Links.DT_RESOURCES);
        links.add(Links.DT_STANDARD);
        links.add(Links.DT_BASIC_PROPERTIES);
        links.add(Links.DT_EVENTS);
        links.add(Links.DT_ROW_FACTORY);
        links.add(Links.DT_ROW_API);
        links.add(Links.DT_CATEGORY_FACTORY);
        links.add(Links.DT_ADDING_CATEGORIES);
        links.add(Links.DT_ADDING_CATEGORY_COLUMNS);
        links.add(Links.DT_RENDERER);
        links.add(Links.DT_ADDING_COLUMNS);
        links.add(Links.DT_ADDING_COLUMNS_MATERIAL);
        links.add(Links.DT_AUTO_SORT_COLUMNS);
        links.add(Links.DT_SET_VISIBLE_RANGE);
        links.add(Links.DT_SET_ROW_DATA);
        links.add(Links.DT_FIELD_UPDATER);
        links.add(Links.DT_REFRESH_REDRAW);
        links.add(Links.DT_CUSTOM);
        links.add(Links.DT_INFINITE);
        links.add(Links.DT_DATA_SOURCE);
        links.add(Links.DT_ROW_SELECTION);
        links.add(Links.DT_PAGER);
        links.add(Links.DT_CONTEXT_MENU);
        return links;
    }

}
