package gwt.material.design.demo.client.application.components.subheaders;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SubHeadersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SubHeadersPresenter.class, SubHeadersPresenter.MyView.class, SubHeadersView.class, SubHeadersPresenter.MyProxy.class);
    }
}
