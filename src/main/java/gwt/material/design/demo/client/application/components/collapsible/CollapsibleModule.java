package gwt.material.design.demo.client.application.components.collapsible;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CollapsibleModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CollapsiblePresenter.class, CollapsiblePresenter.MyView.class,
            CollapsibleView.class, CollapsiblePresenter.MyProxy.class);
    }
}
