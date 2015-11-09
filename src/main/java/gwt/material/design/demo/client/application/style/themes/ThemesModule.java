package gwt.material.design.demo.client.application.style.themes;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ThemesModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ThemesPresenter.class, ThemesPresenter.MyView.class,
            ThemesView.class, ThemesPresenter.MyProxy.class);
    }
}
