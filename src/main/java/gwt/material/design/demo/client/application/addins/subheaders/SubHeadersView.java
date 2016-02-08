package gwt.material.design.demo.client.application.addins.subheaders;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class SubHeadersView extends ViewImpl implements SubHeadersPresenter.MyView {

    interface Binder extends UiBinder<Widget, SubHeadersView> {
    }

    @Inject
    SubHeadersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
