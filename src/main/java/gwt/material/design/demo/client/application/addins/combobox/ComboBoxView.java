package gwt.material.design.demo.client.application.addins.combobox;

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
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.combobox.js.LanguageOptions;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.html.OptGroup;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.State;
import gwt.material.design.demo.client.application.dto.TimeZone;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class ComboBoxView extends ViewImpl implements ComboBoxPresenter.MyView {
    interface Binder extends UiBinder<Widget, ComboBoxView> {
    }

    @UiField
    MaterialComboBox<String> comboTimeZone, comboTimeZone1, comboTimeZone2, comboTimeZone3, comboTimeZone4,
                             comboTimeZone6, comboTimeZone7, comboTags, comboTagsMultiple, comboElements;

    @UiField
    MaterialComboBox<State> comboTimeZone8, comboTimeZone8_1, comboTimeZone9, comboTimeZone9_1, comboTimeZone10,
                                 comboTimeZone11, comboTimeZone12, comboTimeZone12_1, comboTimeZone13, comboTimeZone14,
                                 comboTimeZone15, comboTimeZone16, comboTimeZone17, comboCloseOnSelect, comboLanguge;

    @UiField
    MaterialComboBox<State> comboValue;

    @UiField
    MaterialDialog dialog;

    private int dynamicIndex = 1;

    @Inject
    ComboBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        populateTimeZones();
    }

    protected void populateTimeZones() {
        addStringItems(comboTimeZone);
        addStringItemsWithoutGroup(comboTimeZone1);
        addStringItemsWithoutGroup(comboTimeZone2);
        addStringItems(comboTimeZone3);
        addStringItems(comboTimeZone4);
        addStringItems(comboTimeZone6);
        addStringItems(comboTimeZone7);
        addStringItemsWithoutGroup(comboElements);
        addStateItems(comboTimeZone8);
        addStateItems(comboTimeZone8_1);
        addItemsWithoutGroup(comboTimeZone9);
        addItemsWithoutGroup(comboTimeZone9_1);
        addStateItems(comboTimeZone10);
        addStateItems(comboTimeZone11);
        addStateItems(comboTimeZone12);
        addStateItems(comboTimeZone12_1);
        addStateItems(comboTimeZone13);
        addStateItems(comboTimeZone14);
        addStateItems(comboTimeZone15);
        addStateItems(comboTimeZone17);
        addStateItems(comboValue);
        addItemsWithoutGroup(comboCloseOnSelect);
        addStringItems(comboTags);
        addStringItems(comboTagsMultiple);
        addStateItems(comboLanguge);

        comboTimeZone8.addValueChangeHandler(valueChangeEvent -> {
            MaterialToast.fireToast("Event: ValueChange State : " + comboTimeZone8.getSingleValue().getName() + " Value: " + comboTimeZone8.getSingleValue().getValue());
        });

        comboTimeZone8_1.addValueChangeHandler(valueChangeEvent -> {
            for(State state : comboTimeZone8_1.getSelectedValues()) {
                MaterialToast.fireToast("Event: ValueChange State : " + state.getName() + " Value: " + state.getValue());
            }
        });

        comboTimeZone9.addSelectionHandler(selectionEvent -> {
            MaterialToast.fireToast("Event: Select State : " + comboTimeZone9.getSingleValue().getName() + " Value: " +  comboTimeZone9.getSingleValue().getValue());
        });

        comboTimeZone9_1.addSelectionHandler(selectionEvent -> {
            for (State state : selectionEvent.getSelectedValues()) {
                MaterialToast.fireToast("Event: Select State : " + state.getName() + " Value: " + state.getValue());
            }
        });

        comboValue.addValueChangeHandler(valueChangeEvent -> {
            MaterialToast.fireToast("Value : " + comboValue.getSingleValue().getName());
        });

        comboTimeZone10.addOpenHandler(openEvent -> {
            MaterialToast.fireToast("Opened");
        });

        comboTimeZone10.addCloseHandler(closeEvent -> {
            MaterialToast.fireToast("Closed");
        });

        comboTimeZone11.addRemoveItemHandler(event -> {
            MaterialToast.fireToast("Removed: " + event.getSelectedValues());
        });

        comboElements.addOpenHandler(event -> {
            comboElements.scrollTop(0);
        });

        LanguageOptions languageOptions = new LanguageOptions();
        languageOptions.setNoResults(param1 -> "Walang Resulta...");
        languageOptions.setErrorLoading(param1 -> "May problema...");
        languageOptions.setInputTooLong(param1 -> "Ang inyong inilagay ay sobrang haba...");
        languageOptions.setInputTooShort(param1 -> "Ang inyong inilagay ay sobrang liit...");
        languageOptions.setLoadingMore(param1 -> "Nagloload pa...");
        languageOptions.setMaximumSelected(param1 -> "Maximum na ang inyong iniligay...");
        languageOptions.setSearching(param1 -> "Kasalukyang hinahanap...");
        comboLanguge.setLanguage(languageOptions);
    }

    protected void addStringItemsWithoutGroup(MaterialComboBox<String> box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            for(State s : tz.getStates()) {
                box.addItem(s.getName(), s.getValue());
            }
        }
    }

    protected void addItemsWithoutGroup(MaterialComboBox<State> box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            for(State s : tz.getStates()) {
                box.addItem(s.getName(), s);
            }
        }
    }

    protected void addStringItems(MaterialComboBox<String> box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            OptGroup optGroup = new OptGroup();
            optGroup.setLabel(tz.getName());
            for(State s : tz.getStates()) {
                box.addItem(s.getName(), s.getValue(), optGroup);
            }
            box.addGroup(optGroup);
        }
    }

    protected void addStateItems(MaterialComboBox<State> box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            OptGroup optGroup = new OptGroup();
            optGroup.setLabel(tz.getName());
            for(State s : tz.getStates()) {
                box.addItem(s.getName(), s, optGroup);
            }
            box.addGroup(optGroup);
        }
    }

    @UiHandler("swState")
    void onSwitchState(ValueChangeEvent<Boolean> e) {
        comboTimeZone6.setEnabled(e.getValue());
    }

    @UiHandler("btnGetValue")
    void onGetValue(ClickEvent e) {
        MaterialToast.fireToast(comboTimeZone12.getSingleValue().getName());
    }

    @UiHandler("btnGetValues")
    void onGetValues(ClickEvent e) {
        for(State state : comboTimeZone12_1.getSelectedValues()) {
            MaterialToast.fireToast("Name: " + state.getName() + " Value: " + state.getValue());
        }
    }

    @UiHandler("btnSetValue")
    void onSetCalifornia(ClickEvent e) {
        State california = comboTimeZone13.getValues().get(2);
        comboTimeZone13.setSingleValue(california);
    }

    @UiHandler("btnSetValues")
    void onSetValues(ClickEvent e) {
        List<State> states = new ArrayList<>();
        State california = comboTimeZone14.getValues().get(2);
        State alabama = comboTimeZone14.getValues().get(3);
        states.add(california);
        states.add(alabama);
        comboTimeZone14.setValues(states);
        comboTimeZone14.setEnabled(false);
    }

    @UiHandler("btnComboValue")
    void onClickComboValue(ClickEvent e) {
        comboValue.setSingleValue(comboValue.getValues().get(2), false);
    }

    @UiHandler("btnComboValueEvent")
    void onComboValueEvent(ClickEvent e) {
        comboValue.setSingleValue(comboValue.getValues().get(0), true);
    }

    @UiHandler("btnGetValue2")
    void onGetValue2(ClickEvent e) {
        MaterialToast.fireToast(comboTimeZone13.getSingleValue().getName());
    }

    @UiHandler("btnGetValues2")
    void onGetValues2(ClickEvent e) {
        for(State state : comboTimeZone14.getSelectedValues()) {
            MaterialToast.fireToast("Name: " + state.getName() + " Value: " + state.getValue());
        }
    }

    @UiHandler("btnOpen")
    void onOpen(ClickEvent e) {
        comboTimeZone15.open();
    }

    @UiHandler("btnClose")
    void onClose(ClickEvent e) {
        comboTimeZone15.close();
    }

    @UiHandler("btnAddOption")
    void onAddOption(ClickEvent e) {
        State newState = new State("Item " + dynamicIndex, "I" + dynamicIndex);
        comboTimeZone16.addItem(newState.getName(), newState);
        comboTimeZone16.setSingleValue(newState);
        dynamicIndex ++;
    }

    @UiHandler("btnOpenDialog")
    void onOpenDialog(ClickEvent e) {
        dialog.open();
    }

    @UiHandler("btnCloseDialog")
    void onCloseDialog(ClickEvent e) {
        dialog.close();
    }

    @UiHandler("btnTagMultiGetValue")
    void onTagMultiGetValue(ClickEvent e) {
        for (String value : comboTagsMultiple.getValue()) {
            MaterialToast.fireToast(value);
        }
    }

    @UiHandler("btnTagGetValue")
    void onTagGetValue(ClickEvent e) {
        MaterialToast.fireToast(comboTags.getSingleValue());
    }
}
