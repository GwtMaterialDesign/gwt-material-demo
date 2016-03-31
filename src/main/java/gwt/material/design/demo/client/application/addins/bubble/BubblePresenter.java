package gwt.material.design.demo.client.application.addins.bubble;

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

public class BubblePresenter extends Presenter<BubblePresenter.MyView, BubblePresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.bubble)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<BubblePresenter> {
    }

    @Inject
    BubblePresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Bubble", "Addin component for chat module, it display a good bubble view of messages withing the chat module.", this);
    }

}
