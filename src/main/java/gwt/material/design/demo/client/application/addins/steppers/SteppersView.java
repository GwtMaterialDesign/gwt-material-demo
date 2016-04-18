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
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class SteppersView extends ViewImpl implements SteppersPresenter.MyView {
    interface Binder extends UiBinder<Widget, SteppersView> {
    }

    @UiField
    MaterialStepper stepper, stepperCard, stepperModal, stepperHori, stepperFeedback, stepperError;


    @UiField
    MaterialModal modalStepper;

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
        stepper.reset();
    }

    @UiHandler({"btnContinue01", "btnContinue02", "btnContinue03"})
    void onNextStep0(ClickEvent e){
        stepperHori.nextStep();
    }

    @UiHandler({"btnPrev01", "btnPrev02", "btnPrev03"})
    void onPrevStep0(ClickEvent e){
        stepperHori.prevStep();
    }

    @UiHandler("btnContinue03")
    void onFinish0(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperHori.reset();
    }

    @UiHandler({"btnContinue11", "btnContinue12", "btnContinue13"})
    void onNextStep1(ClickEvent e){
        stepperCard.nextStep();
    }

    @UiHandler({"btnPrev11", "btnPrev12", "btnPrev13"})
    void onPrevStep1(ClickEvent e){
        stepperCard.prevStep();
    }

    @UiHandler("btnContinue13")
    void onFinish1(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperCard.reset();
    }

    @UiHandler("btnModal")
    void onOpenModal(ClickEvent e){
        modalStepper.openModal();
    }

    @UiHandler({"btnContinue31", "btnContinue32", "btnContinue33"})
    void onNextStep2(ClickEvent e){
        stepperModal.nextStep();
    }

    @UiHandler({"btnPrev31", "btnPrev32", "btnPrev33"})
    void onPrevStep2(ClickEvent e){
        stepperModal.prevStep();
    }

    @UiHandler("btnContinue33")
    void onFinish3(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperModal.reset();
        modalStepper.closeModal();
    }

    @UiHandler({"btnError", "btnError1", "btnError2"})
    void onError(ClickEvent e){
        stepperError.setError("Alert Error");
    }

    @UiHandler({"btnSuccess", "btnSuccess1", "btnSuccess2"})
    void onSuccess(ClickEvent e){
        stepperError.nextStep();
    }

    @UiHandler("btnSuccess2")
    void onSucess2(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperError.reset();
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

    @UiHandler("btnContinue43")
    void onFinishFeedback(ClickEvent e){
        MaterialToast.fireToast("All done.");
        stepperFeedback.reset();
    }
}
