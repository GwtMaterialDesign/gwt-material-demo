package gwt.material.design.demo.client.application.components.search;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SearchModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SearchPresenter.class, SearchPresenter.MyView.class,
            SearchView.class, SearchPresenter.MyProxy.class);
    }
}
