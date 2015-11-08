package gwt.material.design.demo.client.application.components.chips;

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

public class ChipsPresenter extends Presenter<ChipsPresenter.MyView, ChipsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.chips)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ChipsPresenter> {
    }

    @Inject
    ChipsPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Chips", "Chips represent complex entities in small blocks, such as " +
            "a contact. They can contain a photo, short title string, and brief information. Chips are " +
            "manipulated through drag-and-drop. Touching them invokes the full view in a card or full screen " +
            "view or invokes a menu of options related to that chip's entity.", this);
    }
}
