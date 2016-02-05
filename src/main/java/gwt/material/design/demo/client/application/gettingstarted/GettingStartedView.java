package gwt.material.design.demo.client.application.gettingstarted;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialCollapsible;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.Version;
import gwt.material.design.demo.client.application.gettingstarted.version.VersionCollapsibleItem;
import gwt.material.design.demo.client.resources.MaterialConstants;

import javax.inject.Inject;

public class GettingStartedView extends ViewWithUiHandlers<GettingStartedUiHandlers> implements GettingStartedPresenter.MyView {

    interface Binder extends UiBinder<Widget, GettingStartedView> {
    }

    private final MaterialConstants constants;

    @UiField
    MaterialCollapsible versionColaps;

    @Inject
    GettingStartedView(Binder uiBinder, MaterialConstants constants) {
        initWidget(uiBinder.createAndBindUi(this));
        this.constants = constants;
    }

    @UiHandler("btnMaven")
    void onGoToMaven(ClickEvent e) {
        Window.open(constants.mavenUrl(), "_blank", "");
    }

    @UiHandler("btnDemoStarter")
    void onDemoStarter(ClickEvent e) {
        Window.open(constants.demoStarterUrl(), "_blank", "");
    }

    @UiHandler("btnSourceStarter")
    void onSourceStarter(ClickEvent e) {
        Window.open(constants.sourceStarterUrl(), "_blank", "");
    }

    @UiHandler("btnDownloadGWTMaterial")
    void onDownloadGWTMaterial(ClickEvent e) {
        Window.open(constants.sourceUrl(), "_blank", "");
    }

    @Override
    public void loadAllVersions() {
        versionColaps.clear();
        int i = 0;
        for(Version version : DataHelper.getAllVersions()){
            versionColaps.add(new VersionCollapsibleItem(version, i));
            i++;
        }
    }
}
