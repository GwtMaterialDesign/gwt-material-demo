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

    @UiField
    MaterialCameraCapture camera;

    @UiField
    MaterialImage imgCapture;

    @Inject
    CameraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        if (MaterialCameraCapture.isSupported()){
            camera.addCameraCaptureHandler(new CameraCaptureHandler() {
                @Override
                public void onCameraCaptureChange(CameraCaptureEvent event) {
                    if (event.getCaptureStatus() == CameraCaptureEvent.CaptureStatus.ERRORED){
                        MaterialToast.fireToast("Error on starting the camera capture: " + event.getErrorMessage());
                        ((MaterialCameraCapture)event.getSource()).removeFromParent();
                    }else{
                        MaterialToast.fireToast("Camera Captured");
                    }
                }
            });
        }else {
            MaterialToast.fireToast("Sorry, your browser doesn't support the camera capture.");
        }
    }

    @UiHandler("btnCapture")
    void onCapture(ClickEvent e) {
        imgCapture.setUrl(camera.captureToDataURL());
    }
}
