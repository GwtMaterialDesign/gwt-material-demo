package gwt.material.design.demo.client.application.components.forms.listbox;

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


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.html.Option;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.Hero;

import javax.inject.Inject;

public class ListBoxView extends ViewImpl implements ListBoxPresenter.MyView {
    interface Binder extends UiBinder<Widget, ListBoxView> {
    }

    @UiField MaterialListBox lstOptions, lstSetValue, lstAddOptions, lstRemoveOptions, lstLazy, lstAllowBlank;

    @UiField
    MaterialListValueBox<Hero> lstValueBox, lstEmptyPlacehoder, lstFocusAndBlur;

    @UiField
    MaterialButton allowBlankSetValue;

    @UiField
    MaterialPanel testPanel;

    MaterialListBox listBox = new MaterialListBox();

    @Inject
    ListBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        generateAllowBlankItems(lstAllowBlank);

        buildListHeroes(lstValueBox);
        buildListHeroes(lstEmptyPlacehoder);

        lstFocusAndBlur.addFocusHandler(focusEvent -> MaterialToast.fireToast("Focus Event Fired"));
        lstFocusAndBlur.addBlurHandler(blurEvent -> MaterialToast.fireToast("Blur Event Fired"));
        buildListHeroes(lstFocusAndBlur);

        lstOptions.addFocusHandler(focusEvent -> {
            MaterialToast.fireToast("FOCUSED");
        });

        lstOptions.addBlurHandler(blurEvent -> {
            MaterialToast.fireToast("BLURRED");
        });

        lstOptions.addValueChangeHandler(valueChangeEvent -> {
            MaterialToast.fireToast(valueChangeEvent.getValue());
        });

        // given


        // when / then
        listBox.setValue(null);
        listBox.setAllowBlank(true);
        listBox.addItem("user1");
        listBox.addItem("user2");
        Option option = new Option("user3");
        listBox.add(option);
        testPanel.add(listBox);

       /* listBox.setValue("");
        assertEquals("", listBox.getValue());
        assertEquals(0, listBox.getSelectedIndex());

        listBox.setValue("user3");
        assertEquals("user3", listBox.getValue());
        assertEquals(3, listBox.getSelectedIndex());

        listBox.setValue(null);
        assertEquals("", listBox.getValue());
        assertEquals(0, listBox.getSelectedIndex());

        listBox.setValue("user4");
        assertEquals(4, listBox.getSelectedIndex());

        listBox.setAllowBlank(false);
        assertEquals(3, listBox.getItemCount());
        assertEquals("user1", listBox.getValue());
        assertEquals(0, listBox.getSelectedIndex());*/
    }

    @UiHandler("getValue")
    void getValue(ClickEvent e) {
        listBox.setValue("user3");
        MaterialToast.fireToast(listBox.getValue() + " VALUE");
        MaterialToast.fireToast(listBox.getSelectedIndex() + " INDEX");
    }

    protected void buildListHeroes(MaterialListValueBox<Hero> listBox) {
        listBox.addValueChangeHandler(valueChangeEvent -> MaterialToast.fireToast("VALUE [ " + valueChangeEvent.getValue().getName() + " ]"));
        for (Hero hero : DataHelper.getAllHeroes()) {
            listBox.addItem(hero, hero.getName());
        }
    }

    @UiHandler("cbAllowBlank")
    void allowBlank(ValueChangeEvent<Boolean> event) {
        allowBlankSetValue.setVisible(event.getValue());
        lstAllowBlank.setAllowBlank(event.getValue());
        generateAllowBlankItems(lstAllowBlank);
    }

    protected void generateAllowBlankItems(MaterialListBox listBox) {
        listBox.clear();
        for (int i = 1; i <= 5; i++) {
            listBox.addItem("Option " + i);
        }
        lstAllowBlank.reload();
    }

    @UiHandler("allowBlankGetValue")
    void allowBlankGetValue(ClickEvent e) {
        if (lstAllowBlank.getValue() == null || lstAllowBlank.getValue().isEmpty()) {
            MaterialToast.fireToast("Null");
        } else {
            MaterialToast.fireToast(lstAllowBlank.getValue());
        }
    }

    @UiHandler("allowBlankSetValue")
    void allowBlankSetValue(ClickEvent e) {
        lstAllowBlank.setValue(null);
    }

    @UiHandler("addItems")
    void onAddItems(ClickEvent e) {
        for (int i = 1; i <= 100; i++) {
            lstLazy.addItem("Item " + i, false);
        }
    }

    @UiHandler("reload")
    void reload(ClickEvent e) {
        lstLazy.reload();
    }

    @UiHandler("btnAddNewOption")
    void addOption(ClickEvent e) {
        lstAddOptions.addItem("Item added");
        lstAddOptions.setSelectedIndex(lstAddOptions.getItemCount() - 1);
    }

    @UiHandler("btnRemoveOption")
    void removeOption(ClickEvent e) {
        lstRemoveOptions.removeItem(0);
    }

    @UiHandler("lstOptions")
    void onChangeListBox(ValueChangeEvent<String> e) {
        MaterialToast.fireToast("Selected Index: " + lstOptions.getSelectedIndex());
    }

    @UiHandler("lstSetValue")
    void onListBoxSetValue(ValueChangeEvent<String> e) {
        MaterialToast.fireToast(e.getValue());
    }

    @UiHandler("btnListBoxValue")
    void onListBoxValue(ClickEvent e) {
        lstSetValue.setValue("Option 2");
    }

    @UiHandler("btnListBoxValueEvent")
    void onListBoxValueEvent(ClickEvent e) {
        lstSetValue.setValue("Option 3", true);
    }
}
