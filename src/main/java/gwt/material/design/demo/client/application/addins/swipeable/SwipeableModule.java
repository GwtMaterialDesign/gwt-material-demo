package gwt.material.design.demo.client.application.addins.swipeable;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SwipeableModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SwipeablePresenter.class, SwipeablePresenter.MyView.class, SwipeableView.class, SwipeablePresenter.MyProxy.class);
    }
}
