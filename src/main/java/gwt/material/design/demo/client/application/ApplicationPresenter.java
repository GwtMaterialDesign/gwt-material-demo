package gwt.material.design.demo.client.application;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.presenter.slots.SingleSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import gwt.material.design.demo.client.application.header.HeaderPresenter;

import javax.inject.Inject;

public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> {
    public interface MyView extends View {
    }

    public static final SingleSlot SLOT_HeaderContent = new SingleSlot();
    public static final NestedSlot SLOT_MainContent = new NestedSlot();

    @ProxyStandard
    public interface MyProxy extends Proxy<ApplicationPresenter> {
    }

    private final HeaderPresenter headerPresenter;

    @Inject
    ApplicationPresenter(EventBus eventBus, MyView view, MyProxy proxy, HeaderPresenter headerPresenter) {
        super(eventBus, view, proxy, RevealType.Root);

        this.headerPresenter = headerPresenter;

        setInSlot(SLOT_HeaderContent, headerPresenter);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
    }
}
