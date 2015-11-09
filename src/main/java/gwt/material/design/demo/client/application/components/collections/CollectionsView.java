package gwt.material.design.demo.client.application.components.collections;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class CollectionsView extends ViewImpl implements CollectionsPresenter.MyView {
    interface Binder extends UiBinder<Widget, CollectionsView> {
    }

    @Inject
    CollectionsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("collectWifi")
    void onWifi(ClickEvent e) {
        MaterialToast.fireToast("Wifi Network");
    }

    @UiHandler("collectBluetooth")
    void onBluetooth(ClickEvent e) {
        MaterialToast.fireToast("Bluetooth");
    }

    @UiHandler("collectData")
    void onData(ClickEvent e) {
        MaterialToast.fireToast("Data Usage");
    }
}
