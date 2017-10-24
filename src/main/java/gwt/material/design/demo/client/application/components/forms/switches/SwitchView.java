package gwt.material.design.demo.client.application.components.forms.switches;

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

import javax.inject.Inject;

public class SwitchView extends ViewImpl implements SwitchPresenter.MyView {
    interface Binder extends UiBinder<Widget, SwitchView> {
    }

    @UiField MaterialSwitch switch1, switch2, switchSetValue;

    @Inject
    SwitchView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("switchEvent")
    void onSwitchEvent(ValueChangeEvent<Boolean> e) {
        MaterialToast.fireToast("Value " + e.getValue());
    }

    @UiHandler("btnSwitchValue")
    void onSwitchValue(ClickEvent e) {
        if (!switchSetValue.getValue()) {
            switchSetValue.setValue(true);
        } else {
            switchSetValue.setValue(false);
        }
    }

    @UiHandler("btnSwitchValueEvent")
    void onSwitchValueEvent(ClickEvent e) {
        if (!switchSetValue.getValue()) {
            switchSetValue.setValue(true, true);
        } else {
            switchSetValue.setValue(false, true);
        }
    }

    @UiHandler("switchSetValue")
    void onSwitchSetValue(ValueChangeEvent<Boolean> e) {
        MaterialToast.fireToast("Value " + e.getValue());
    }
}
