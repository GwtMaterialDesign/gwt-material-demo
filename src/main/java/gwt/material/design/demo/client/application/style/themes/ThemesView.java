package gwt.material.design.demo.client.application.style.themes;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ThemesView extends ViewImpl implements ThemesPresenter.MyView {
    interface Binder extends UiBinder<Widget, ThemesView> {
    }

    @Inject
    ThemesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
