package gwt.material.design.demo.client.application.addins.swipeable;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.events.SwipeLeftEvent;
import gwt.material.design.addins.client.events.SwipeRightEvent;
import gwt.material.design.addins.client.ui.MaterialSwipeablePanel;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class SwipeableView extends ViewImpl implements SwipeablePresenter.MyView {
    interface Binder extends UiBinder<Widget, SwipeableView> {
    }

    @UiField
    MaterialSwipeablePanel swipeablePanel, swipeableDisablePanel;

    @UiField
    MaterialLabel item2, item3;

    @Inject
    SwipeableView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        swipeableDisablePanel.setDisable(item2, item3);
    }

    @UiHandler("swipeablePanel")
    void onSwipeRight(SwipeRightEvent<Widget> e) {
        MaterialLabel label = (MaterialLabel) e.getTarget();
        MaterialToast.fireToast(label.getText() + " swiped right");
    }

    @UiHandler("swipeablePanel")
    void onSwipeLeft(SwipeLeftEvent<Widget> e) {
        MaterialLabel label = (MaterialLabel) e.getTarget();
        MaterialToast.fireToast(label.getText() + " swiped left");
    }

}
