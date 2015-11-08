package gwt.material.design.demo.client.application.components.footer;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class FooterView extends ViewImpl implements FooterPresenter.MyView {
    interface Binder extends UiBinder<Widget, FooterView> {
    }

    @Inject
    FooterView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
