package gwt.material.design.demo.client.application.components.errors;

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
import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.addins.client.autocomplete.base.MaterialSuggestionOracle;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.timepicker.MaterialTimePicker;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class ErrorsView extends ViewImpl implements ErrorsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ErrorsView> {
    }

    @UiField
    MaterialAutoComplete acList;
    @UiField
    MaterialDatePicker dp;
    @UiField
    MaterialTimePicker tp;
    @UiField
    MaterialRange range;
    @UiField
    MaterialSwitch sw;
    @UiField
    MaterialTextArea txtArea;
    @UiField
    MaterialTextBox txtBox;
    @UiField
    MaterialTextBox txtBoxValidator;
    @UiField
    MaterialComboBox<String> combobox;

    @UiField
    MaterialTextBox txtBoxValidate;
    @UiField
    MaterialTextArea txtAreaValidate;
    @UiField
    MaterialIntegerBox intBoxValidate;
    @UiField
    MaterialDoubleBox doubleBoxValidate;
    @UiField
    MaterialFloatBox floatBoxValidate;
    @UiField
    MaterialLongBox longBoxValidate;
    @UiField
    MaterialDatePicker datePickerValidate;
    @UiField
    MaterialTimePicker timePickerValidate;
    @UiField
    MaterialListBox listbox;

    @Inject
    ErrorsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        acList.setSuggestions(getSimpleSuggestions());
        txtBoxValidator.addValidator(new EmailValidator());
    }

    private MaterialSuggestionOracle getSimpleSuggestions() {
        MaterialSuggestionOracle suggestions = new MaterialSuggestionOracle();
        suggestions.add("Alabama");
        suggestions.add("Alaska");
        suggestions.add("Arizona");
        suggestions.add("Arkansas");
        suggestions.add("California");
        suggestions.add("Colorado");
        suggestions.add("Connecticut");
        suggestions.add("Delaware");
        suggestions.add("Florida");
        suggestions.add("Georgia");
        suggestions.add("Hawaii");
        suggestions.add("Idaho");
        suggestions.add("Illinois");
        suggestions.add("Indiana");
        suggestions.add("Iowa");
        suggestions.add("Kansas");
        suggestions.add("Kentucky");
        suggestions.add("Louisiana");
        suggestions.add("Maine");
        suggestions.add("Maryland");
        suggestions.add("Massachusetts");
        suggestions.add("Michigan");
        suggestions.add("Minnesota");
        suggestions.add("Mississippi");
        suggestions.add("Missouri");
        suggestions.add("Montana");
        suggestions.add("Louisiana");
        return suggestions;
    }

    @UiHandler("btnValidateAll")
    void btnValidateAll(ClickEvent e) {
        txtBoxValidate.validate();
        txtAreaValidate.validate();
        intBoxValidate.validate();
        doubleBoxValidate.validate();
        longBoxValidate.validate();
        floatBoxValidate.validate();
        datePickerValidate.validate();
        timePickerValidate.validate();
    }

    @UiHandler("btnValidate")
    void btnValidateClick(ClickEvent e) {
        txtBoxValidator.validate();
    }

    @UiHandler("btnError")
    void onError(ClickEvent e) {
        acList.setErrorText("This is an error message for autocomplete.");
    }

    @UiHandler("btnSuccess")
    void onSuccess(ClickEvent e) {
        acList.setSuccessText("This is a success message for autocomplete");
    }

    @UiHandler("btnHelper")
    void onHelper(ClickEvent e) {
        acList.setHelperText("This is a helper text for autocomplete");
    }

    @UiHandler("btnClear")
    void onClear(ClickEvent e) {
        acList.clearStatusText();
    }

    @UiHandler("btnErrorDp")
    void onErrorDp(ClickEvent e) {
        dp.setErrorText("This is an error message for date picker.");
    }

    @UiHandler("btnSuccessDp")
    void onSuccessDp(ClickEvent e) {
        dp.setSuccessText("This is a success message for date picker.");
    }

    @UiHandler("btnHelperDp")
    void onHelperDp(ClickEvent e) {
        dp.setHelperText("This is a helper text for date picker.");
    }

    @UiHandler("btnClearDp")
    void onClearDp(ClickEvent e) {
        dp.clearStatusText();
    }

    @UiHandler("btnErrorRange")
    void onErrorRange(ClickEvent e) {
        range.setErrorText("This is an error message for range.");
    }

    @UiHandler("btnSuccessRange")
    void onSuccessRange(ClickEvent e) {
        range.setSuccessText("This is a success message for range.");
    }

    @UiHandler("btnHelperRange")
    void onHelperRange(ClickEvent e) {
        range.setHelperText("This is a helper text for range");
    }

    @UiHandler("btnClearRange")
    void onClearRange(ClickEvent e) {
        range.clearStatusText();
    }

    @UiHandler("btnErrorSwitch")
    void onErrorSwitch(ClickEvent e) {
        sw.setErrorText("This is an error message for switch.");
    }

    @UiHandler("btnSuccessSwitch")
    void onSuccessSwitch(ClickEvent e) {
        sw.setSuccessText("This is a success message for switch.");
    }

    @UiHandler("btnHelperSwitch")
    void onHelperSwitch(ClickEvent e) {
        sw.setHelperText("This is a helper text for switch");
    }

    @UiHandler("btnClearSwitch")
    void onClearSwitch(ClickEvent e) {
        sw.clearStatusText();
    }

    @UiHandler("btnErrorTxtArea")
    void onErrorTxtArea(ClickEvent e) {
        txtArea.setErrorText("This is an error message for text area.");
    }

    @UiHandler("btnSuccessTxtArea")
    void onSuccessTxtArea(ClickEvent e) {
        txtArea.setSuccessText("This is a success message text area.");
    }

    @UiHandler("btnHelperTxtArea")
    void onHelperTxtArea(ClickEvent e) {
        txtArea.setHelperText("This is a helper text for text area.");
    }

    @UiHandler("btnClearTxtArea")
    void onClearTxtArea(ClickEvent e) {
        txtArea.clearStatusText();
    }

    @UiHandler("btnErrorTxtBox")
    void onErrorTxtBox(ClickEvent e) {
        txtBox.setErrorText("This is an error message for text box.");
    }

    @UiHandler("btnSuccessTxtBox")
    void onSuccessTxtBox(ClickEvent e) {
        txtBox.setSuccessText("This is a success message for text box.");
    }

    @UiHandler("btnHelperTxtBox")
    void onHelperTxtBox(ClickEvent e) {
        txtBox.setHelperText("This is a helper text for text box.");
    }

    @UiHandler("btnClearTxtBox")
    void onClearTxtBox(ClickEvent e) {
        txtBox.clearStatusText();
    }

    @UiHandler("btnErrorTime")
    void onErrorTime(ClickEvent e) {
        tp.setErrorText("This is an error message for time picker.");
    }

    @UiHandler("btnSuccessTime")
    void onSuccessTime(ClickEvent e) {
        tp.setSuccessText("This is a success message for time picker.");
    }

    @UiHandler("btnHelperTime")
    void onHelperTime(ClickEvent e) {
        tp.setHelperText("This is a helper text for time picker.");
    }

    @UiHandler("btnClearTime")
    void onClearTime(ClickEvent e) {
        tp.clearStatusText();
    }

    @UiHandler("btnErrorComboBox")
    void onErrorComboBox(ClickEvent e) {
        combobox.setErrorText("This is an error message for ComboBox.");
    }

    @UiHandler("btnSuccessComboBox")
    void onSuccessComboBox(ClickEvent e) {
        combobox.setSuccessText("This is a success message for ComboBox.");
    }

    @UiHandler("btnHelperComboBox")
    void onHelperComboBox(ClickEvent e) {
        combobox.setHelperText("This is a helper text for ComboBox.");
    }

    @UiHandler("btnClearComboBox")
    void onClearComboBox(ClickEvent e) {
        combobox.clearStatusText();
    }

    @UiHandler("btnErrorListBox")
    void onErrorListBox(ClickEvent e) {
        listbox.setErrorText("This is an error message for ListBox.");
    }

    @UiHandler("btnSuccessListBox")
    void onSuccessListBox(ClickEvent e) {
        listbox.setSuccessText("This is a success message for ListBox.");
    }

    @UiHandler("btnHelperListBox")
    void onHelperListBox(ClickEvent e) {
        listbox.setHelperText("This is a helper text for ListBox.");
    }

    @UiHandler("btnClearListBox")
    void onClearListBox(ClickEvent e) {
        listbox.clearStatusText();
    }
}
