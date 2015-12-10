package gwt.material.design.demo.client.application.addins.iconmorph;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class IconMorphView extends ViewImpl implements IconMorphPresenter.MyView {
    interface Binder extends UiBinder<Widget, IconMorphView> {
    }

    @Inject
    IconMorphView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
