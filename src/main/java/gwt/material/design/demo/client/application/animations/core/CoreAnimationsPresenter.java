package gwt.material.design.demo.client.application.animations.core;

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

public class CoreAnimationsPresenter extends Presenter<CoreAnimationsPresenter.MyView, CoreAnimationsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.coreAnimations)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<CoreAnimationsPresenter> {
    }

    @Inject
    CoreAnimationsPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Core Animations", "We used AnimateCSS to built our core animations.", this);
    }

}
