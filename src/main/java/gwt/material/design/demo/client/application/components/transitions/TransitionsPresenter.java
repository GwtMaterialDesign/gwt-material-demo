package gwt.material.design.demo.client.application.components.transitions;

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

public class TransitionsPresenter extends Presenter<TransitionsPresenter.MyView, TransitionsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.transitions)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<TransitionsPresenter> {
    }

    @Inject
    TransitionsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Transitions", "Motion design can effectively guide the user's " +
            "attention in ways that both inform and delight. Use motion to smoothly transport " +
            "users between navigational contexts, explain changes in the arrangement of elements " +
            "on a screen, and reinforce element hierarchy.", this);
    }
}
