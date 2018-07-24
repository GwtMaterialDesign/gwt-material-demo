package gwt.material.design.demo.client.application.incubator.infinitescroll;

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
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.*;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.FakeTestService;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.TestDatasource;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.TestServiceAsync;
import gwt.material.design.incubator.client.infinitescroll.InfiniteScrollPanel;
import gwt.material.design.incubator.client.infinitescroll.data.DataSource;
import gwt.material.design.incubator.client.infinitescroll.data.LoadConfig;

public class InfiniteScrollView extends ViewImpl implements InfiniteScrollPresenter.MyView {
    public interface Binder extends UiBinder<Widget, InfiniteScrollView> {
    }

    @UiField
    InfiniteScrollPanel<Person> infiniteScrollPanel;

    private TestServiceAsync personService = GWT.create(FakeTestService.class);
    private DataSource<Person> personDataSource = new TestDatasource(personService);

    @Inject
    InfiniteScrollView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        infiniteScrollPanel.setLoadConfig(new LoadConfig<>(0, 10));
        infiniteScrollPanel.setDataSource(personDataSource);
        infiniteScrollPanel.addLoadingHandler(event -> MaterialToast.fireToast("Loading Event fired"));
        infiniteScrollPanel.addLoadHandler(event -> MaterialToast.fireToast("Loaded Event fired"));
        infiniteScrollPanel.addCompleteHandler(event -> MaterialToast.fireToast("All data are loaded"));
        infiniteScrollPanel.setRenderer(model -> createColumn(model));
    }

    protected MaterialWidget createColumn(Person person) {
        MaterialColumn column = new MaterialColumn(12, 12, 3);
        MaterialCard card = new MaterialCard();
        card.setMargin(12);
        card.setPadding(40);

        MaterialLabel title = new MaterialLabel(person.getFirstName());
        title.setFontWeight(Style.FontWeight.BOLD);
        card.add(title);
        card.add(new MaterialLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));

        column.add(card);
        return column;
    }
}
