package gwt.material.design.demo.client.application.datatable;

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


import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwt.material.design.demo.client.application.datatable.contextmenu.ContextMenuDataTableModule;
import gwt.material.design.demo.client.application.datatable.custom.CustomDataTableModule;
import gwt.material.design.demo.client.application.datatable.frozen.FrozenDataTableModule;
import gwt.material.design.demo.client.application.datatable.infinite.InfiniteDataTableModule;
import gwt.material.design.demo.client.application.datatable.paged.PagedDataTableModule;
import gwt.material.design.demo.client.application.datatable.standard.StandardDataTableModule;

public class DataTableModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new StandardDataTableModule());
        install(new PagedDataTableModule());
        install(new InfiniteDataTableModule());
        install(new FrozenDataTableModule());
        install(new CustomDataTableModule());
        install(new ContextMenuDataTableModule());
    }
}
