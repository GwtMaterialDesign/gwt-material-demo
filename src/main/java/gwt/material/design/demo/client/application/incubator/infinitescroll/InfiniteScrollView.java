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
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.*;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.FakeTestService;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.TestDatasource;
import gwt.material.design.demo.client.application.incubator.infinitescroll.service.TestServiceAsync;
import gwt.material.design.incubator.client.infinitescroll.InfiniteScrollLoader;
import gwt.material.design.incubator.client.infinitescroll.InfiniteScrollPanel;
import gwt.material.design.incubator.client.infinitescroll.data.DataSource;
import gwt.material.design.incubator.client.infinitescroll.data.LoadConfig;
import gwt.material.design.incubator.client.infinitescroll.recycle.RecycleManager;
import gwt.material.design.incubator.client.infinitescroll.recycle.RecycleType;

public class InfiniteScrollView extends ViewImpl implements InfiniteScrollPresenter.MyView {
    public interface Binder extends UiBinder<Widget, InfiniteScrollView> {
    }

    @UiField
    InfiniteScrollPanel<Person> infiniteScrollAdvance, infiniteScrollBasic;

    @UiField
    MaterialTextBox currentEvent;

    @UiField
    MaterialListValueBox<RecycleType> recycleType;

    private TestServiceAsync personService = GWT.create(FakeTestService.class);
    private DataSource<Person> personDataSource = new TestDatasource(personService);

    @Inject
    InfiniteScrollView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        setupBasic();
        setupAdvance();
    }

    protected void setupBasic() {
        infiniteScrollBasic.setLoadConfig(new LoadConfig<>(0, 20));
        infiniteScrollBasic.setDataSource(personDataSource);
        infiniteScrollBasic.setRenderer(model -> createColumn(model));
    }

    protected void setupAdvance() {
        recycleType.addItem(RecycleType.DETACH);
        recycleType.addItem(RecycleType.DISPLAY);

        infiniteScrollAdvance.setLoadConfig(new LoadConfig<>(0, 10));
        infiniteScrollAdvance.setDataSource(personDataSource);
        infiniteScrollAdvance.addLoadingHandler(event -> currentEvent.setValue("Loading: Index[" + event.getStartIndex() + ", " + event.getLastIndex() + "]"));
        infiniteScrollAdvance.addLoadedHandler(event -> currentEvent.setValue("Loaded: " + event.getResult().getData().size() + " Items"));
        infiniteScrollAdvance.addCompleteHandler(event -> currentEvent.setValue("Complete Event fired: " + event.getTotal() + " Total Item(s)"));
        infiniteScrollAdvance.addErrorHandler(event -> MaterialToast.fireToast("Error: " + event.getMessage()));
        infiniteScrollAdvance.setRenderer(model -> createColumn(model));
        infiniteScrollAdvance.setInfiniteScrollLoader(new InfiniteScrollLoader("Please wait while we are getting your data"));
        infiniteScrollAdvance.setRecycleManager(new RecycleManager(RecycleType.DETACH));
    }

    protected MaterialWidget createColumn(Person person) {
        MaterialColumn column = new MaterialColumn(12, 12, 12);
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

    @UiHandler("recycleType")
    void recycleType(ValueChangeEvent<RecycleType> event) {
        infiniteScrollAdvance.setRecycleManager(new RecycleManager(event.getValue()));
        infiniteScrollAdvance.reload();
    }
}
