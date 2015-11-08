package gwt.material.design.demo.client.application.templates;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class TemplatesView extends ViewImpl implements TemplatesPresenter.MyView {
    interface Binder extends UiBinder<Widget, TemplatesView> {
    }

    @UiField
    SimplePanel main;

    @Inject
    TemplatesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(TemplatesPresenter.SLOT_TEMPLATES, main);
    }
}
