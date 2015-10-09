package gwt.material.design.demo.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwt.material.design.demo.client.application.about.AboutModule;
import gwt.material.design.demo.client.application.badges.BadgesModule;
import gwt.material.design.demo.client.application.buttons.ButtonsModule;
import gwt.material.design.demo.client.application.cards.CardsModule;
import gwt.material.design.demo.client.application.charts.ChartsModule;
import gwt.material.design.demo.client.application.header.HeaderModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class, ApplicationPresenter.MyProxy.class);

        install(new AboutModule());
        install(new BadgesModule());
        install(new ButtonsModule());
        install(new HeaderModule());
        install(new CardsModule());
        install(new ChartsModule());
    }
}
