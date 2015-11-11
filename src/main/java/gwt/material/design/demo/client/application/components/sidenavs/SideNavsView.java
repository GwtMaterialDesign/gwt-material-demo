package gwt.material.design.demo.client.application.components.sidenavs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class SideNavsView extends ViewImpl implements SideNavsPresenter.MyView {
    interface Binder extends UiBinder<Widget, SideNavsView> {
    }

    @Inject
    SideNavsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
