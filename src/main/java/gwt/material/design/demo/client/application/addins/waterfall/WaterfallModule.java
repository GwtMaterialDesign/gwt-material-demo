package gwt.material.design.demo.client.application.addins.waterfall;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class WaterfallModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(WaterfallPresenter.class, WaterfallPresenter.MyView.class, WaterfallView.class, WaterfallPresenter.MyProxy.class);
    }
}
