package gwt.material.design.demo.client.application.addins.pathanimator;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PathAnimatorModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PathAnimatorPresenter.class, PathAnimatorPresenter.MyView.class, PathAnimatorView.class, PathAnimatorPresenter.MyProxy.class);
    }
}
