package gwt.material.design.demo.client.application.roadmap;

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

public class RoadMapPresenter extends Presenter<RoadMapPresenter.MyView, RoadMapPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.roadmap)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<RoadMapPresenter> {
    }

    @Inject
    RoadMapPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("RoadMap",
                "Lists of material widgets from 1.0 until the latest release of gwt-material.", this);
    }
}
