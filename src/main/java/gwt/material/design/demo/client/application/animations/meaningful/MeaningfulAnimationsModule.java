package gwt.material.design.demo.client.application.animations.meaningful;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MeaningfulAnimationsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MeaningfulAnimationsPresenter.class, MeaningfulAnimationsPresenter.MyView.class, MeaningfulAnimationsView.class, MeaningfulAnimationsPresenter.MyProxy.class);
    }
}
