package gwt.material.design.demo.client.application;

import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.NavigationEvent;
import com.gwtplatform.mvp.client.proxy.NavigationHandler;
import com.gwtplatform.mvp.client.proxy.Proxy;
import gwt.material.design.demo.client.event.SetPageTitleEvent;

import javax.inject.Inject;

public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy>
        implements SetPageTitleEvent.SetPageTitleHandler, NavigationHandler {
    public interface MyView extends View {
        void setPageTitle(String title, String description);
    }

    public static final NestedSlot SLOT_MainContent = new NestedSlot();

    @ProxyStandard
    public interface MyProxy extends Proxy<ApplicationPresenter> {
    }

    @Inject
    ApplicationPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
    }

    @Override
    protected void onBind() {
        super.onBind();

        addRegisteredHandler(SetPageTitleEvent.TYPE, this);
        addRegisteredHandler(NavigationEvent.getType(), this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
    }

    @Override
    public void onSetPageTitle(SetPageTitleEvent event) {
        getView().setPageTitle(event.getTitle(), event.getDescription());
    }

    @Override
    public void onNavigation(NavigationEvent navigationEvent) {
        Window.scrollTo(0, 0);
    }
}
