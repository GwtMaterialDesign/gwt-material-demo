package gwt.material.design.demo.client.application.menu;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MenuModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindSingletonPresenterWidget(MenuPresenter.class, MenuPresenter.MyView.class, MenuView.class);
    }
}