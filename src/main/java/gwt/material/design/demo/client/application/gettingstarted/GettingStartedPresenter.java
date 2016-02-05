package gwt.material.design.demo.client.application.gettingstarted;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class GettingStartedPresenter extends Presenter<GettingStartedPresenter.MyView, GettingStartedPresenter.MyProxy> implements GettingStartedUiHandlers {
    interface MyView extends View, HasUiHandlers<GettingStartedUiHandlers> {
        void loadAllVersions();
    }

    @NameToken(NameTokens.gettingstarted)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<GettingStartedPresenter> {
    }

    @Inject
    GettingStartedPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

        getView().setUiHandlers(this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        loadAllVersions();
        SetPageTitleEvent.fire("Getting Started",
            "Learn how to easily start using GWT Material Design in your app.", this);
    }

    public void loadAllVersions() {
        getView().loadAllVersions();
    }
}
