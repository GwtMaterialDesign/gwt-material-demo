package gwt.material.design.demo.client.application.addins.camera;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class CameraPresenter extends Presenter<CameraPresenter.MyView, CameraPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.camera)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<CameraPresenter> {
    }

    @Inject
    CameraPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Camera Capture", "MaterialCameraCapture is a widget that captures the video stream from the camera, using the MediaDevices.getUserMedia() (Streams API). This widget can capture images from the video, to allow the upload to the server of photos from the camera.", this);
    }
}
