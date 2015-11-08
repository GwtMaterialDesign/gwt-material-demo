package gwt.material.design.demo.client.application.components.tabs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TabsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TabsPresenter.class, TabsPresenter.MyView.class,
            TabsView.class, TabsPresenter.MyProxy.class);
    }
}
