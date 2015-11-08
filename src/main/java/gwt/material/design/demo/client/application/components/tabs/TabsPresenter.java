package gwt.material.design.demo.client.application.components.tabs;

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

public class TabsPresenter extends Presenter<TabsPresenter.MyView, TabsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.tabs)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<TabsPresenter> {
    }

    @Inject
    TabsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Tabs", "The tabs structure consists of an unordered list of tabs that have " +
            "hashes corresponding to tab ids. Then when you click on each tab, only the container with the " +
            "corresponding tab id will become visible.", this);
    }
}
