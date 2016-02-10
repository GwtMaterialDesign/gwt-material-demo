package gwt.material.design.demo.client.application.addins.menubar;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.addins.client.ui.MaterialMenuBar;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class MenuBarPresenter extends Presenter<MenuBarPresenter.MyView, MenuBarPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.menubar)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<MenuBarPresenter> {
    }

    public static final NestedSlot SLOT_ICONMORPH = new NestedSlot();

    @Inject
    MenuBarPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Menu Bar", "Menu bar is a component that bring a good UI UX navigation for Desktop or tablet interface. This component provides a multi dropdown heirarchy best suit for larger applications.", this);
    }
}
