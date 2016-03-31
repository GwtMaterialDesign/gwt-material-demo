package gwt.material.design.demo.client.application.showcase;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialSplashScreen;

import javax.inject.Inject;

public class ShowcaseView extends ViewImpl implements ShowcasePresenter.MyView {
    interface Binder extends UiBinder<Widget, ShowcaseView> {
    }

    @UiField
    MaterialSplashScreen splash;

    @Inject
    ShowcaseView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnSplashScreen")
    void onSplashscreen(ClickEvent e){
        splash.show();
        Timer t = new Timer() {
            @Override
            public void run() {
              splash.hide();
            }
        };
        t.schedule(3000);
    }
}
