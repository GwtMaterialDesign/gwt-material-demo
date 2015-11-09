package gwt.material.design.demo.client.application.components.navbar;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class NavBarModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(NavBarPresenter.class, NavBarPresenter.MyView.class,
            NavBarView.class, NavBarPresenter.MyProxy.class);
    }
}
