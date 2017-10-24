package gwt.material.design.demo.client.application.components.forms.checkbox;

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
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class CheckBoxView extends ViewImpl implements CheckBoxPresenter.MyView {
    interface Binder extends UiBinder<Widget, CheckBoxView> {
    }

    @UiField MaterialCheckBox cbBoxAll, cbBox, cbBlue, cbRed, cbCyan, cbGreen, cbBrown, cbValue;

    @Inject
    CheckBoxView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("cbBox")
    void onCheckBox(ValueChangeEvent<Boolean> e) {
        if(e.getValue()) {
            cbBox.setText("CheckBox 1: true");
        } else {
            cbBox.setText("CheckBox 1: false");
        }
    }

    @UiHandler("cbBoxAll")
    void onCheckAll(ValueChangeEvent<Boolean> e) {
        if(e.getValue()) {
            cbBlue.setValue(true);
            cbRed.setValue(true);
            cbCyan.setValue(true);
            cbGreen.setValue(true);
            cbBrown.setValue(true);
        } else {
            cbBlue.setValue(false);
            cbRed.setValue(false);
            cbCyan.setValue(false);
            cbGreen.setValue(false);
            cbBrown.setValue(false);
        }
    }

    @UiHandler("cbValue")
    void onCheckValue(ValueChangeEvent<Boolean> e) {
        MaterialToast.fireToast("Value : " + e.getValue());
    }

    @UiHandler("btnCbValue")
    void onClickCbValue(ClickEvent e) {
        cbValue.setValue(true);
    }

    @UiHandler("btnCbValueEvent")
    void onClickCbValueEvent(ClickEvent e) {
        cbValue.setValue(false, true);
    }
}
