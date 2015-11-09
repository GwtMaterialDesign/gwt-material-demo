package gwt.material.design.demo.client.application.components.badges;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class BadgesModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(BadgesPresenter.class, BadgesPresenter.MyView.class, BadgesView.class,
            BadgesPresenter.MyProxy.class);
    }
}
