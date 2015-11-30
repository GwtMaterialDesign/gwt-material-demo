package gwt.material.design.demo.client.application.addins.cutouts;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CutOutsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CutOutsPresenter.class, CutOutsPresenter.MyView.class, CutOutsView.class, CutOutsPresenter.MyProxy.class);
    }
}
