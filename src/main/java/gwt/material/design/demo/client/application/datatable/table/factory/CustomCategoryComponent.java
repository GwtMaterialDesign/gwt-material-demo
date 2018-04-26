/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.demo.client.application.datatable.table.factory;

import gwt.material.design.client.data.HasCategories;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.ui.MaterialBadge;
import gwt.material.design.client.ui.table.TableHeader;
import gwt.material.design.client.ui.table.TableSubHeader;

public class CustomCategoryComponent extends CategoryComponent {

    public CustomCategoryComponent(HasCategories parent, String name) {
        super(parent, name);
    }

    public CustomCategoryComponent(HasCategories parent, String name, boolean openByDefault) {
        super(parent, name, true);
    }

    @Override
    protected void render(TableSubHeader subheader, int column) {
        super.render(subheader, column);

        subheader.getNameTh().setPaddingLeft(20);

        // Here you can define any element attach to the Category Component SubHeader
        TableHeader newHeader = new TableHeader();
        newHeader.setPaddingLeft(40);
        newHeader.add(new MaterialBadge("$1,000"));
        subheader.add(newHeader);
    }
}
