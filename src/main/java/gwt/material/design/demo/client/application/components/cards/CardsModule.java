package gwt.material.design.demo.client.application.components.cards;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CardsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CardsPresenter.class, CardsPresenter.MyView.class,
            CardsView.class, CardsPresenter.MyProxy.class);
    }
}
