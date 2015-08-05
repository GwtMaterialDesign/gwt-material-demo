package gwt.material.design.demo.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwt.material.design.demo.client.application.home.HomeModule;

public class ApplicationModule extends AbstractPresenterModule
{
    @Override
    protected void configure()
    {
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
