package gwt.material.design.demo.client.application.addins.waterfall;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class WaterfallView extends ViewImpl implements WaterfallPresenter.MyView {
    interface Binder extends UiBinder<Widget, WaterfallView> {
    }

    @Inject
    WaterfallView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
