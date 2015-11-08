package gwt.material.design.demo.client.application.components.pickers;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class PickersView extends ViewImpl implements PickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, PickersView> {
    }

    @Inject
    PickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
