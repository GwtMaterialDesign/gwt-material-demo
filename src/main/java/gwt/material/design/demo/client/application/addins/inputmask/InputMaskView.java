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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.inputmask.MaterialInputMask;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class InputMaskView extends ViewImpl implements InputMaskPresenter.MyView {
    interface Binder extends UiBinder<Widget, InputMaskView> {
    }

    @UiField
    MaterialInputMask maskCleanValue, maskValue, unmask;

    @Inject
    InputMaskView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
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
        unmask.unmask();
    }

    @UiHandler("btnMask")
    void mask(ClickEvent e) {
        unmask.mask("000.000.000.000");
    }
}
