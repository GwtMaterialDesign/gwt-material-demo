package gwt.material.design.demo.client.application.style.helper;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class HelperModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(HelperPresenter.class, HelperPresenter.MyView.class, HelperView.class, HelperPresenter.MyProxy.class);
    }
}
