package gwt.material.design.demo.client.application.components.dialogs;

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

public class DialogsPresenter extends Presenter<DialogsPresenter.MyView, DialogsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.dialogs)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<DialogsPresenter> {
    }

    @Inject
    DialogsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Dialogs", "Dialogs are content that are not original visible on a page " +
            "but show up with extra information if needed. The transitions should make the appearance of " +
            "the dialog make sense and not jarring to the user.", this);
    }
}
