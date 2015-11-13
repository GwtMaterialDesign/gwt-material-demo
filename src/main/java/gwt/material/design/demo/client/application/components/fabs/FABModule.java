package gwt.material.design.demo.client.application.components.fabs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class FABModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(FABPresenter.class, FABPresenter.MyView.class, FABView.class, FABPresenter.MyProxy.class);
    }
}
