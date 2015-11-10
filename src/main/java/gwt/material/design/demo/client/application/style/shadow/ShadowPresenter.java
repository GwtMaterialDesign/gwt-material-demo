package gwt.material.design.demo.client.application.style.shadow;

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

public class ShadowPresenter extends Presenter<ShadowPresenter.MyView, ShadowPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.shadow)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ShadowPresenter> {
    }

    @Inject
    ShadowPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Shadow",
                "By importing another project called gwt-material-themes, you can now easily integrate it and make your app more professional with branding identity.", this);
    }
}
