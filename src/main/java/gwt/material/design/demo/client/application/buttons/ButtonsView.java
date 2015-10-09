package gwt.material.design.demo.client.application.buttons;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class ButtonsView extends ViewImpl implements ButtonsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ButtonsView> {
    }

    @Inject
    ButtonsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
