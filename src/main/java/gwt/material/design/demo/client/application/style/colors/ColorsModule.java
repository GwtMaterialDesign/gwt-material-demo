package gwt.material.design.demo.client.application.style.colors;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ColorsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ColorsPresenter.class, ColorsPresenter.MyView.class,
            ColorsView.class, ColorsPresenter.MyProxy.class);
    }
}
