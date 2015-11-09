package gwt.material.design.demo.client.application.components.footer;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class FooterModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(FooterPresenter.class, FooterPresenter.MyView.class,
            FooterView.class, FooterPresenter.MyProxy.class);
    }
}
