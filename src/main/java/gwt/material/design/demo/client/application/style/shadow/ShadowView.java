package gwt.material.design.demo.client.application.style.shadow;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ShadowView extends ViewImpl implements ShadowPresenter.MyView {
    interface Binder extends UiBinder<Widget, ShadowView> {
    }

    @Inject
    ShadowView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
