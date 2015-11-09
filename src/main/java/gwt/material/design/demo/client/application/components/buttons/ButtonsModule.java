package gwt.material.design.demo.client.application.components.buttons;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ButtonsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ButtonsPresenter.class, ButtonsPresenter.MyView.class,
            ButtonsView.class, ButtonsPresenter.MyProxy.class);
    }
}
