package gwt.material.design.demo.server;

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


import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import gwt.material.design.demo.client.application.addins.datatable.table.People;
import gwt.material.design.demo.client.application.addins.datatable.table.Person;
import gwt.material.design.demo.client.application.addins.datatable.table.service.PersonService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

    private static List<String> categories = new ArrayList<>();
    private static Map<String, List<Person>> peopleMap = new HashMap<>();
    static {
        categories.add("People");
        categories.add("Animal");
        categories.add("Plant");
        categories.add("Other");
        categories.add("Next");

        int index = 0;
        for(String category : categories) {
            for(int i = 0; i < 100; i++, index++) {
                List<Person> data = peopleMap.get(category);
                if(data == null) {
                    data = new ArrayList<>();
                    peopleMap.put(category, data);
                }
                data.add(new Person(i, "http://joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + index, "Field " + i, "Field " + index, "No " + i,"Category " + category));
            }
        }
    }

    @Override
    public People getPeople(int startIndex, int viewSize, List<String> categories) {
        List<Person> flatData = new ArrayList<>();
        if(categories == null) {
            // Load all data
            for(String category : PersonServiceImpl.categories) {
                flatData.addAll(peopleMap.get(category));
            }
        } else {
            // Load data by categories
            for (String category : categories) {
                for (Person person : peopleMap.get(category)) {
                    flatData.add(person);
                }
            }
        }

        People people = new People();
        for(int i = startIndex; i < (startIndex + viewSize); i++) {
            try {
                people.add(flatData.get(i));
            } catch (IndexOutOfBoundsException e) {
                // ignored.
            }
        }
        people.setAbsoluteTotal(flatData.size());
        return people;
    }

    @Override
    public List<String> getCategories() {
        return categories;
    }
}