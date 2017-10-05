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


import com.google.gwt.core.client.JsDate;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.DatePickerLanguage;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.html.Option;
import gwt.material.design.demo.client.application.dto.DataHelper;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PickersView extends ViewImpl implements PickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, PickersView> {
    }

    @UiField
    MaterialDatePicker dp, dpFormat, dpLimit, dpClear, dpEvents, dpTranslation, dpOpenClose, dpAutoClose, dpBirthdate, dpValue;

    @UiField
    MaterialListBox lstLanguage;

    private List<DatePickerLanguage> languages = new ArrayList<>();

    @Inject
    PickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        dpLimit.setDateMin(new Date(117, 0, 1));
        dpLimit.setDateMax(new Date(117, 0, 15));
        // Events on date picker
        dpEvents.addOpenHandler(event -> {
            if(event.getTarget().getValue() != null){
                MaterialToast.fireToast("Opened Date Picker " + event.getTarget().getValue());
            }else{
                MaterialToast.fireToast("Opened Date Picker" );
            }
        });
        dpEvents.addCloseHandler(event -> MaterialToast.fireToast("Closed Date Picker with value " + event.getTarget().getValue()));
        dpEvents.addValueChangeHandler(event -> MaterialToast.fireToast("Date Selected " + event.getValue()));

        dpOpenClose.addOpenHandler(event -> {
            if(event.getTarget().getValue() != null){
                MaterialToast.fireToast("Opened Date Picker " + event.getTarget().getValue());
            } else {
                MaterialToast.fireToast("Opened Date Picker" );
            }
        });
        dpOpenClose.addCloseHandler(event -> MaterialToast.fireToast("Closed Date Picker with value " + event.getTarget().getValue()));
        dpOpenClose.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Date Selected " + event.getValue());
            dpOpenClose.close();
        });

        dpAutoClose.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Date Selected " + event.getValue());
        });

        dpBirthdate.setDate(new Date(50, 1, 1));

        initLanguage();
    }

    private void initLanguage() {
        for(DatePickerLanguage lang : DataHelper.getAllDateLanguage()) {
            languages.add(lang);
            lstLanguage.add(new Option(lang.getName()));
        }
    }

    @UiHandler("lstLanguage")
    void onChange(ValueChangeEvent<String> event) {
        DatePickerLanguage lang = languages.get(lstLanguage.getSelectedIndex());
        dpTranslation.setLanguage(lang);
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

    @UiHandler("btnGetValue")
    void onDpGetValue(ClickEvent e) {
        MaterialToast.fireToast(dpClear.getValue() + "");
    }

    @UiHandler("btnOpen")
    void onOpen(ClickEvent e) {
        dpOpenClose.open();
    }

    @UiHandler("dpValue")
    void onDpValueChange(ValueChangeEvent<Date> e) {
        MaterialToast.fireToast(e.getValue() + "");
    }

    @UiHandler("btnDpValue")
    void onDpValue(ClickEvent e) {
        //dpValue.setValue(new Date());
        dpValue.setValue(new Date(), false);
        Long l = new Date().getTime();
        l = l - 2592000000L;      //1 Months in Milliseconds = 2592000000
        Date dd = new Date();
        dd.setTime(l);
        dpValue.setPickerDate(JsDate.create(dd.getTime()), dpValue.getDateInput().getElement());
    }

    @UiHandler("btnDpValueEvent")
    void onDpValueEvent(ClickEvent e) {
        Date date = new Date(123,1,1);
        dpValue.setValue(date, true);
    }
}
