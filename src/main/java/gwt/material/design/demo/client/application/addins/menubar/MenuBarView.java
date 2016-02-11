package gwt.material.design.demo.client.application.addins.menubar;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class MenuBarView extends ViewImpl implements MenuBarPresenter.MyView {
    interface Binder extends UiBinder<Widget, MenuBarView> {
    }

    @UiField
    MaterialDropDown dpMode;

    @Inject
    MenuBarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler({"dpFile", "dpNew", "dpView", "dpEdit", "dpFormat"})
    void onSelectionFileDropdown(SelectionEvent<Widget> selection) {
        if(selection.getSelectedItem() instanceof MaterialLink){
            MaterialToast.fireToast("Triggered : " + ((MaterialLink)selection.getSelectedItem()).getText());
        }else if(selection.getSelectedItem() instanceof MaterialCheckBox){
            MaterialToast.fireToast("Checked : " + ((MaterialCheckBox)selection.getSelectedItem()).getText());
        }
    }

    @UiHandler("dpMode")
    void onSelectionMode(SelectionEvent<Widget> selection) {
        for(Widget w : dpMode.getItems()){
            if(w instanceof MaterialCheckBox){
                ((MaterialCheckBox) w).setValue(false);
            }
        }
        if(selection.getSelectedItem() instanceof MaterialCheckBox){
            ((MaterialCheckBox) selection.getSelectedItem()).setValue(true);
            MaterialToast.fireToast("Checked : " + ((MaterialCheckBox) selection.getSelectedItem()).getText());
        }
    }

    @UiHandler("btnNew")
    void onNew(ClickEvent e){
        e.stopPropagation();
    }
}
