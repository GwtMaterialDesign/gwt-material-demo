package gwt.material.design.demo.client.application.addins.camera;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.events.CameraCaptureEvent;
import gwt.material.design.addins.client.events.CameraCaptureHandler;
import gwt.material.design.addins.client.ui.MaterialCameraCapture;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class CameraView extends ViewImpl implements CameraPresenter.MyView {
    interface Binder extends UiBinder<Widget, CameraView> {
    }

    @Inject
    CameraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
