package gwt.material.design.demo.client.application.addins.fileuploader;

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

public class FileUploaderPresenter extends Presenter<FileUploaderPresenter.MyView, FileUploaderPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.fileuploader)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<FileUploaderPresenter> {
    }

    @Inject
    FileUploaderPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("File Uploader", "Custom file uploader with Dnd support with the help of dropzone.js. It has multiple feature just like the GWT File Uploader core widget.", this);
    }

}
