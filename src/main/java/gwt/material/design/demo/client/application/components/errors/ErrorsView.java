package gwt.material.design.demo.client.application.components.errors;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialSuggestionOracle;
import gwt.material.design.client.ui.MaterialAutoComplete;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialRange;
import gwt.material.design.client.ui.MaterialSwitch;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialTimePicker;

import javax.inject.Inject;

public class ErrorsView extends ViewImpl implements ErrorsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ErrorsView> {
    }

    @UiField MaterialAutoComplete acList;
    @UiField MaterialDatePicker dp;
    @UiField MaterialTimePicker tp;
    @UiField MaterialRange range;
    @UiField MaterialSwitch sw;
    @UiField MaterialTextArea txtArea;
    @UiField MaterialTextBox txtBox;

    @Inject
    ErrorsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        acList.setSuggestions(getSimpleSuggestions());
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

    @UiHandler("btnError")
    void onError(ClickEvent e) {
        acList.setError("This is an error message for autocomplete.");
    }

    @UiHandler("btnSuccess")
    void onSuccess(ClickEvent e) {
        acList.setSuccess("This is a success message for autocomplete");
    }

    @UiHandler("btnClear")
    void onClear(ClickEvent e) {
        acList.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorDp")
    void onErrorDp(ClickEvent e) {
        dp.setError("This is an error message for date picker.");
    }

    @UiHandler("btnSuccessDp")
    void onSuccessDp(ClickEvent e) {
        dp.setSuccess("This is a success message for date picker.");
    }

    @UiHandler("btnClearDp")
    void onClearDp(ClickEvent e) {
        dp.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorRange")
    void onErrorRange(ClickEvent e) {
        range.setError("This is an error message for range.");
    }

    @UiHandler("btnSuccessRange")
    void onSuccessRange(ClickEvent e) {
        range.setSuccess("This is a success message for range.");
    }

    @UiHandler("btnClearRange")
    void onClearRange(ClickEvent e) {
        range.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorSwitch")
    void onErrorSwitch(ClickEvent e) {
        sw.setError("This is an error message for switch.");
    }

    @UiHandler("btnSuccessSwitch")
    void onSuccessSwitch(ClickEvent e) {
        sw.setSuccess("This is a success message for switch.");
    }

    @UiHandler("btnClearSwitch")
    void onClearSwitch(ClickEvent e) {
        sw.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorTxtArea")
    void onErrorTxtArea(ClickEvent e) {
        txtArea.setError("This is an error message for text area.");
    }

    @UiHandler("btnSuccessTxtArea")
    void onSuccessTxtArea(ClickEvent e) {
        txtArea.setSuccess("This is a success message text area.");
    }

    @UiHandler("btnClearTxtArea")
    void onClearTxtArea(ClickEvent e) {
        txtArea.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorTxtBox")
    void onErrorTxtBox(ClickEvent e) {
        txtBox.setError("This is an error message for text box.");
    }

    @UiHandler("btnSuccessTxtBox")
    void onSuccessTxtBox(ClickEvent e) {
        txtBox.setSuccess("This is a success message for text box.");
    }

    @UiHandler("btnClearTxtBox")
    void onClearTxtBox(ClickEvent e) {
        txtBox.clearErrorOrSuccess();
    }

    @UiHandler("btnErrorTime")
    void onErrorTime(ClickEvent e) {
        tp.setError("This is an error message for time picker.");
    }

    @UiHandler("btnSuccessTime")
    void onSuccessTime(ClickEvent e) {
        tp.setSuccess("This is a success message for time picker.");
    }

    @UiHandler("btnClearTime")
    void onClearTime(ClickEvent e) {
        tp.clearErrorOrSuccess();
    }
}
