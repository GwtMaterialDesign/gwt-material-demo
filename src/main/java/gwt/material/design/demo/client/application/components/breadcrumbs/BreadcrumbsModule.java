package gwt.material.design.demo.client.application.components.breadcrumbs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class BreadcrumbsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(BreadcrumbsPresenter.class, BreadcrumbsPresenter.MyView.class, BreadcrumbsView.class, BreadcrumbsPresenter.MyProxy.class);
    }
}
