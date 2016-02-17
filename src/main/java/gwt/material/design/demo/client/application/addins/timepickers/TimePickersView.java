package gwt.material.design.demo.client.application.addins.timepickers;

import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.OpenHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialTimePicker;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class TimePickersView extends ViewImpl implements TimePickersPresenter.MyView {
    interface Binder extends UiBinder<Widget, TimePickersView> {
    }

    @UiField
    MaterialTimePicker tpEvents;

    @Inject
    TimePickersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        // Open Handler
        tpEvents.addOpenHandler(new OpenHandler<String>() {
            @Override
            public void onOpen(OpenEvent<String> event) {
                MaterialToast.fireToast("Opened Time Picker");
            }
        });
        // Close Handler
        tpEvents.addCloseHandler(new CloseHandler<String>() {
            @Override
            public void onClose(CloseEvent<String> event) {
                MaterialToast.fireToast("Closed Time Picker");
            }
        });
    }
}
