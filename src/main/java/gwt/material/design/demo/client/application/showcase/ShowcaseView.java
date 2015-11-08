package gwt.material.design.demo.client.application.showcase;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ShowcaseView extends ViewImpl implements ShowcasePresenter.MyView {
    interface Binder extends UiBinder<Widget, ShowcaseView> {
    }

    @Inject
    ShowcaseView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
