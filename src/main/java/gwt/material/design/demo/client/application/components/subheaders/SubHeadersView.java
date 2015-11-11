package gwt.material.design.demo.client.application.components.subheaders;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.html.Br;
import gwt.material.design.demo.client.application.components.buttons.ButtonsView;

import javax.inject.Inject;


public class SubHeadersView extends ViewImpl implements SubHeadersPresenter.MyView {
    interface Binder extends UiBinder<Widget, SubHeadersView> {
    }

    @Inject
    SubHeadersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
