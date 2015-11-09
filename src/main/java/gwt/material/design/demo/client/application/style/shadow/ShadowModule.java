package gwt.material.design.demo.client.application.style.shadow;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ShadowModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ShadowPresenter.class, ShadowPresenter.MyView.class, ShadowView.class, ShadowPresenter.MyProxy.class);
    }
}
