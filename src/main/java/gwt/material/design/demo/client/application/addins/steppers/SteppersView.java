package gwt.material.design.demo.client.application.addins.steppers;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.stepper.MaterialStepper;
import gwt.material.design.addins.client.stepper.events.CompleteEvent;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class SteppersView extends ViewImpl implements SteppersPresenter.MyView {
    interface Binder extends UiBinder<Widget, SteppersView> {
    }

    @UiField
    MaterialStepper stepper, stepperCard, stepperDialog, stepperHori, stepperFeedback, stepperError, stepperEvent, stepperMobile;


    @UiField
    MaterialDialog dialogStepper;

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

    @UiHandler("stepper")
    void onFinish(CompleteEvent e){
        reset(stepper);
    }

    @UiHandler({"btnContinue01", "btnContinue02", "btnContinue03"})
    void onNextStep0(ClickEvent e){
        stepperHori.nextStep();
    }

    @UiHandler({"btnPrev01", "btnPrev02", "btnPrev03"})
    void onPrevStep0(ClickEvent e){
        stepperHori.prevStep();
    }

    @UiHandler("stepperHori")
    void onFinish0(CompleteEvent e){
        reset(stepperHori);
    }

    @UiHandler({"btnContinue11", "btnContinue12", "btnContinue13"})
    void onNextStep1(ClickEvent e){
        stepperCard.nextStep();
    }

    @UiHandler({"btnPrev11", "btnPrev12", "btnPrev13"})
    void onPrevStep1(ClickEvent e){
        stepperCard.prevStep();
    }

    @UiHandler("stepperCard")
    void onFinish1(CompleteEvent e){
        reset(stepperCard);
    }

    @UiHandler("btnDialog")
    void onOpenDialog(ClickEvent e){
        dialogStepper.open();
    }

    @UiHandler({"btnContinue31", "btnContinue32", "btnContinue33"})
    void onNextStep2(ClickEvent e){
        stepperDialog.nextStep();
    }

    @UiHandler({"btnPrev31", "btnPrev32", "btnPrev33"})
    void onPrevStep2(ClickEvent e){
        stepperDialog.prevStep();
    }

    @UiHandler("stepperDialog")
    void onFinish3(CompleteEvent e){
        reset(stepperDialog);
        dialogStepper.close();
    }

    @UiHandler({"btnError", "btnError1", "btnError2"})
    void onError(ClickEvent e){
        stepperError.setErrorText("Alert Error");
    }

    @UiHandler({"btnSuccess", "btnSuccess1", "btnSuccess2"})
    void onSuccess(ClickEvent e){
        stepperError.nextStep();
    }

    @UiHandler("stepperError")
    void onSucess2(CompleteEvent e){
        reset(stepperError);
    }

    @UiHandler({"btnContinue41", "btnContinue42", "btnContinue43"})
    void onFeedback(ClickEvent e){
        stepperFeedback.showFeedback("Waiting for next step");
        Timer t = new Timer() {
            @Override
            public void run() {
                stepperFeedback.nextStep();
                stepperFeedback.hideFeedback();
            }
        };
        t.schedule(2000);
    }

    @UiHandler("stepperFeedback")
    void onFinishFeedback(CompleteEvent e){
        reset(stepperFeedback);
    }

    @UiHandler({"btnEventContinue1", "btnEventContinue2", "btnEventContinue3"})
    void onNextStepEvent(ClickEvent e){
        stepperEvent.nextStep();
    }

    @UiHandler({"btnEventPrev1", "btnEventPrev2", "btnEventPrev3"})
    void onPrevStepEvent(ClickEvent e){
        stepperEvent.prevStep();
    }

    @UiHandler("stepperEvent")
    void onCompleteEvent(CompleteEvent e) {
        reset(stepperEvent);
    }

    @UiHandler({"btnMobileContinue1", "btnMobileContinue2", "btnMobileContinue3"})
    void onNextStepMobile(ClickEvent e){
        stepperMobile.nextStep();
    }

    @UiHandler({"btnMobilePrev1", "btnMobilePrev2", "btnMobilePrev3"})
    void onPrevStepMobile(ClickEvent e){
        stepperMobile.prevStep();
    }

    @UiHandler("stepperMobile")
    void onCompleteMobile(CompleteEvent e) {
        reset(stepperMobile);
    }

    protected void reset(MaterialStepper stepper) {
        MaterialToast.fireToast("All done");
        stepper.reset();
    }
}
