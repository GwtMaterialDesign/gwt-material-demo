package gwt.material.design.demo.client.application.addins.rating;

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
import gwt.material.design.addins.client.rating.MaterialRating;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class RatingView extends ViewImpl implements RatingPresenter.MyView {
    interface Binder extends UiBinder<Widget, RatingView> {
    }

    @UiField
    MaterialRating rateValue;

    @Inject
    RatingView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("rating")
    void onRate(ValueChangeEvent<Integer> event) {
        MaterialToast.fireToast(event.getValue() + " Rate value");
    }

    @UiHandler("rateValue")
    void onRateValue(ValueChangeEvent<Integer> e) {
        MaterialToast.fireToast("Value : " + e.getValue());
    }

    @UiHandler("btnRateValue")
    void onClickRateValue(ClickEvent e) {
        rateValue.setValue(2);
    }

    @UiHandler("btnRateValueEvent")
    void onClickRateValueEvent(ClickEvent e) {
        rateValue.setValue(4, true);
    }
}
