package gwt.material.design.demo.client.application.addins.docviewer;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DocViewerModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DocViewerPresenter.class, DocViewerPresenter.MyView.class, DocViewerView.class, DocViewerPresenter.MyProxy.class);
    }
}
