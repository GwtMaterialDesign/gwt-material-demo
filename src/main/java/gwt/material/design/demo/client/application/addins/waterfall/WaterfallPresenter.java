package gwt.material.design.demo.client.application.addins.waterfall;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class WaterfallPresenter extends Presenter<WaterfallPresenter.MyView, WaterfallPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.waterfall)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<WaterfallPresenter> {
    }

    public static final NestedSlot SLOT_WATERFALL = new NestedSlot();

    @Inject
    WaterfallPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Waterfall", "Act like a collapsible header below the nav bar component when scrolling up / down to provide delightful transition of components.", this);
    }
}
