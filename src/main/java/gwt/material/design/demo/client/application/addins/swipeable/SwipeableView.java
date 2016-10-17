package gwt.material.design.demo.client.application.addins.swipeable;

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
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.swipeable.MaterialSwipeablePanel;
import gwt.material.design.addins.client.swipeable.events.SwipeLeftEvent;
import gwt.material.design.addins.client.swipeable.events.SwipeRightEvent;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class SwipeableView extends ViewImpl implements SwipeablePresenter.MyView {
    interface Binder extends UiBinder<Widget, SwipeableView> {
    }

    @UiField
    MaterialSwipeablePanel swipeablePanel, swipeableDisablePanel;

    @UiField
    MaterialLabel item2, item3;

    @Inject
    SwipeableView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        swipeableDisablePanel.ignore(item2, item3);
    }

    @UiHandler("swipeablePanel")
    void onSwipeRight(SwipeRightEvent<Widget> e) {
        MaterialLabel label = (MaterialLabel) e.getTarget();
        MaterialToast.fireToast(label.getText() + " swiped right");
    }

    @UiHandler("swipeablePanel")
    void onSwipeLeft(SwipeLeftEvent<Widget> e) {
        MaterialLabel label = (MaterialLabel) e.getTarget();
        MaterialToast.fireToast(label.getText() + " swiped left");
    }

}
