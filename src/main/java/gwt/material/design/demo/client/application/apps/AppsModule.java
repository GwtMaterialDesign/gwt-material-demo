package gwt.material.design.demo.client.application.apps;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class AppsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(AppsPresenter.class, AppsPresenter.MyView.class, AppsView.class, AppsPresenter.MyProxy.class);
    }
}
