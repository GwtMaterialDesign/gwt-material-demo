package gwt.material.design.demo.client.application.incubator.infinitescroll.service;

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


import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import gwt.material.design.demo.client.application.datatable.table.People;
import gwt.material.design.demo.client.application.datatable.table.Person;

import java.util.ArrayList;
import java.util.List;

public class FakeTestService implements TestServiceAsync {

    private static List<Person> data = new ArrayList<>();

    static {

        int index = 1;
        for (int i = 1; i <= 100; i++, index++) {
            data.add(new Person(i, "https://joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + index, "Field " + i, "Field " + index, "No " + i, ""));
        }
    }

    @Override
    public void getPeople(int startIndex, int viewSize, AsyncCallback<People> async) {
        List<Person> flatData = new ArrayList<>();
        flatData.addAll(data);

        People people = new People();
        for (int i = startIndex; i < (startIndex + viewSize); i++) {
            try {
                people.add(flatData.get(i));
            } catch (IndexOutOfBoundsException e) {
                // ignored.
            }
        }
        people.setAbsoluteTotal(flatData.size());
        // Fake a delay for the demo
        new Timer() {
            @Override
            public void run() {
                async.onSuccess(people);
            }
        }.schedule(3000);
    }
}
