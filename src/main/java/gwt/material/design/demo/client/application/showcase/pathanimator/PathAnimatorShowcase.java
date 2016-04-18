package gwt.material.design.demo.client.application.showcase.pathanimator;

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


import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.addins.client.pathanimator.MaterialPathAnimator;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

public class PathAnimatorShowcase extends Composite {

    private static PathAnimatorShowcaseUiBinder uiBinder = GWT.create(PathAnimatorShowcaseUiBinder.class);

    interface PathAnimatorShowcaseUiBinder extends UiBinder<Widget, PathAnimatorShowcase> {
    }

    @UiField
    MaterialAnchorButton btnFAB;

    @UiField
    MaterialIcon btnPause;

    @UiField
    MaterialRow musicPanel;

    @UiField
    MaterialLabel lblMusic;

    @UiField
    MaterialImage imgMusic;

    public PathAnimatorShowcase() {
        initWidget(uiBinder.createAndBindUi(this));
        MaterialAnimator.animate(Transition.BOUNCEINDOWN, btnFAB, 400);
    }

    @UiHandler("btnFAB")
    void onFAB(ClickEvent e){
        // Callback settings
        Runnable openCallback = new Runnable() {
            @Override
            public void run() {
                // Hide the fab with zoom out animation
                MaterialAnimator.animate(Transition.ZOOMOUT, btnFAB, 1000);
                btnFAB.setVisibility(Style.Visibility.HIDDEN);
                btnFAB.setOpacity(0);

                // Setting the visibility of the music panel
                musicPanel.setVisibility(Style.Visibility.VISIBLE);
                musicPanel.setOpacity(1);

                // Setting the music label with Bounce up animation
                lblMusic.setText("Pharell Williams / Love Yourself to Dance");
                MaterialAnimator.animate(Transition.BOUNCEINUP, lblMusic, 1000);

                // Setting the image of the artist
                imgMusic.setUrl("http://thatgrapejuice.net/wp-content/uploads/2013/08/pharrell-williams-that-grape-juice.png");
            }
        };

        // Execute the opening callback once the fab is clicked
        MaterialPathAnimator.animate(btnFAB.getElement(), musicPanel.getElement(), openCallback);
    }

    @UiHandler("btnPause")
    void onPause(ClickEvent e){
        // Applying reverse animation callback once the pause button is clicked
        Runnable closeCallback = new Runnable() {
            @Override
            public void run() {
                // Setting the visibility of the FAB for reverse animation
                MaterialAnimator.animate(Transition.ZOOMIN, btnFAB, 1000);
                btnFAB.setVisibility(Style.Visibility.VISIBLE);
                btnFAB.setOpacity(1);

                // Hide the music panel once the pause button is clicked
                musicPanel.setVisibility(Style.Visibility.HIDDEN);
                musicPanel.setOpacity(0);

                // Setting the previous music label with Bounce down animation
                lblMusic.setText("Lady Gaga / Telephone");
                MaterialAnimator.animate(Transition.BOUNCEINDOWN, lblMusic, 1000);

                // Setting the image of the artist
                imgMusic.setUrl("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRi9lfCkLutb7ugJlIjn84qWNoiICopC-Vyx7QQJRHF5E7GlqFG");
            }
        };

        // Execute the close callback animation
        MaterialPathAnimator.reverseAnimate(btnFAB.getElement(), musicPanel.getElement(), closeCallback);
    }
}
