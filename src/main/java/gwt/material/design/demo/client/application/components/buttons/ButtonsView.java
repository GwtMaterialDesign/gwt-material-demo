package gwt.material.design.demo.client.application.components.buttons;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class ButtonsView extends ViewImpl implements ButtonsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ButtonsView> {
    }

    @UiField MaterialButton btnClick, btnHover, btnDoubleClick;

    @Inject
    ButtonsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnClick")
    void onClick(ClickEvent e) {
        MaterialToast.fireToast("Click Triggered");
        btnClick.setText("Clicked");
    }

    @UiHandler("btnHover")
    void onHover(MouseOverEvent e) {
        MaterialToast.fireToast("Hover Triggered");
        btnHover.setText("Hovered");
    }

    @UiHandler("btnDoubleClick")
    void onDoubleClick(DoubleClickEvent e) {
        MaterialToast.fireToast("Double Click Triggered");
        btnDoubleClick.setText("Double Clicked");
    }
}
