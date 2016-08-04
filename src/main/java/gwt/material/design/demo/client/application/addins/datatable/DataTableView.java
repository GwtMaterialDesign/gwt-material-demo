package gwt.material.design.demo.client.application.addins.datatable;

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

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.demo.client.application.addins.datatable.table.CustomTable;
import gwt.material.design.demo.client.application.addins.datatable.table.InfiniteTable;
import gwt.material.design.demo.client.application.addins.datatable.table.PageTable;
import gwt.material.design.demo.client.application.addins.datatable.table.StandardTable;
import gwt.material.design.demo.client.application.dto.Links;
import gwt.material.design.demo.client.application.dto.ScrollspyHelper;
import gwt.material.design.demo.client.ui.NavigatedView;

import javax.inject.Inject;
import java.util.List;

public class DataTableView extends NavigatedView implements DataTablePresenter.MyView {
    interface Binder extends UiBinder<Widget, DataTableView> {
    }

    @UiField
    MaterialPanel standardTablePanel, infiniteTablePanel, customTablePanel, pagedTable;

    @UiField
    MaterialColumn menuPanel;

    @Inject
    DataTableView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        standardTablePanel.add(new StandardTable());
        infiniteTablePanel.add(new InfiniteTable());
        customTablePanel.add(new CustomTable());
        pagedTable.add(new PageTable());
        buildScrollSpy(ScrollspyHelper.getDataTable(), menuPanel);
    }

    @Override
    public void buildScrollSpy(List<Links> links, MaterialWidget panel) {
        super.buildScrollSpy(links, panel);
    }
}
