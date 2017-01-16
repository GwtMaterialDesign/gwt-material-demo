package gwt.material.design.demo.client.application.addins.countup;

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
import gwt.material.design.addins.client.countup.MaterialCountUp;
import gwt.material.design.client.ui.*;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;

public class CountUpView extends ViewImpl implements CountUpPresenter.MyView {
    interface Binder extends UiBinder<Widget, CountUpView> {
    }

    @UiField
    MaterialCountUp countUp;

    @UiField
    MaterialDoubleBox txtStart, txtEnd, txtDuration;

    @UiField
    MaterialIntegerBox txtDecimals;

    @UiField
    MaterialTextBox txtDecimal, txtSeparator, txtPrefix, txtSuffix;

    @UiField
    MaterialCheckBox cbCallback;

    @Inject
    CountUpView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnStart")
    void onStart(ClickEvent e) {
        countUp.setStartValue(txtStart.getValue());
        countUp.setEndValue(txtEnd.getValue());
        countUp.setDecimals(txtDecimals.getValue());
        countUp.setDuration(txtDuration.getValue());
        countUp.setDecimal(txtDecimal.getValue());
        countUp.setSeparator(txtSeparator.getValue());
        countUp.setPrefix(txtPrefix.getValue());
        countUp.setSuffix(txtSuffix.getValue());

        if (cbCallback.getValue()) {
           countUp.setCallback(() -> {
               MaterialToast.fireToast("Complete");
           });
        } else {
            countUp.setCallback(() -> {});
        }

        countUp.start();
    }

    @UiHandler("btnPauseResume")
    void onPauseResume(ClickEvent e) {
        countUp.pauseResume();
    }

    @UiHandler("btnReset")
    void onReset(ClickEvent e) {
        countUp.reset();
    }
}
