package gwt.material.design.demo.client.application.addins.richeditor;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class RichEditorModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(RichEditorPresenter.class, RichEditorPresenter.MyView.class, RichEditorView.class, RichEditorPresenter.MyProxy.class);
    }
}
