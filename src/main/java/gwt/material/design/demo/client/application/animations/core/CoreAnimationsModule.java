package gwt.material.design.demo.client.application.animations.core;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CoreAnimationsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CoreAnimationsPresenter.class, CoreAnimationsPresenter.MyView.class, CoreAnimationsView.class, CoreAnimationsPresenter.MyProxy.class);
    }
}
