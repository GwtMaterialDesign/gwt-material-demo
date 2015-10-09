package gwt.material.design.demo.client.application.charts;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ChartsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ChartsPresenter.class, ChartsPresenter.MyView.class, ChartsView.class, ChartsPresenter.MyProxy.class);
    }
}
