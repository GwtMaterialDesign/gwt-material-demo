package gwt.material.design.demo.client.application.addins.menubar;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class MenuBarView extends ViewImpl implements MenuBarPresenter.MyView {
    interface Binder extends UiBinder<Widget, MenuBarView> {
    }

    @Inject
    MenuBarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
