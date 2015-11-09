package gwt.material.design.demo.client.application.components.scrollspy;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ScrollspyModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ScrollspyPresenter.class, ScrollspyPresenter.MyView.class, ScrollspyView.class, ScrollspyPresenter.MyProxy.class);
    }
}
