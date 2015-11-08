package gwt.material.design.demo.client.application.style.colors;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ColorsView extends ViewImpl implements ColorsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ColorsView> {
    }

    @Inject
    ColorsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
