package gwt.material.design.demo.client.application.components.media;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MediaModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MediaPresenter.class, MediaPresenter.MyView.class,
            MediaView.class, MediaPresenter.MyProxy.class);
    }
}
