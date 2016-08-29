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
import gwt.material.design.addins.client.dnd.js.JsDragElementRect;
import gwt.material.design.addins.client.dnd.js.JsDragOptions;
import gwt.material.design.addins.client.dnd.js.JsDragRestrictions;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.client.ui.*;
import gwt.material.design.jquery.client.api.JQueryElement;

import javax.inject.Inject;

import static gwt.material.design.jquery.client.api.JQuery.$;


public class DndView extends ViewImpl implements DndPresenter.MyView {
    interface Binder extends UiBinder<Widget, DndView> {
    }

    @UiField
    MaterialPanel panel, woInertialPanel, endOnlyPanel, selfRestrict, restrictPanel, eventPanel, dndIgnoreFrom, ignoredPanel, xAxisPanel, yAxisPanel, item1, item2, item3, item4;

    @UiField
    MaterialRow dropzoneContainer;

    @UiField
    MaterialColumn placeContainer;

    @UiField
    MaterialLabel lblStarted, lblMoved, lblEnded;

    @Inject
    DndView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        // Simple
        MaterialDnd.draggable(panel);

        // Without Inertia
        JsDragOptions woInertiaOption = new JsDragOptions();
        woInertiaOption.inertia = false;
        MaterialDnd.draggable(woInertialPanel, woInertiaOption);

        // End Only
        JsDragOptions endOnlyOption = new JsDragOptions();
        JsDragRestrictions restrictions = new JsDragRestrictions();
        restrictions.endOnly = false;
        endOnlyOption.restrict = restrictions;
        MaterialDnd.draggable(endOnlyPanel, endOnlyOption);

        // Self Restriction
        JsDragOptions selfRestrictOption = new JsDragOptions();
        JsDragRestrictions selfRestriction = new JsDragRestrictions();
        selfRestriction.restriction = Restriction.Restrict.SELF.getValue();
        selfRestrictOption.restrict = selfRestriction;
        MaterialDnd.draggable(selfRestrict, selfRestrictOption);

        // Advance Restriction
        JsDragOptions restrictOption = new JsDragOptions();
        JsDragRestrictions restrict = new JsDragRestrictions();
        JsDragElementRect rect = new JsDragElementRect();
        rect.top = 0.25;
        rect.left = 0.25;
        rect.right = 0.75;
        rect.bottom = 0.75;
        restrict.elementRect = rect;
        restrictOption.restrict = restrict;
        MaterialDnd.draggable(restrictPanel, restrictOption);

        /*final MaterialDnd dndEvent = new MaterialDnd();
        dndEvent.setTarget(eventPanel);
        dndEvent.draggable();

        MaterialDnd.draggable(eventPanel);

        MaterialDnd dndIgnore = new MaterialDnd();
        dndIgnore.setTarget(dndIgnoreFrom);
        dndIgnore.setIgnoreFrom(ignoredPanel);
        dndIgnore.draggable();

        MaterialDnd dndXAxis = new MaterialDnd();
        dndXAxis.setTarget(xAxisPanel);
        dndXAxis.setAxis(Axis.HORIZONTAL);
        dndXAxis.draggable();

        MaterialDnd dndYAxis = new MaterialDnd();
        dndYAxis.setTarget(yAxisPanel);
        dndYAxis.setAxis(Axis.VERTICAL);
        dndYAxis.draggable();

        final MaterialDnd dndDropzone = new MaterialDnd();
        dndDropzone.setTarget(dropzoneContainer);
        dndDropzone.setAcceptSelector("test");
        dndDropzone.dropzone();

        MaterialDnd dndItem1 = new MaterialDnd();
        dndItem1.setTarget(item1);
        dndItem1.draggable();

        MaterialDnd dndItem2 = new MaterialDnd();
        dndItem2.setTarget(item2);
        dndItem2.draggable();

        MaterialDnd dndItem3 = new MaterialDnd();
        dndItem3.setTarget(item3);
        dndItem3.draggable();

        MaterialDnd dndItem4 = new MaterialDnd();
        dndItem4.setTarget(item4);
        dndItem4.draggable();

        dndDropzone.addDropActivateHandler(event1 -> {
            MaterialToast.fireToast("Drop Activate");
        });

        dndDropzone.addDragEnterHandler(event1 -> {
            placeContainer.setBackgroundColor("blue");
            MaterialToast.fireToast("Drag Enter");
        });

        dndDropzone.addDragLeaveHandler(event1 -> {
            placeContainer.setBackgroundColor("grey lighten-2");
            MaterialToast.fireToast("Drag Leave");
        });

        dndDropzone.addDropHandler(event -> {
            JQueryElement target = $(event.getRelatedTarget());
            MaterialWidget widget = new MaterialWidget(target.asElement());
            placeContainer.add(widget);
            MaterialToast.fireToast("Dropped");
        });

        dndDropzone.addDropDeactivateHandler(event -> {
            MaterialToast.fireToast("Drop Deactivate");
        });

        // Add Drag Start Handler
        dndEvent.addDragStartHandler(new DragStartEvent.DragStartHandler() {
            @Override
            public void onDragStart(DragStartEvent event) {
                ((MaterialWidget)dndEvent.getTarget()).setBackgroundColor("blue");
                lblStarted.setVisible(true);
            }
        });
        // Add Drag Move Handler
        dndEvent.addDragMoveHandler(new DragMoveEvent.DragMoveHandler() {
            @Override
            public void onDragMove(DragMoveEvent event) {
                ((MaterialWidget)dndEvent.getTarget()).setBackgroundColor("amber");
                lblMoved.setVisible(true);
            }
        });
        // Add Drag End Handler
        dndEvent.addDragEndHandler(new DragEndEvent.DragEndHandler() {
            @Override
            public void onDragEnd(DragEndEvent event) {
                ((MaterialWidget)dndEvent.getTarget()).setBackgroundColor("green");
                lblEnded.setVisible(true);
            }
        });*/
    }

}
