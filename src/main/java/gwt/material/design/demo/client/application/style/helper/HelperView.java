package gwt.material.design.demo.client.application.style.helper;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class HelperView extends ViewImpl implements HelperPresenter.MyView {
    interface Binder extends UiBinder<Widget, HelperView> {
    }

    @Inject
    HelperView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
