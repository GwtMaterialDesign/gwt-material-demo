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


import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.html.OptGroup;
import gwt.material.design.client.ui.html.Option;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.State;
import gwt.material.design.demo.client.application.dto.TimeZone;

import javax.inject.Inject;


public class ComboBoxView extends ViewImpl implements ComboBoxPresenter.MyView {
    interface Binder extends UiBinder<Widget, ComboBoxView> {
    }

    @UiField
    MaterialComboBox comboTimeZone, comboTimeZone1, comboTimeZone2, comboTimeZone3, comboTimeZone4, comboTimeZone5, comboTimeZone6, comboTimeZone7, comboTimeZone8;

    @Inject
    ComboBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        populateTimeZones();
    }

    protected void populateTimeZones() {
        addItems(comboTimeZone);
        addItems(comboTimeZone1);
        addItems(comboTimeZone2);
        addItems(comboTimeZone3);
        addItems(comboTimeZone4);
        addItems(comboTimeZone5);
        addItems(comboTimeZone6);
        addItems(comboTimeZone7);
        addItems(comboTimeZone8);
    }

    protected void addItems(MaterialComboBox box) {
        for(TimeZone tz : DataHelper.getTimeZones()) {
            OptGroup optGroup = new OptGroup();
            optGroup.setLabel(tz.getName());
            for(State s : tz.getStates()) {
                Option option = new Option();
                option.setText(s.getName());
                optGroup.add(option);
            }
            box.add(optGroup);
        }
    }

    @UiHandler("swState")
    void onSwitchState(ValueChangeEvent<Boolean> e) {
        comboTimeZone6.setEnabled(e.getValue());
    }

}
