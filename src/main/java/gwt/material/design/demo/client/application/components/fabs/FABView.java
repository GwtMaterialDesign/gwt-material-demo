package gwt.material.design.demo.client.application.components.fabs;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialFAB;

import javax.inject.Inject;


public class FABView extends ViewImpl implements FABPresenter.MyView {
    interface Binder extends UiBinder<Widget, FABView> {
    }

    @UiField
    MaterialFAB fab;

    @Inject
    FABView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnOpen")
    void onOpen(ClickEvent e){
        fab.openFAB();
    }

    @UiHandler("btnClose")
    void onClose(ClickEvent e){
        fab.closeFAB();
    }
}
