package gwt.material.design.demo.client.application.roadmap;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class RoadMapModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(RoadMapPresenter.class, RoadMapPresenter.MyView.class, RoadMapView.class, RoadMapPresenter.MyProxy.class);
    }
}
