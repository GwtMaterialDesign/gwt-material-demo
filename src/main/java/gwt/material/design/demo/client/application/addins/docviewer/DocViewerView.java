package gwt.material.design.demo.client.application.addins.docviewer;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class DocViewerView extends ViewImpl implements DocViewerPresenter.MyView {
    interface Binder extends UiBinder<Widget, DocViewerView> {
    }

    @Inject
    DocViewerView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
