package gwt.material.design.demo.client.application.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView
{
    public interface Binder extends UiBinder<Widget, HomePageView>
    {
    }

    @Inject
    HomePageView(Binder uiBinder)
    {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
