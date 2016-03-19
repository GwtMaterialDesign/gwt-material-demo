package gwt.material.design.demo.client.application.addins.splitpanel;

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

public class SplitPanelPresenter extends Presenter<SplitPanelPresenter.MyView, SplitPanelPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.splitpanel)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<SplitPanelPresenter> {
    }

    @Inject
    SplitPanelPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Split Panel", "A high performance content splitter compatible with touch events", this);
    }

}
