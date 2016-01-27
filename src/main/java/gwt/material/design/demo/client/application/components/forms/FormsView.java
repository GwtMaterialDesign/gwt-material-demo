package gwt.material.design.demo.client.application.components.forms;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class FormsView extends ViewImpl implements FormsPresenter.MyView {
    interface Binder extends UiBinder<Widget, FormsView> {
    }

    @UiField MaterialListBox lstOptions;
    @UiField MaterialCheckBox cbBoxAll, cbBox, cbBlue, cbRed, cbCyan, cbGreen, cbBrown;

    @UiField MaterialSwitch switch1, switch2;
    @UiField MaterialLabel lblRange;
    @UiField MaterialRange range;

    @UiField MaterialFloatBox txtFloatBox;
    @UiField MaterialIntegerBox txtIntegerBox;
    @UiField MaterialDoubleBox txtDoubleBox;
    @UiField MaterialLongBox txtLongBox;

    @Inject
    FormsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        txtFloatBox.setValue(1000.25f);
        txtIntegerBox.setValue(10);
        txtDoubleBox.setValue(9999.90);
        txtLongBox.setValue((long) 1000.00);
    }

    @UiHandler("lstOptions")
    void onChangeListBox(ValueChangeEvent<String> e) {
        MaterialToast.fireToast("Selected Index: " + lstOptions.getSelectedIndex());
    }

    @UiHandler("cbBox")
    void onCheckBox(ClickEvent e) {
        if(cbBox.getValue()) {
            cbBox.setText("CheckBox 1: true");
        } else {
            cbBox.setText("CheckBox 1: false");
        }
    }

    @UiHandler("cbBoxAll")
    void onCheckAll(ClickEvent e) {
        if(cbBoxAll.getValue()) {
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

    @UiHandler("range")
    void onRange(ChangeEvent e) {
        lblRange.setText("Value: " + String.valueOf(range.getValue()));
    }
}
