package gwt.material.design.demo.client.application.components.pushpin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PushPinModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PushPinPresenter.class, PushPinPresenter.MyView.class, PushPinView.class, PushPinPresenter.MyProxy.class);
    }
}
