package gwt.material.design.demo.client.application.components.dropdown;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DropdownModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DropdownPresenter.class, DropdownPresenter.MyView.class,
            DropdownView.class, DropdownPresenter.MyProxy.class);
    }
}
