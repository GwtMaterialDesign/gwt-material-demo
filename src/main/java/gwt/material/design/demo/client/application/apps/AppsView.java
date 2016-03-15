package gwt.material.design.demo.client.application.apps;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.demo.client.application.dto.Apps;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.showcase.cards.AppCard;

import javax.inject.Inject;


public class AppsView extends ViewImpl implements AppsPresenter.MyView {
    interface Binder extends UiBinder<Widget, AppsView> {
    }

    @UiField
    MaterialRow appRow;

    @Inject
    AppsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        populateApps();
    }

    private void populateApps() {
        for(Apps app : DataHelper.getAllApps()) {
            appRow.add(new AppCard(app));
        }
    }
}
