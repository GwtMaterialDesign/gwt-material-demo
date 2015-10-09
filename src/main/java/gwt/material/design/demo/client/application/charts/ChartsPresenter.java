package gwt.material.design.demo.client.application.charts;

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

public class ChartsPresenter extends Presenter<ChartsPresenter.MyView, ChartsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.charts)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<ChartsPresenter> {
    }

    public static final NestedSlot SLOT_CHARTS = new NestedSlot();

    @Inject
    ChartsPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Material Charts", "Using GWT Charts Library , we tried to do couple of Material Design " +
                "Charts based on Design Options on each respective chart libraries.", this);
    }
}
