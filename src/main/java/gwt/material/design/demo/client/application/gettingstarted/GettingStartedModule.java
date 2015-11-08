package gwt.material.design.demo.client.application.gettingstarted;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GettingStartedModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(GettingStartedPresenter.class, GettingStartedPresenter.MyView.class,
            GettingStartedView.class, GettingStartedPresenter.MyProxy.class);
    }
}
