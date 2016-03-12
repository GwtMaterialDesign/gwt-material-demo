package gwt.material.design.demo.client.application.components.breadcrumbs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class BreadcrumbsView extends ViewImpl implements BreadcrumbsPresenter.MyView {
    interface Binder extends UiBinder<Widget, BreadcrumbsView> {
    }

    @Inject
    BreadcrumbsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
