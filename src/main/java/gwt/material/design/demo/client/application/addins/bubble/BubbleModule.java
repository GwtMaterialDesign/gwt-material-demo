package gwt.material.design.demo.client.application.addins.bubble;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class BubbleModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(BubblePresenter.class, BubblePresenter.MyView.class, BubbleView.class, BubblePresenter.MyProxy.class);
    }
}
