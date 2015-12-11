package gwt.material.design.demo.client.application.components.pushpin;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialPushpin;

import javax.inject.Inject;


public class PushPinView extends ViewImpl implements PushPinPresenter.MyView {
    interface Binder extends UiBinder<Widget, PushPinView> {
    }

    @UiField
    MaterialPanel source, target;

    @Inject
    PushPinView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

    }

    @Override
    protected void onAttach() {
        super.onAttach();
        MaterialPushpin.apply(target, source.getOffsetHeight() + 600);
    }
}
