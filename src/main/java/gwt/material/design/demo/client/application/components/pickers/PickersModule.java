package gwt.material.design.demo.client.application.components.pickers;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PickersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PickersPresenter.class, PickersPresenter.MyView.class,
            PickersView.class, PickersPresenter.MyProxy.class);
    }
}
