package gwt.material.design.demo.client.application.components.loader;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class LoaderPresenter extends Presenter<LoaderPresenter.MyView, LoaderPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.loader)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<LoaderPresenter> {
    }

    @Inject
    LoaderPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Loaders", "If you have content that will take a long time to load, you " +
            "should give the user feedback. For this reason we provide a number activity + progress " +
            "indicators.", this);
    }
}
