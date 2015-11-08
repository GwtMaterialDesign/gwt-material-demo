package gwt.material.design.demo.client.application.components.navbar;

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

public class NavBarPresenter extends Presenter<NavBarPresenter.MyView, NavBarPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.navbar)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<NavBarPresenter> {
    }

    @Inject
    NavBarPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("NavBar", "The navbar is fully contained by an HTML5 Nav tag. Inside a recommended " +
            "container div, there are 2 main parts of the navbar. A logo or brand link, and the navigations links. " +
            "You can align these links to the left or right.", this);
    }
}
