package gwt.material.design.demo.client.application.datatable.table.datasource;

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
import gwt.material.design.client.data.DataSource;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.loader.LoadCallback;
import gwt.material.design.client.data.loader.LoadConfig;
import gwt.material.design.client.data.loader.LoadResult;
import gwt.material.design.demo.client.application.datatable.table.People;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.demo.client.application.datatable.table.service.PersonServiceAsync;

import java.util.List;
import java.util.stream.Collectors;

public class PersonDataSource implements DataSource<Person> {

    private final PersonServiceAsync personService;

    public  PersonDataSource(PersonServiceAsync personService) {
        this.personService = personService;
    }

    @Override
    public void load(LoadConfig<Person> loadConfig, LoadCallback<Person> callback) {
        List<CategoryComponent> categories = loadConfig.getOpenCategories();

        List<String> categoryNames = null;
        if(categories != null) {
            categoryNames = categories.stream().map(CategoryComponent::getName).collect(Collectors.toList());
        }

        personService.getPeople(loadConfig.getOffset(), loadConfig.getLimit(), categoryNames,
                new AsyncCallback<People>() {
            @Override
            public void onSuccess(People people) {
                callback.onSuccess(new LoadResult<>(people, loadConfig.getOffset(), people.getAbsoluteTotal()));
            }
            @Override
            public void onFailure(Throwable throwable) {
                GWT.log("Getting people async call failed.", throwable);
                callback.onFailure(throwable);
            }
        });
    }

    @Override
    public boolean useRemoteSort() {
        return false;
    }
}
