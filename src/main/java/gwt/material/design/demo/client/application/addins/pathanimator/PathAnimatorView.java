package gwt.material.design.demo.client.application.addins.pathanimator;

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
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.overlay.MaterialOverlay;
import gwt.material.design.addins.client.pathanimator.MaterialPathAnimator;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;


public class PathAnimatorView extends ViewImpl implements PathAnimatorPresenter.MyView {
    interface Binder extends UiBinder<Widget, PathAnimatorView> {
    }

    @UiField
    MaterialButton btnOptionSource, btnSource1, btnSource3, toScrolledElement;

    @UiField
    MaterialCard card, panelTarget3, panelWithOptions;

    @UiField
    MaterialLink btnSource2, btnCloseWithOptions;

    @UiField
    MaterialIcon btnSource4;

    @UiField
    MaterialRow scrolledTarget;

    @UiField
    MaterialCheckBox withBackground, withBorder, withShadow;

    @UiField
    MaterialOverlay panelTarget1, panelTarget2, panelTarget4, panelTargetCol1, panelTargetCol2,
            panelTargetCol3, panelTargetCol4, panelTargetCol5, panelTargetCol6, panelTargetCol7;

    @UiField
    MaterialColumn col1, col2, col3, col4, col5, col6, col7;

    @UiField
    MaterialIntegerBox txtDuration, txtTargetShowDuration, txtExtraTransitionDuration;

    private MaterialPathAnimator animator = new MaterialPathAnimator();

    @Inject
    PathAnimatorView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        txtDuration.setValue(300);
        txtDuration.setHelperText("Duration (in milliseconds) of animation. Default is 3000 ms.");

        txtTargetShowDuration.setValue(0);
        txtTargetShowDuration.setHelperText("Duration (in milliseconds) of targetElement to become visible, if hidden initially. The library will automatically try to figure this out from the element's computed styles. Default is 0 ms.");

        txtExtraTransitionDuration.setValue(1000);
        txtExtraTransitionDuration.setHelperText("Extra duration (in milliseconds) of targetElement to provide visual continuity between the animation and the rendering of the targetElement. Default is 1000ms");
    }

    @UiHandler("toScrolledElement")
    void toScrolledElement(ClickEvent e) {
        animator.setSourceElement(toScrolledElement.getElement());
        animator.setTargetElement(card.getElement());
        animator.animate();
    }

    @UiHandler("btnCloseWithOptions")
    void onCloseWithOptions(ClickEvent e) {
        animator.reverseAnimate();
    }

    @UiHandler("btnOptionSource")
    void onOptionSource(ClickEvent e) {
        animator.setSourceElement(btnOptionSource.getElement());
        animator.setTargetElement(panelWithOptions.getElement());
        animator.setDuration(txtDuration.getValue());
        animator.setTargetShowDuration(txtTargetShowDuration.getValue());
        animator.setExtraTransitionDuration(txtExtraTransitionDuration.getValue());
        animator.animate();

    }

    @UiHandler("withBackground")
    void withBackground(ValueChangeEvent<Boolean> e) {
        if (e.getValue()) {
            animator.setBackgroundColor(Color.RED);
        } else {
            animator.setBackgroundColor(Color.WHITE);
        }
    }

    @UiHandler("withBorder")
    void withBorder(ValueChangeEvent<Boolean> e) {
        if (e.getValue()) {
            animator.setStyleProperty("border", "4px solid");
        } else {
            animator.clearStyleProperty("border");
        }
    }

    @UiHandler("withShadow")
    void withShadow(ValueChangeEvent<Boolean> e) {
        if (e.getValue()) {
            animator.setShadow(3);
        } else {
            animator.setShadow(0);
        }
    }

    @UiHandler("btnSource1")
    void onSource(ClickEvent e) {
        MaterialPathAnimator.animate(btnSource1.getElement(), panelTarget1.getElement());
    }

    @UiHandler("btnSource2")
    void onClickCard(ClickEvent e) {
        MaterialPathAnimator.animate(card.getElement(), panelTarget2.getElement());
    }

    @UiHandler("btnSource3")
    void onClickCard3(ClickEvent e) {
        MaterialPathAnimator.animate(btnSource3.getElement(), panelTarget3.getElement());
    }

    @UiHandler("btnSource4")
    void onClickIconDelete(ClickEvent e) {
        MaterialPathAnimator.animate(btnSource4.getElement(), panelTarget4.getElement());
    }

    @UiHandler("col1")
    void onCol1(ClickEvent e) {
        MaterialPathAnimator.animate(col1.getElement(), panelTargetCol1.getElement());
    }

    @UiHandler("col2")
    void onCol2(ClickEvent e) {
        MaterialPathAnimator.animate(col2.getElement(), panelTargetCol2.getElement());
    }

    @UiHandler("col3")
    void onCol3(ClickEvent e) {
        MaterialPathAnimator.animate(col3.getElement(), panelTargetCol3.getElement());
    }

    @UiHandler("col4")
    void onCol4(ClickEvent e) {
        MaterialPathAnimator.animate(col4.getElement(), panelTargetCol4.getElement());
    }

    @UiHandler("col5")
    void onCol5(ClickEvent e) {
        MaterialPathAnimator.animate(col5.getElement(), panelTargetCol5.getElement());
    }

    @UiHandler("col6")
    void onCol6(ClickEvent e) {
        MaterialPathAnimator.animate(col6.getElement(), panelTargetCol6.getElement());
    }

    @UiHandler("col7")
    void onCol7(ClickEvent e) {
        MaterialPathAnimator.animate(col7.getElement(), panelTargetCol7.getElement());
    }

    @UiHandler("btnClose1")
    void onClose(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(btnSource1.getElement(), panelTarget1.getElement());
    }

    @UiHandler("btnClose2")
    void onCardClose(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(btnSource2.getElement(), panelTarget2.getElement());
    }

    @UiHandler("btnClose3")
    void onCardClose3(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(btnSource3.getElement(), panelTarget3.getElement());
    }

    @UiHandler("btnClose4")
    void onClose4(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(btnSource4.getElement(), panelTarget4.getElement());
    }

    @UiHandler("btnCloseCol1")
    void onCloseCol1(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col1.getElement(), panelTargetCol1.getElement());
    }

    @UiHandler("btnCloseCol2")
    void onCloseCol2(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col2.getElement(), panelTargetCol2.getElement());
    }

    @UiHandler("btnCloseCol3")
    void onCloseCol3(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col3.getElement(), panelTargetCol3.getElement());
    }

    @UiHandler("btnCloseCol4")
    void onCloseCol4(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col4.getElement(), panelTargetCol4.getElement());
    }

    @UiHandler("btnCloseCol5")
    void onCloseCol5(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col5.getElement(), panelTargetCol5.getElement());
    }

    @UiHandler("btnCloseCol6")
    void onCloseCol6(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col6.getElement(), panelTargetCol6.getElement());
    }

    @UiHandler("btnCloseCol7")
    void onCloseCol7(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(col7.getElement(), panelTargetCol7.getElement());
    }


}
