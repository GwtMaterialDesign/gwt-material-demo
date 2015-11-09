package gwt.material.design.demo.client.application.components.dropdown;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class DropdownView extends ViewImpl implements DropdownPresenter.MyView {
    interface Binder extends UiBinder<Widget, DropdownView> {
    }

    @Inject
    DropdownView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
