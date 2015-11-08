package gwt.material.design.demo.client.application.components.cards;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

import javax.inject.Inject;

public class CardsView extends ViewImpl implements CardsPresenter.MyView {
    interface Binder extends UiBinder<Widget, CardsView> {
    }

    @UiField MaterialRow rowCards;

    @Inject
    CardsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnShow")
    void onShow(ClickEvent e) {
        MaterialAnimator.animate(Transition.SHOW_GRID, rowCards, 0);
    }
}
