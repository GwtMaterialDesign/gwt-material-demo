package gwt.material.design.demo.client.application.components.datagrid;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DatagridModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DatagridPresenter.class, DatagridPresenter.MyView.class, DatagridView.class, DatagridPresenter.MyProxy.class);
    }
}
