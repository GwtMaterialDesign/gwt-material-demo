package gwt.material.design.demo.client.application.templates;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TemplatesModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TemplatesPresenter.class, TemplatesPresenter.MyView.class, TemplatesView.class, TemplatesPresenter.MyProxy.class);
    }
}
