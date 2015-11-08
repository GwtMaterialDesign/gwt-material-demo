package gwt.material.design.demo.client.application.components.dropdown;

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

public class DropdownPresenter extends Presenter<DropdownPresenter.MyView, DropdownPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.dropdown)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<DropdownPresenter> {
    }

    @Inject
    DropdownPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Dropdown", "You can add dropdown easily by specifying it's" +
            " item content and add a UiHandler on it to implement any event.", this);
    }
}
