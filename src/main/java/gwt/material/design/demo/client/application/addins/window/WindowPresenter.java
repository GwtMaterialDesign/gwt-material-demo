package gwt.material.design.demo.client.application.addins.window;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class WindowPresenter extends Presenter<WindowPresenter.MyView, WindowPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.window)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<WindowPresenter> {
    }

    @Inject
    WindowPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Window", "Window is another kind of Modal but it has a header toolbar for maximizing and close the window. Also you can attached a tab component on its content.", this);
    }
}
