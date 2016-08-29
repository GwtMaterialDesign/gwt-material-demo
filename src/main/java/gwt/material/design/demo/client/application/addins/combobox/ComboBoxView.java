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
import gwt.material.design.client.ui.MaterialModal;
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
    MaterialComboBox comboTimeZone, comboTimeZone1, comboTimeZone2, comboTimeZone3, comboTimeZone4, comboTimeZone6, comboTimeZone7;

    @UiField
    MaterialComboBox<State> comboTimeZone8, comboTimeZone8_1, comboTimeZone9, comboTimeZone9_1, comboTimeZone10, comboTimeZone11, comboTimeZone12, comboTimeZone12_1, comboTimeZone13, comboTimeZone14, comboTimeZone15, comboTimeZone16, comboTimeZone17;

    @UiField
    MaterialModal modal;

    private int dynamicIndex = 1;

    @Inject
    ComboBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        populateTimeZones();
    }

    protected void populateTimeZones() {
        addItems(comboTimeZone);
        addItemsWithoutGroup(comboTimeZone1);
        addItemsWithoutGroup(comboTimeZone2);
        addItems(comboTimeZone3);
        addItems(comboTimeZone4);
        addItems(comboTimeZone6);
        addItems(comboTimeZone7);
        addItems(comboTimeZone8);
        addItems(comboTimeZone8_1);
        addItemsWithoutGroup(comboTimeZone9);
        addItemsWithoutGroup(comboTimeZone9_1);
        addItems(comboTimeZone10);
        addItems(comboTimeZone11);
        addItems(comboTimeZone12);
        addItems(comboTimeZone12_1);
        addItems(comboTimeZone13);
        addItems(comboTimeZone14);
        addItems(comboTimeZone15);
        addItems(comboTimeZone17);

        comboTimeZone8.addValueChangeHandler(valueChangeEvent -> {
            MaterialToast.fireToast("Event: ValueChange State : " + valueChangeEvent.getValue().getName() + " Value: " + valueChangeEvent.getValue().getValue());
        });

        comboTimeZone8_1.addValueChangeHandler(valueChangeEvent -> {
            for(State state : comboTimeZone8_1.getSelectedValues()) {
                MaterialToast.fireToast("Event: ValueChange State : " + state.getName() + " Value: " + state.getValue());
            }
        });

        comboTimeZone9.addValueChangeHandler(valueChangeEvent -> {
            MaterialToast.fireToast("Event: Select State : " + valueChangeEvent.getValue().getName() + " Value: " + valueChangeEvent.getValue().getValue());
        });

        comboTimeZone9_1.addValueChangeHandler(valueChangeEvent -> {
            for(State state : comboTimeZone9_1.getSelectedValues()) {
                MaterialToast.fireToast("Event: ValueChange State : " + state.getName() + " Value: " + state.getValue());
            }
        });

        comboTimeZone10.addOpenHandler(openEvent -> {
            MaterialToast.fireToast("Opened");
        });

        comboTimeZone10.addCloseHandler(closeEvent -> {
            MaterialToast.fireToast("Closed");
        });

        comboTimeZone11.addRemoveItemHandler(event -> {
            MaterialToast.fireToast("Removed: " + event.getTarget().getName());
        });
    }

    protected void addItemsWithoutGroup(MaterialComboBox box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            for(State s : tz.getStates()) {
                box.addValue(s.getName(), s);
            }
        }
    }

    protected void addItems(MaterialComboBox box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            OptGroup optGroup = new OptGroup();
            optGroup.setLabel(tz.getName());
            for(State s : tz.getStates()) {
                box.addValue(s.getName(), s, optGroup);
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
        MaterialToast.fireToast(comboTimeZone12.getSelectedValue().getName());
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
        comboTimeZone13.setValue(california);
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

    @UiHandler("btnGetValue2")
    void onGetValue2(ClickEvent e) {
        MaterialToast.fireToast(comboTimeZone13.getSelectedValue().getName());
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
        comboTimeZone16.addValue(newState.getName(), newState);
        comboTimeZone16.initialize();
        comboTimeZone16.setValue(newState);
        dynamicIndex ++;
    }

    @UiHandler("btnOpenModal")
    void onOpenModal(ClickEvent e) {
        modal.open();
    }

    @UiHandler("btnCloseModal")
    void onCloseModal(ClickEvent e) {
        modal.close();
    }
}
