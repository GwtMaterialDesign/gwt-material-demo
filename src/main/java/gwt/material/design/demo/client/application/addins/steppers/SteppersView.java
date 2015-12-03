package gwt.material.design.demo.client.application.addins.steppers;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialStepper;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class SteppersView extends ViewImpl implements SteppersPresenter.MyView {
    interface Binder extends UiBinder<Widget, SteppersView> {
    }

    @UiField
    MaterialStepper stepper, stepperCard;

    @Inject
    SteppersView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler({"btnContinue1", "btnContinue2", "btnContinue3"})
    void onNextStep(ClickEvent e){
        stepper.nextStep();
    }

    @UiHandler({"btnPrev1", "btnPrev2", "btnPrev3"})
    void onPrevStep(ClickEvent e){
        stepper.prevStep();
    }

    @UiHandler("btnContinue3")
    void onFinish(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepper.goToStep(1);
    }

    @UiHandler({"btnContinue11", "btnContinue21", "btnContinue31"})
    void onNextStep1(ClickEvent e){
        stepperCard.nextStep();
    }

    @UiHandler({"btnPrev11", "btnPrev21", "btnPrev31"})
    void onPrevStep1(ClickEvent e){
        stepperCard.prevStep();
    }

    @UiHandler("btnContinue31")
    void onFinish1(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperCard.goToStep(1);
    }
}
