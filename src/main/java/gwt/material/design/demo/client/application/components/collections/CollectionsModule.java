package gwt.material.design.demo.client.application.components.collections;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CollectionsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CollectionsPresenter.class, CollectionsPresenter.MyView.class, CollectionsView.class, CollectionsPresenter.MyProxy.class);
    }
}
