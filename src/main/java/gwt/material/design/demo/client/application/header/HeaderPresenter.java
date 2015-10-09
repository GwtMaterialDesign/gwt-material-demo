
package gwt.material.design.demo.client.application.header; 

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import gwt.material.design.demo.client.event.SetPageTitleEvent;

public class HeaderPresenter extends PresenterWidget<HeaderPresenter.MyView> implements HeaderUiHandlers, SetPageTitleEvent.SetPageTitleHandler {
    interface MyView extends View, HasUiHandlers<HeaderUiHandlers> {

        void setPageTitle(String title, String description);
    }
    @Inject
    HeaderPresenter(EventBus eventBus, MyView view) {
        super(eventBus, view);
        getView().setUiHandlers(this);
    }

    @Override
    protected void onBind() {
        super.onBind();
        addRegisteredHandler(SetPageTitleEvent.TYPE, this);
    }

    @Override
    public void onSetPageTitle(SetPageTitleEvent event) {
        getView().setPageTitle(event.getTitle(), event.getDescription());
    }



}
