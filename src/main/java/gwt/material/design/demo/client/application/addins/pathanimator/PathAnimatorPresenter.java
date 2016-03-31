package gwt.material.design.demo.client.application.addins.pathanimator;

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

public class PathAnimatorPresenter extends Presenter<PathAnimatorPresenter.MyView, PathAnimatorPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.pathAnimator)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<PathAnimatorPresenter> {
    }

    @Inject
    PathAnimatorPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Path Animator", "Custom component that provides meaningfull transition between two elements to show visual continuity.", this);
    }

}
