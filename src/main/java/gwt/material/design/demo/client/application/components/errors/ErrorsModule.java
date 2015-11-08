package gwt.material.design.demo.client.application.components.errors;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ErrorsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ErrorsPresenter.class, ErrorsPresenter.MyView.class,
            ErrorsView.class, ErrorsPresenter.MyProxy.class);
    }
}
