package gwt.material.design.demo.client.application.components.errors;

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

public class ErrorsPresenter extends Presenter<ErrorsPresenter.MyView, ErrorsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.errors)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ErrorsPresenter> {
    }

    @Inject
    ErrorsPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Errors", "Errors occur when an app fails to complete what is expected, " +
            "such as: 1. The app does not understand user input,2. The system or app fails , 3. A user " +
            "intends to run incompatible operations concurrently", this);
    }
}
