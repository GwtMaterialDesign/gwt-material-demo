package gwt.material.design.demo.client.application.about;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class AboutView extends ViewImpl implements AboutPresenter.MyView {
    public interface Binder extends UiBinder<Widget, AboutView> {
    }

    @Inject
    AboutView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
