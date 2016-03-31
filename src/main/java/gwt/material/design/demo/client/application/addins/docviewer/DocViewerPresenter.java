package gwt.material.design.demo.client.application.addins.docviewer;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class DocViewerPresenter extends Presenter<DocViewerPresenter.MyView, DocViewerPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.docviewer)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<DocViewerPresenter> {
    }

    @Inject
    DocViewerPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Doc Viewer", "A document viewer for your word, excel, powerpoint, pdf and other supported file types Note that this viewer only work with public files.", this);
    }

}
