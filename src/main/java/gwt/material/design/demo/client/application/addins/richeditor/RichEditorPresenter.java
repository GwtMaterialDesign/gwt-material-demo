package gwt.material.design.demo.client.application.addins.richeditor;

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

public class RichEditorPresenter extends Presenter<RichEditorPresenter.MyView, RichEditorPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.richeditor)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<RichEditorPresenter> {
    }

    @Inject
    RichEditorPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Rich Editor", "Provides a great Rich Editor with amazing options built with Material Design Look and Feel.", this);
    }

}
