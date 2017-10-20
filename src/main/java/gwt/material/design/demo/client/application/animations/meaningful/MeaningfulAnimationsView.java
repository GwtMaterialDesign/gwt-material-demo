package gwt.material.design.demo.client.application.animations.meaningful;

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
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.animate.MaterialAnimation;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.client.ui.html.UnorderedList;

import javax.inject.Inject;


public class MeaningfulAnimationsView extends ViewImpl implements MeaningfulAnimationsPresenter.MyView {
    interface Binder extends UiBinder<Widget, MeaningfulAnimationsView> {
    }

    @UiField
    UnorderedList listContainer;

    @UiField
    MaterialImage image;

    @UiField
    MaterialRow gridPanel;

    @Inject
    MeaningfulAnimationsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        gridPanel.getElement().getStyle().setOpacity(0);
    }

    @UiHandler("btnCloseGrid")
    void onCloseGrid(ClickEvent e) {
        MaterialAnimation gridAnimation = new MaterialAnimation();
        gridAnimation.setTransition(Transition.CLOSE_GRID);
        gridAnimation.animate(gridPanel);
    }

    @UiHandler("btnShowGrid")
    void onShowGrid(ClickEvent e) {
        MaterialAnimation gridAnimation = new MaterialAnimation();
        gridAnimation.setTransition(Transition.SHOW_GRID);
        gridAnimation.animate(gridPanel);
    }

    @UiHandler("btnStaggered")
    void onStaggered(ClickEvent e) {
        MaterialAnimation gridAnimation = new MaterialAnimation();
        gridAnimation.setTransition(Transition.SHOW_STAGGERED_LIST);
        gridAnimation.animate(listContainer);
    }

    @UiHandler("btnFade")
    void onFade(ClickEvent e) {
        MaterialAnimation gridAnimation = new MaterialAnimation();
        gridAnimation.setTransition(Transition.FADE_IN_IMAGE);
        gridAnimation.animate(image);
    }

}
