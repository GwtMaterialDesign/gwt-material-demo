package gwt.material.design.demo.client.application.apps;

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

public class AppsPresenter extends Presenter<AppsPresenter.MyView, AppsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.apps)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<AppsPresenter> {
    }

    @Inject
    AppsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Apps", "Apps built with gwt-material. Submit now your apps in Gitter Channel or contact me thru email at kevzlou7979@gmail.com", this);
    }
}
