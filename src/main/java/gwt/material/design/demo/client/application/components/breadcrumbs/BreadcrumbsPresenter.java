package gwt.material.design.demo.client.application.components.breadcrumbs;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class BreadcrumbsPresenter extends Presenter<BreadcrumbsPresenter.MyView, BreadcrumbsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.breadcrumbs)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<BreadcrumbsPresenter> {
    }


    @Inject
    BreadcrumbsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Breadcrumbs", "Breadcrumbs are a good way to display your current location. This is usually used when you have multiple layers of content.", this);
    }

}
