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
package gwt.material.design.demo.client.application.incubator.infinitescroll.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import gwt.material.design.demo.client.application.datatable.table.People;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.incubator.client.infinitescroll.data.DataSource;
import gwt.material.design.incubator.client.infinitescroll.data.LoadCallback;
import gwt.material.design.incubator.client.infinitescroll.data.LoadConfig;
import gwt.material.design.incubator.client.infinitescroll.data.LoadResult;

public class TestDatasource implements DataSource<Person> {

    private final TestServiceAsync personService;

    public TestDatasource(TestServiceAsync personService) {
        this.personService = personService;
    }

    @Override
    public void load(LoadConfig<Person> loadConfig, LoadCallback<Person> callback) {

        personService.getPeople(loadConfig.getOffset(), loadConfig.getLimit(),
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
}