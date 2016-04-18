package gwt.material.design.demo.client.application.components.pickers;

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
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;
import java.util.Date;

public class PickersView extends ViewImpl implements PickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, PickersView> {
    }

    @UiField
    MaterialDatePicker dp, dpFormat, dpLimit, dpClear, dpEvents;

    @Inject
    PickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        dpLimit.setDateMin(new Date(117, 0, 1));
        dpLimit.setDateMax(new Date(117, 0, 15));
        // Events on date picker
        dpEvents.addOpenHandler(new OpenHandler<MaterialDatePicker>() {
            @Override
            public void onOpen(OpenEvent<MaterialDatePicker> event) {
                if(event.getTarget().getValue() != null){
                    MaterialToast.fireToast("Opened Date Picker " + event.getTarget().getValue());
                }else{
                    MaterialToast.fireToast("Opened Date Picker" );
                }
            }
        });

        dpEvents.addCloseHandler(new CloseHandler<MaterialDatePicker>() {
            @Override
            public void onClose(CloseEvent<MaterialDatePicker> event) {
                MaterialToast.fireToast("Closed Date Picker with value " + event.getTarget().getValue());
            }
        });

        dpEvents.addValueChangeHandler(new ValueChangeHandler<Date>() {
            @Override
            public void onValueChange(ValueChangeEvent<Date> event) {
                MaterialToast.fireToast("Date Selected " + event.getValue());
            }
        });
    }

    @UiHandler("btnSetDate")
    void onSetDate(ClickEvent e){
        dp.setDate(new Date(116, 0,1));
    }

    @UiHandler("btnGetDate")
    void onGetDate(ClickEvent e){
        MaterialToast.fireToast("" + dp.getDate());
    }

    @UiHandler("btnSetFormat")
    void onDpFormat(ClickEvent e){
        dpFormat.setDate(new Date());
    }

    @UiHandler("btnClear")
    void onDpClear(ClickEvent e) { dpClear.clear(); }
}
