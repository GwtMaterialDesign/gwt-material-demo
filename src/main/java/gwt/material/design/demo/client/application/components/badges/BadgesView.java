package gwt.material.design.demo.client.application.components.badges;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class BadgesView extends ViewImpl implements BadgesPresenter.MyView {

    interface Binder extends UiBinder<Widget, BadgesView> {
    }

    @Inject
    BadgesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
