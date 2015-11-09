package gwt.material.design.demo.client.application.components.dialogs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DialogsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DialogsPresenter.class, DialogsPresenter.MyView.class,
            DialogsView.class, DialogsPresenter.MyProxy.class);
    }
}
