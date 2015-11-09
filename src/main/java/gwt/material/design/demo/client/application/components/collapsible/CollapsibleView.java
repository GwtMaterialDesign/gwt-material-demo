package gwt.material.design.demo.client.application.components.collapsible;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;

public class CollapsibleView extends ViewImpl implements CollapsiblePresenter.MyView {
    interface Binder extends UiBinder<Widget, CollapsibleView> {
    }

    @Inject
    CollapsibleView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
