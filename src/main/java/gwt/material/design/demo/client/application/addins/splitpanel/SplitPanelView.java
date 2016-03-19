package gwt.material.design.demo.client.application.addins.splitpanel;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class SplitPanelView extends ViewImpl implements SplitPanelPresenter.MyView {
    interface Binder extends UiBinder<Widget, SplitPanelView> {
    }

    @Inject
    SplitPanelView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
