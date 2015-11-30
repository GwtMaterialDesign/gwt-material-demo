package gwt.material.design.demo.client.application.addins.timepickers;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class TimePickersView extends ViewImpl implements TimePickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, TimePickersView> {
    }

    @Inject
    TimePickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
