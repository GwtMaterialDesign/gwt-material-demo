package gwt.material.design.demo.client.application.addins.steppers;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class SteppersPresenter extends Presenter<SteppersPresenter.MyView, SteppersPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.steppers)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<SteppersPresenter> {
    }

    public static final NestedSlot SLOT_STEPPERS = new NestedSlot();

    @Inject
    SteppersPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Steppers", "Steppers convey progress through numbered steps. They may also be used for navigation.", this);
    }

}
