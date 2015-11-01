package gwt.material.design.demo.client.application.cards;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;

public class CardsView extends ViewWithUiHandlers<CardsUiHandlers> implements CardsPresenter.MyView {
    interface Binder extends UiBinder<Widget, CardsView> {
    }

    @Inject
    CardsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
