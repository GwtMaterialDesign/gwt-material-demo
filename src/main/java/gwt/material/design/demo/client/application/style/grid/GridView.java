package gwt.material.design.demo.client.application.style.grid;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class GridView extends ViewImpl implements GridPresenter.MyView {
    interface Binder extends UiBinder<Widget, GridView> {
    }

    @Inject
    GridView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
