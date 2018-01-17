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
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialListValueBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.Hero;

import javax.inject.Inject;

public class ListBoxView extends ViewImpl implements ListBoxPresenter.MyView {
    interface Binder extends UiBinder<Widget, ListBoxView> {
    }

    @UiField
    MaterialListBox lstOptions, lstSetValue, lstAddOptions, lstRemoveOptions, lstLazy;

    @UiField
    MaterialListValueBox<Hero> lstValueBox, lstValueBoxMultiple, lstEmptyPlacehoder, lstFocusAndBlur;

    @Inject
    ListBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        buildListHeroes(lstValueBoxMultiple);
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
    }

    protected void buildListHeroes(MaterialListValueBox<Hero> listBox) {
        listBox.addValueChangeHandler(valueChangeEvent -> MaterialToast.fireToast("VALUE [ " + valueChangeEvent.getValue().getName() + " ]"));
        for (Hero hero : DataHelper.getAllHeroes()) {
            listBox.addItem(hero, hero.getName());
        }
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
