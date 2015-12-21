package gwt.material.design.demo.client.application.animations.core;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

import javax.inject.Inject;


public class CoreAnimationsView extends ViewImpl implements CoreAnimationsPresenter.MyView {
    interface Binder extends UiBinder<Widget, CoreAnimationsView> {
    }

    @UiField
    MaterialCard card;

    @UiField
    MaterialListBox lstAnimations;

    @Inject
    CoreAnimationsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnAnimate")
    void onAnimateCoreTransition(ClickEvent e){
        animate();
    }

    @UiHandler("lstAnimations")
    void onAnimateWithListBox(ChangeEvent e){
        animate();
    }

    private void animate(){
        String value = lstAnimations.getSelectedValue();
        Transition transition = Transition.fromStyleName(value);
        MaterialAnimator.animate(transition, card, 1000);
    }
}
