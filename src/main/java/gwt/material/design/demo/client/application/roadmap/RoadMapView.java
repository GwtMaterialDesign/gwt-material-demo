package gwt.material.design.demo.client.application.roadmap;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class RoadMapView extends ViewImpl implements RoadMapPresenter.MyView {
    interface Binder extends UiBinder<Widget, RoadMapView> {
    }

    @Inject
    RoadMapView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
