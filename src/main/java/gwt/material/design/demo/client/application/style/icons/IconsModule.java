package gwt.material.design.demo.client.application.style.icons;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class IconsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(IconsPresenter.class, IconsPresenter.MyView.class, IconsView.class, IconsPresenter.MyProxy.class);
    }
}
