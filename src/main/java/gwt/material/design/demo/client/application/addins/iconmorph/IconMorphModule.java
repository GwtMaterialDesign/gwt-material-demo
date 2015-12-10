package gwt.material.design.demo.client.application.addins.iconmorph;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class IconMorphModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(IconMorphPresenter.class, IconMorphPresenter.MyView.class, IconMorphView.class, IconMorphPresenter.MyProxy.class);
    }
}
