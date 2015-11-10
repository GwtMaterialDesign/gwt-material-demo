package gwt.material.design.demo.client.application.style.grid;

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

public class GridPresenter extends Presenter<GridPresenter.MyView, GridPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.grid)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<GridPresenter> {
    }

    @Inject
    GridPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Grid",
                "We are using a standard 12 column fluid responsive grid system.The grid helps you layout your page in an ordered, easy fashion", this);
    }
}
