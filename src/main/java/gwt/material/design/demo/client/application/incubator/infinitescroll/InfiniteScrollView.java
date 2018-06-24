package gwt.material.design.demo.client.application.incubator.infinitescroll;

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


import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimation;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.incubator.client.infinitescroll.InfiniteScrollPanel;

public class InfiniteScrollView extends ViewImpl implements InfiniteScrollPresenter.MyView {
    public interface Binder extends UiBinder<Widget, InfiniteScrollView> {
    }

    @UiField
    MaterialPanel panel;

    @UiField
    InfiniteScrollPanel infiniteScrollPanel;
    private int index;

    @Inject
    InfiniteScrollView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        addBox(9);

        infiniteScrollPanel.setCallback(() -> {
            // Will change later to real server communication callback
            Scheduler.get().scheduleFixedDelay(() -> {
                addBox(6);
                MaterialToast.fireToast("Loaded 3 more cards.");
                return false;
            }, 2000);
        });
    }

    protected void addBox(int total) {
        for (int i = 0; i < total; i++) {
            index++;

            MaterialColumn column = new MaterialColumn(12, 6, 4);
            MaterialCard card = new MaterialCard();
            card.setMargin(12);
            card.setPadding(40);

            MaterialLabel title = new MaterialLabel("Card " + index);
            title.setFontWeight(Style.FontWeight.BOLD);
            card.add(title);
            card.add(new MaterialLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "));
            column.add(card);

            new MaterialAnimation().transition(Transition.SLIDEINUP).duration(400).animate(column);

            panel.add(column);
            infiniteScrollPanel.update();
        }
    }
}
