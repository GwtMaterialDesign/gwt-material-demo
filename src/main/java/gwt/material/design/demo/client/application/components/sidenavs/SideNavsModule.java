package gwt.material.design.demo.client.application.components.sidenavs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SideNavsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SideNavsPresenter.class, SideNavsPresenter.MyView.class, SideNavsView.class, SideNavsPresenter.MyProxy.class);
    }
}
