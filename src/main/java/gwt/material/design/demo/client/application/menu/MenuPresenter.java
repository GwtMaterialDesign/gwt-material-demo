package gwt.material.design.demo.client.application.menu;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.event.SetPageTitleEvent.SetPageTitleHandler;

public class MenuPresenter extends PresenterWidget<MenuPresenter.MyView> implements MenuUiHandlers,
    SetPageTitleHandler {

    interface MyView extends View, HasUiHandlers<MenuUiHandlers> {
        void setPageTitle(String title, String description);
    }

    @Inject
    MenuPresenter(EventBus eventBus, MyView view) {
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