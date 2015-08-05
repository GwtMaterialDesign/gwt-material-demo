package gwt.material.design.demo.client.application;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import javax.inject.Inject;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView
{
    public interface Binder extends UiBinder<Widget, ApplicationView>
    {
    }

    @UiField
    SimplePanel main;

    @Inject
    ApplicationView(Binder uiBinder)
    {
        initWidget(uiBinder.createAndBindUi(this));

        // Allows cucumber to find an id, so it knows when the app is loaded.
//        main.ensureDebugId("loaded");
    }

    @Override
    public void setInSlot(Object slot, IsWidget content)
    {
        if (slot == ApplicationPresenter.SLOT_SetMainContent)
        {
            main.setWidget(content);
        }
        else
        {
            super.setInSlot(slot, content);
        }
    }
}
