package gwt.material.design.demo.client.application.addins.splitpanel;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SplitPanelModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SplitPanelPresenter.class, SplitPanelPresenter.MyView.class, SplitPanelView.class, SplitPanelPresenter.MyProxy.class);
    }
}
