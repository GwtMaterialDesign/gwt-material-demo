package gwt.material.design.demo.client.application.templates;

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

public class TemplatesPresenter extends Presenter<TemplatesPresenter.MyView, TemplatesPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.templates)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<TemplatesPresenter> {
    }

    public static final NestedSlot SLOT_TEMPLATES = new NestedSlot();

    @Inject
    TemplatesPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Templates", "Inspiring templates before starting designing / developing your GWT Apps with Material Design look and feel.", this);
    }

}
