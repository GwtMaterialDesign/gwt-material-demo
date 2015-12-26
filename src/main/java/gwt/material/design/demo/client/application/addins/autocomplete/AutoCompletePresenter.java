package gwt.material.design.demo.client.application.addins.autocomplete;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class AutoCompletePresenter extends Presenter<AutoCompletePresenter.MyView, AutoCompletePresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.autocomplete)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<AutoCompletePresenter> {
    }

    public static final NestedSlot SLOT_AUTOCOMPLETE = new NestedSlot();

    @Inject
    AutoCompletePresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Autocomplete", "Autocompletes are best way for selecting item easily and " +
                "grouped them into chips for later search based on item values.", this);
    }

}
