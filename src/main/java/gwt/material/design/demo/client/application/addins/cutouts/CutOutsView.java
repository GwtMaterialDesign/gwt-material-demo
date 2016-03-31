package gwt.material.design.demo.client.application.addins.cutouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.cutout.MaterialCutOut;
import gwt.material.design.client.ui.MaterialIcon;

import javax.inject.Inject;


public class CutOutsView extends ViewImpl implements CutOutsPresenter.MyView {
    interface Binder extends UiBinder<Widget, CutOutsView> {
    }

    @UiField
    MaterialCutOut cutout;

    @UiField
    MaterialIcon btnCutOut;

    @Inject
    CutOutsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnCutOut")
    void onCutOut(ClickEvent e){
        cutout.setTarget(btnCutOut);
        cutout.openCutOut();
    }

    @UiHandler("btnCutOutClose")
    void onClose(ClickEvent e){
        cutout.closeCutOut();
    }
}
