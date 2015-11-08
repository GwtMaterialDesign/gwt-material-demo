package gwt.material.design.demo.client.application.components.forms;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class FormsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(FormsPresenter.class, FormsPresenter.MyView.class,
            FormsView.class, FormsPresenter.MyProxy.class);
    }
}
