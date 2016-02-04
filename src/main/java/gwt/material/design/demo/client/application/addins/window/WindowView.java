package gwt.material.design.demo.client.application.addins.window;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.OpenHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialWindow;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class WindowView extends ViewImpl implements WindowPresenter.MyView {
    interface Binder extends UiBinder<Widget, WindowView> {
    }

    @UiField
    MaterialWindow window, windowTab, styledWindow;

    @Inject
    WindowView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        window.addOpenHandler(new OpenHandler<Boolean>() {
            @Override
            public void onOpen(OpenEvent<Boolean> event) {
                MaterialToast.fireToast("Opened : " + window.getTitle());
            }
        });

        window.addCloseHandler(new CloseHandler<Boolean>() {
            @Override
            public void onClose(CloseEvent<Boolean> event) {
                MaterialToast.fireToast("Closed : " + window.getTitle());
            }
        });
    }

    @UiHandler("btnOpenWindow")
    void onOpenWindow(ClickEvent e) {
        window.openWindow();
    }

    @UiHandler("btnWindowTab")
    void onOpenWindowWithTab(ClickEvent e) {
        windowTab.openWindow();
    }

    @UiHandler("btnOpenWindowStyles")
    void onOpenStyledWindow(ClickEvent e) {
        styledWindow.openWindow();
    }

    @UiHandler("btnOpenMaximizedWindow")
    void onOpenMaximizedWindow(ClickEvent e) {
        window.setMaximize(true);
        window.openWindow();
    }
}
