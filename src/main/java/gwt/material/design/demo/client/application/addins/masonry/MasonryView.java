package gwt.material.design.demo.client.application.addins.masonry;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;


public class MasonryView extends ViewImpl implements MasonryPresenter.MyView {
    interface Binder extends UiBinder<Widget, MasonryView> {
    }


    @Inject
    MasonryView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
