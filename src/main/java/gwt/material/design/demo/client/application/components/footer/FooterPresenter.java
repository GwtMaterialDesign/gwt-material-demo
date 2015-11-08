package gwt.material.design.demo.client.application.components.footer;

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

public class FooterPresenter extends Presenter<FooterPresenter.MyView, FooterPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.footer)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<FooterPresenter> {
    }

    @Inject
    FooterPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Footer", "Footers are a great way to organize a lot of site navigation and " +
            "information at the end of a page. This is where the user will look once hes finished scrolling " +
            "through the current page or is looking for additional information about your website.", this);
    }
}
