package gwt.material.design.demo.client.application.addins.camera;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CameraModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CameraPresenter.class, CameraPresenter.MyView.class, CameraView.class, CameraPresenter.MyProxy.class);
    }
}
