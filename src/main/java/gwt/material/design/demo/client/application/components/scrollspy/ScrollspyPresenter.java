package gwt.material.design.demo.client.application.components.scrollspy;

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

public class ScrollspyPresenter extends Presenter<ScrollspyPresenter.MyView, ScrollspyPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.scrollspy)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ScrollspyPresenter> {
    }

    @Inject
    ScrollspyPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Scrollspy", "Scrollspy is a jQuery plugin that tracks certain elements " +
            "and which element the user's screen is currently centered on. Our main demo of this is our " +
            "table of contents on every documentation page to the right. Clicking on these links will also " +
            "scroll the page to that element.", this);
    }
}
