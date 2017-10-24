package gwt.material.design.demo.client.application.components.forms.range;

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
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRange;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class RangeView extends ViewImpl implements RangePresenter.MyView {
    interface Binder extends UiBinder<Widget, RangeView> {
    }

    @UiField MaterialLabel lblRange;
    @UiField MaterialRange range, rangeSetValue;

    @Inject
    RangeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("range")
    void onRange(ValueChangeEvent<Integer> e) {
        lblRange.setText("Value: " + e.getValue());
    }

    @UiHandler("rangeSetValue")
    void onRangeSetValue(ValueChangeEvent<Integer> e) {
        MaterialToast.fireToast("Value: " + rangeSetValue.getValue());
    }

    @UiHandler("btnRangeValue")
    void onRangeValue(ClickEvent e) {
        rangeSetValue.setValue(50);
    }

    @UiHandler("btnRangeValueEvent")
    void onRangeValueEvent(ClickEvent e) {
        rangeSetValue.setValue(20, true);
    }
}
