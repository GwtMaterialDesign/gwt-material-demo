package gwt.material.design.demo.client.application.addins.bubble;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class BubbleView extends ViewImpl implements BubblePresenter.MyView {
    interface Binder extends UiBinder<Widget, BubbleView> {
    }

    @Inject
    BubbleView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
