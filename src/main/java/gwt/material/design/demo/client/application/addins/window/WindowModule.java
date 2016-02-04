package gwt.material.design.demo.client.application.addins.window;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class WindowModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(WindowPresenter.class, WindowPresenter.MyView.class, WindowView.class, WindowPresenter.MyProxy.class);
    }
}
