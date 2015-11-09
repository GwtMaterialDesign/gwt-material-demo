package gwt.material.design.demo.client.application.components.scrollspy;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ScrollspyView extends ViewImpl implements ScrollspyPresenter.MyView {
    interface Binder extends UiBinder<Widget, ScrollspyView> {
    }

    @Inject
    ScrollspyView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
