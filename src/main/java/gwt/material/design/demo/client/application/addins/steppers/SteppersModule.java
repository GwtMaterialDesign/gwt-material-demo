package gwt.material.design.demo.client.application.addins.steppers;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SteppersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SteppersPresenter.class, SteppersPresenter.MyView.class, SteppersView.class, SteppersPresenter.MyProxy.class);
    }
}
