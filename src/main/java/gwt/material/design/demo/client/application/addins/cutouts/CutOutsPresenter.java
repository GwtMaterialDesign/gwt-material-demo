package gwt.material.design.demo.client.application.addins.cutouts;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class CutOutsPresenter extends Presenter<CutOutsPresenter.MyView, CutOutsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.cutouts)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<CutOutsPresenter> {
    }

    public static final NestedSlot SLOT_CUTOUTS = new NestedSlot();

    @Inject
    CutOutsPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("CutOuts", "The MaterialCutOut is an excellent component to show users about new features and important components (buttons, labels and so) on the UI.", this);
    }
}

