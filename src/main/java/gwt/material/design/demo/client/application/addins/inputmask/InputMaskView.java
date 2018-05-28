package gwt.material.design.demo.client.application.addins.inputmask;

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
import gwt.material.design.addins.client.inputmask.*;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;
import java.util.Date;


public class InputMaskView extends ViewImpl implements InputMaskPresenter.MyView {
    interface Binder extends UiBinder<Widget, InputMaskView> {
    }

    @UiField
    MaterialTextInputMask maskCleanValue, maskValue, unmask;

    @Inject
    InputMaskView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("maskString")
    void maskString(ValueChangeEvent<String> event) {
        MaterialToast.fireToast(event.getValue());
    }

    @UiField
    MaterialIntegerInputMask maskInteger;

    @UiField
    MaterialDoubleInputMask maskDouble;

    @UiField
    MaterialFloatInputMask maskFloat;

    @UiField
    MaterialLongInputMask maskLong;

    @UiField
    MaterialDateInputMask maskDate;

    @UiHandler("maskInteger")
    void maskInteger(ValueChangeEvent<Integer> event) {
        MaterialToast.fireToast(maskInteger.getValue() + "");
    }

    @UiHandler("maskDouble")
    void maskDouble(ValueChangeEvent<Double> event) {
        MaterialToast.fireToast(maskDouble.getValue().toString());
    }

    @UiHandler("maskFloat")
    void maskFloat(ValueChangeEvent<Float> event) {
        MaterialToast.fireToast(maskFloat.getValue().toString());
    }

    @UiHandler("maskLong")
    void maskLong(ValueChangeEvent<Long> event) {
        MaterialToast.fireToast(maskLong.getValue().toString());
    }

    @UiHandler("maskDate")
    void maskDate(ValueChangeEvent<Date> event) {
        MaterialToast.fireToast(maskDate.getValue().toString());
    }

    @UiHandler("btnGetCleanValue")
    void getCleanValue(ClickEvent e) {
        MaterialToast.fireToast(maskCleanValue.getCleanValue());
    }

    @UiHandler("btnGetValue")
    void getValue(ClickEvent e) {
        MaterialToast.fireToast(maskValue.getValue());
    }

    @UiHandler("btnUnmask")
    void unmask(ClickEvent e) {
        unmask.unload();
    }

    @UiHandler("btnMask")
    void mask(ClickEvent e) {
        unmask.load("000.000.000.000");
    }
}
