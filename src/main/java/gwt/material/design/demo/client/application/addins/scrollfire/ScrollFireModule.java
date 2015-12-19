package gwt.material.design.demo.client.application.addins.scrollfire;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ScrollFireModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ScrollFirePresenter.class, ScrollFirePresenter.MyView.class, ScrollFireView.class, ScrollFirePresenter.MyProxy.class);
    }
}
