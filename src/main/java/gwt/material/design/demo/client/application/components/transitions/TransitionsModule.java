package gwt.material.design.demo.client.application.components.transitions;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TransitionsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TransitionsPresenter.class, TransitionsPresenter.MyView.class,
            TransitionsView.class, TransitionsPresenter.MyProxy.class);
    }
}
