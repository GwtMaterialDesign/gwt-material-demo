package gwt.material.design.demo.client.application.components.chips;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ChipsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ChipsPresenter.class, ChipsPresenter.MyView.class,
            ChipsView.class, ChipsPresenter.MyProxy.class);
    }
}
