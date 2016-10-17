package gwt.material.design.demo.client.application.addins.dnd;

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
import gwt.material.design.addins.client.dnd.MaterialDnd;
import gwt.material.design.addins.client.dnd.constants.Restriction;
import gwt.material.design.addins.client.dnd.js.JsDragOptions;
import gwt.material.design.addins.client.dnd.js.JsDropOptions;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;
import gwt.material.design.jquery.client.api.JQueryElement;

import javax.inject.Inject;

import static gwt.material.design.jquery.client.api.JQuery.$;

public class DndView extends ViewImpl implements DndPresenter.MyView {
    interface Binder extends UiBinder<Widget, DndView> {
    }

    @UiField
    MaterialPanel panel, woInertialPanel, endOnlyPanel, selfRestrict, restrictPanel, eventPanel, dndIgnoreFrom,
            ignoredPanel, xAxisPanel, yAxisPanel, item1, item2, item3, item4;

    @UiField
    MaterialRow dropzoneContainer;

    @UiField
    MaterialColumn placeContainer;

    @UiField
    MaterialLabel lblStarted, lblMoved, lblEnded;

    @Inject
    DndView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        MaterialDnd.draggable(panel);
        MaterialDnd.draggable(woInertialPanel, JsDragOptions.create(false));

        Restriction restriction = new Restriction();
        restriction.setEndOnly(false);
        MaterialDnd.draggable(endOnlyPanel, JsDragOptions.create(restriction));

        Restriction restriction1 = new Restriction();
        restriction1.setRestriction(Restriction.Restrict.SELF);
        MaterialDnd.draggable(selfRestrict, JsDragOptions.create(restriction1));

        Restriction restriction2 = new Restriction();
        restriction2.setTop(0.25);
        restriction2.setLeft(0.25);
        restriction2.setRight(0.75);
        restriction2.setBottom(0.75);
        MaterialDnd.draggable(restrictPanel, JsDragOptions.create(restriction2));

        MaterialDnd dndIgnore =  MaterialDnd.draggable(dndIgnoreFrom);
        dndIgnore.ignoreFrom(ignoredPanel);

        MaterialDnd.draggable(xAxisPanel, JsDragOptions.create(Axis.HORIZONTAL));
        MaterialDnd.draggable(yAxisPanel, JsDragOptions.create(Axis.VERTICAL));

        MaterialDnd.draggable(item1);
        MaterialDnd.draggable(item2);
        MaterialDnd.draggable(item3);
        MaterialDnd.draggable(item4);

        MaterialDnd.dropzone(dropzoneContainer, JsDropOptions.create(".test"));

        dropzoneContainer.addDropActivateHandler(event1 -> {
            MaterialToast.fireToast("Drop Activate");
        });

        dropzoneContainer.addDragEnterHandler(dragEnterEvent -> {
            placeContainer.setBackgroundColor(Color.BLUE);
            MaterialToast.fireToast("Drag Enter");
        });

        dropzoneContainer.addDragLeaveHandler(event1 -> {
            placeContainer.setBackgroundColor(Color.GREY_LIGHTEN_2);
            MaterialToast.fireToast("Drag Leave");
        });

        dropzoneContainer.addDropHandler(event -> {
            JQueryElement target = $(event.getRelatedTarget());
            MaterialWidget widget = new MaterialWidget(target.asElement());
            placeContainer.add(widget);
            MaterialToast.fireToast("Dropped");
        });

        dropzoneContainer.addDropDeactivateHandler(event -> {
            MaterialToast.fireToast("Drop Deactivate");
        });

        MaterialDnd.draggable(eventPanel);

        // Add Drag Start Handler
        eventPanel.addDragStartHandler(event -> {
            eventPanel.setBackgroundColor(Color.BLUE);
            lblStarted.setVisible(true);
        });
        // Add Drag Move Handler
        eventPanel.addDragMoveHandler(event -> {
            eventPanel.setBackgroundColor(Color.AMBER);
            lblMoved.setVisible(true);
        });
        // Add Drag End Handler
        eventPanel.addDragEndHandler(event -> {
            eventPanel.setBackgroundColor(Color.GREEN);
            lblEnded.setVisible(true);
        });
    }
}
