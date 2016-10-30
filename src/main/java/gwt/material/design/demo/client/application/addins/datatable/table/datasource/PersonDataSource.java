package gwt.material.design.demo.client.application.addins.datatable.table.datasource;

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


import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.infinite.InfiniteDataSource;
import gwt.material.design.client.data.infinite.InfiniteDataView;
import gwt.material.design.demo.client.application.addins.datatable.table.People;
import gwt.material.design.demo.client.application.addins.datatable.table.Person;
import gwt.material.design.demo.client.application.addins.datatable.table.service.PersonServiceAsync;

import java.util.ArrayList;
import java.util.List;

public class PersonDataSource extends InfiniteDataSource<Person> {

    private final PersonServiceAsync personService;

    public PersonDataSource(PersonServiceAsync personService) {
        this.personService = personService;
    }

    @Override
    public void load(InfiniteDataView<Person> dataView, int startIndex, int viewSize, List<CategoryComponent> categories) {
        List<String> categoryNames = null;
        if(dataView.isUseCategories()) {
            categoryNames = new ArrayList<>();
            for (CategoryComponent category : categories) {
                categoryNames.add(category.getCategory());
            }
        }
        personService.getPeople(startIndex, viewSize, categoryNames, new AsyncCallback<People>() {
            @Override
            public void onSuccess(People people) {
                dataView.loaded(startIndex, people, people.getAbsoluteTotal(), true);
            }
            @Override
            public void onFailure(Throwable throwable) {
                GWT.log("Getting people async call failed.", throwable);
            }
        });
    }
}
