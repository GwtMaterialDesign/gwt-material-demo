package gwt.material.design.demo.client.application.style.grid;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GridModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(GridPresenter.class, GridPresenter.MyView.class, GridView.class, GridPresenter.MyProxy.class);
    }
}
