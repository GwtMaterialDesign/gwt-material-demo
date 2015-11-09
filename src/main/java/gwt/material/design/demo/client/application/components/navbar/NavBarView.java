package gwt.material.design.demo.client.application.components.navbar;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class NavBarView extends ViewImpl implements NavBarPresenter.MyView {
    interface Binder extends UiBinder<Widget, NavBarView> {
    }

    @Inject
    NavBarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
