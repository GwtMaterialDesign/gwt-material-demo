package gwt.material.design.demo.client.application.components.pushpin;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class PushPinPresenter extends Presenter<PushPinPresenter.MyView, PushPinPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.pushPin)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<PushPinPresenter> {
    }

    public static final NestedSlot SLOT_PUSHPIN = new NestedSlot();

    @Inject
    PushPinPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Push Pin", "Pushpin is our fixed positioning plugin. You can check out our live examples: the fixed Table of Contents on the right.", this);
    }

}
