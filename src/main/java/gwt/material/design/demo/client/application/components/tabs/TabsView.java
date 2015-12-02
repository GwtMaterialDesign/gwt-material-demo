package gwt.material.design.demo.client.application.components.tabs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialTab;

import javax.inject.Inject;

public class TabsView extends ViewImpl implements TabsPresenter.MyView {
    interface Binder extends UiBinder<Widget, TabsView> {
    }

    @UiField
    MaterialTab tab2;

    @Inject
    TabsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        tab2.setTabIndex(1);
    }
}
