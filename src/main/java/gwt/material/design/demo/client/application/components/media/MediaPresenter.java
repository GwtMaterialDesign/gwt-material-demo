package gwt.material.design.demo.client.application.components.media;

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

public class MediaPresenter extends Presenter<MediaPresenter.MyView, MediaPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.media)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<MediaPresenter> {
    }

    @Inject
    MediaPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Media", "Media components include things that have to do with " +
            "large media objects like Images, Video, Audio, etc.", this);
    }
}
