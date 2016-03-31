package gwt.material.design.demo.client.application.addins.swipeable;

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

public class SwipeablePresenter extends Presenter<SwipeablePresenter.MyView, SwipeablePresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.swipeable)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<SwipeablePresenter> {
    }

    @Inject
    SwipeablePresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Swipeable", "A panel that allows any of its nested children to be swiped away. This component is only applicable to touch screen devices.", this);
    }
}
