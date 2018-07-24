package gwt.material.design.demo.client.application.components.tabs;

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


import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.WavesType;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class TabsView extends ViewImpl implements TabsPresenter.MyView {

    interface Binder extends UiBinder<Widget, TabsView> {
    }

    @UiField
    MaterialTab tabBasic, tabIntro, tabSetIndex, tabIcons, tabIndicatorColor, tabControlWidth, tabEvents, tabGetIndex, tabFit, dynamicTabs;

    @UiField
    MaterialRow dynamicTabsRow;

    @UiField
    MaterialListBox lstTabIds;

    private int index = 0;

    @Inject
    TabsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        buildDynamicTab();
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        buildListTabIds();

        tabEvents.addSelectionHandler(selectionEvent -> MaterialToast.fireToast(selectionEvent.getSelectedItem() + " Selected Index"));
    }

    @UiHandler("lstTabIds")
    void selectTab(ValueChangeEvent<String> e) {
        tabGetIndex.selectTab(e.getValue());
    }

    @UiHandler("btnGetTabIndex")
    void getTabInde1x(ClickEvent e) {
        MaterialToast.fireToast(tabGetIndex.getTabIndex() + "");
    }

    @UiHandler("addTab")
    void addTab(ClickEvent e) {
        index++;
        dynamicTabs.add(newTabItem(index));
        dynamicTabs.setTabIndex(index - 1);
    }

    @UiHandler("setTabIndex")
    void setTabIndex(ClickEvent e) {
        tabSetIndex.setTabIndex(1);
    }

    @Override
    public void recalculateTabs() {
        tabBasic.reload();
        tabIntro.reload();
        tabSetIndex.reload();
        tabIcons.reload();
        tabIndicatorColor.reload();
        tabControlWidth.reload();
        tabEvents.reload();
        tabGetIndex.reload();
        tabFit.reload();
        dynamicTabs.reload();
    }

    protected void buildListTabIds() {
        lstTabIds.clear();
        for (int i = 1; i <= 3; i++) {
            lstTabIds.addItem("item" + i, "Tab Item" + i);
        }
    }

    protected void buildDynamicTab() {
        dynamicTabs.addSelectionHandler(selectionEvent -> MaterialToast.fireToast("Selected " + selectionEvent.getSelectedItem()));
        for (int i = 1; i <= 2; i++) {
            dynamicTabs.add(newTabItem(i));
            index = i;
        }
    }

    protected MaterialTabItem newTabItem(int index) {
        MaterialTabItem item = new MaterialTabItem();
        item.setWaves(WavesType.DEFAULT);
        MaterialLink link = new MaterialLink("Tab " + index);
        link.setTextColor(Color.WHITE);
        link.setHref("#dynamicTab" + index);
        item.add(link);
        MaterialLabel content = new MaterialLabel("Content " + index);
        content.setId("dynamicTab" + index);
        dynamicTabsRow.add(content);
        return item;
    }
}