


package gwt.material.design.demo.client.application.badges;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class BadgesPresenter extends Presenter<BadgesPresenter.MyView, BadgesPresenter.MyProxy> implements BadgesUiHandlers {
    interface MyView extends View, HasUiHandlers<BadgesUiHandlers> {
    }

    @NameToken(NameTokens.badges)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<BadgesPresenter> {
    }

    @Inject
    BadgesPresenter(EventBus eventBus, MyView view, MyProxy proxy) {

        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

        getView().setUiHandlers(this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Badges", "Badges can notify you that there are new or unread messages or " +
            "notifications. Add the new class to the badge to give it the background.", this);
    }
}
