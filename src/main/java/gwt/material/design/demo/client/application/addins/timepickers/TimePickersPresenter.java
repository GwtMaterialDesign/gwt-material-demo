package gwt.material.design.demo.client.application.addins.timepickers;

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

public class TimePickersPresenter extends Presenter<TimePickersPresenter.MyView, TimePickersPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.timepickers)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<TimePickersPresenter> {
    }

    public static final NestedSlot SLOT_TIMEPICKERS = new NestedSlot();

    @Inject
    TimePickersPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Time Pickers", "A dialog picker is used to select a single time (hours:minutes) on mobile.\n" +
            "\n" +
            "The selected time is indicated by the filled circle at the end of the clock hand.", this);
    }

}
