package gwt.material.design.demo.client.application.components.forms.radiobutton;

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
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class RadioButtonView extends ViewImpl implements RadioButtonPresenter.MyView {
    interface Binder extends UiBinder<Widget, RadioButtonView> {
    }

    @UiField MaterialRadioButton radioValue;

    @Inject
    RadioButtonView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("radioValue")
    void onRadioValue(ValueChangeEvent<Boolean> e) {
        MaterialToast.fireToast("Value : " + e.getValue());
    }

    @UiHandler("btnRadioValue")
    void onClickRadioValue(ClickEvent e) {
        radioValue.setValue(true);
    }

    @UiHandler("btnRadioValueEvent")
    void onClickRadioValueEvent(ClickEvent e) {
        radioValue.setValue(false, true);
    }
}
