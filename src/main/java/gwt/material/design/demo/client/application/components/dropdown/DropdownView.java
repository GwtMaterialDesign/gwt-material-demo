package gwt.material.design.demo.client.application.components.dropdown;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class DropdownView extends ViewImpl implements DropdownPresenter.MyView {
    interface Binder extends UiBinder<Widget, DropdownView> {
    }

    @Inject
    DropdownView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("dropdown")
    void onDropdown(SelectionEvent<Widget> callback){
        MaterialToast.fireToast("Selected : " + ((MaterialLink)callback.getSelectedItem()).getText());
    }

}
