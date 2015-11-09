package gwt.material.design.demo.client.application.components.forms;

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

public class FormsPresenter extends Presenter<FormsPresenter.MyView, FormsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.forms)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<FormsPresenter> {
    }

    @Inject
    FormsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Forms", "Forms are the standard way to receive user inputted data. " +
            "The transitions and smoothness of these elements are very important because of the inherent " +
            "user interaction associated with forms.", this);
    }
}
