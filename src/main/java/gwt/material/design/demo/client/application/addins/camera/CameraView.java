package gwt.material.design.demo.client.application.addins.camera;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class CameraView extends ViewImpl implements CameraPresenter.MyView {
    interface Binder extends UiBinder<Widget, CameraView> {
    }

    @Inject
    CameraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
