package gwt.material.design.demo.client.application.components.loader;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class LoaderModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(LoaderPresenter.class, LoaderPresenter.MyView.class,
            LoaderView.class, LoaderPresenter.MyProxy.class);
    }
}
