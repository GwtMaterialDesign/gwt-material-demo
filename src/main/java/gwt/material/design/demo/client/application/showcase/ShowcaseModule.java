package gwt.material.design.demo.client.application.showcase;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ShowcaseModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ShowcasePresenter.class, ShowcasePresenter.MyView.class,
            ShowcaseView.class, ShowcasePresenter.MyProxy.class);
    }
}
