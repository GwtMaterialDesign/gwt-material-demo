package gwt.material.design.demo.client.application.addins.masonry;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MasonryModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MasonryPresenter.class, MasonryPresenter.MyView.class, MasonryView.class, MasonryPresenter.MyProxy.class);
    }
}
