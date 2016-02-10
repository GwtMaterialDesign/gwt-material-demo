package gwt.material.design.demo.client.application.addins.menubar;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MenuBarModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MenuBarPresenter.class, MenuBarPresenter.MyView.class, MenuBarView.class, MenuBarPresenter.MyProxy.class);
    }
}
