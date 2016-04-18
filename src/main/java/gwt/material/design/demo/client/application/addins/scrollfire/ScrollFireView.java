package gwt.material.design.demo.client.application.addins.scrollfire;

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


import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.scrollfire.MaterialScrollfire;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.client.ui.html.UnorderedList;

import javax.inject.Inject;


public class ScrollFireView extends ViewImpl implements ScrollFirePresenter.MyView {
    interface Binder extends UiBinder<Widget, ScrollFireView> {
    }

    @UiField
    MaterialPanel panel;

    @UiField
    UnorderedList listContainer;

    @UiField
    MaterialImage image;

    @Inject
    ScrollFireView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        Runnable forToast = new Runnable() {
            @Override
            public void run() {
                MaterialToast.fireToast("Toasted");
            }
        };

        Runnable forListItems = new Runnable() {
            @Override
            public void run() {
                MaterialAnimator.animate(Transition.SHOW_STAGGERED_LIST, listContainer, 0);
            }
        };

        Runnable forImage = new Runnable() {
            @Override
            public void run() {
                MaterialAnimator.animate(Transition.FADE_IN_IMAGE, image, 0);
            }
        };

        MaterialScrollfire.apply(panel.getElement(), forToast);
        MaterialScrollfire.apply(listContainer.getElement(), forListItems);
        MaterialScrollfire.apply(image.getElement(), forImage);

    }
}
