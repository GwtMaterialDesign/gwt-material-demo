package gwt.material.design.demo.client.application.components.pickers;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;
import java.util.Date;

public class PickersView extends ViewImpl implements PickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, PickersView> {
    }

    @UiField
    MaterialDatePicker dp, dpFormat, dpLimit;

    @Inject
    PickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        dpLimit.setDateLimit(new Date(117, 0, 1), new Date(117, 0, 15));
    }

    @UiHandler("btnSetDate")
    void onSetDate(ClickEvent e){
        dp.setDate(new Date(116, 0,1));
    }

    @UiHandler("btnGetDate")
    void onGetDate(ClickEvent e){
        MaterialToast.fireToast("" + dp.getDate());
    }

    @UiHandler("btnSetFormat")
    void onDpFormat(ClickEvent e){
        dpFormat.setDate(new Date());
    }
}
