package gwt.material.design.demo.client.application.addins.dnd;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DndModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DndPresenter.class, DndPresenter.MyView.class, DndView.class, DndPresenter.MyProxy.class);
    }
}
