package gwt.material.design.demo.client.application.components.autocomplete;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class AutoCompleteModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(AutoCompletePresenter.class, AutoCompletePresenter.MyView.class, AutoCompleteView.class, AutoCompletePresenter.MyProxy.class);
    }
}
