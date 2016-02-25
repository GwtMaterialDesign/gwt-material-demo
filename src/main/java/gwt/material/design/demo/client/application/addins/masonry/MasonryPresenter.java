package gwt.material.design.demo.client.application.addins.masonry;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationModule;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class MasonryPresenter extends Presenter<MasonryPresenter.MyView, MasonryPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.masonry)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<MasonryPresenter> {
    }

    @Inject
    MasonryPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Masonry", "Masonry works by placing elements in optimal position based on available vertical space, sort of like a mason fitting stones in a wall. ", this);
    }

}
