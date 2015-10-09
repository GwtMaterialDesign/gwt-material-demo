package gwt.material.design.demo.client.application.cards;

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

public class CardsPresenter extends Presenter<CardsPresenter.MyView, CardsPresenter.MyProxy> implements CardsUiHandlers {
    interface MyView extends View, HasUiHandlers<CardsUiHandlers> {
    }

    @NameToken(NameTokens.cards)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<CardsPresenter> {
    }

    @Inject
    CardsPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

        getView().setUiHandlers(this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Cards", "Cards are a convenient means of displaying content composed of different types " +
                "of objects. They are also well-suited for presenting similar objects whose size or supported actions " +
                "can vary considerably, like photos with captions of variable length.", this);
    }
}
