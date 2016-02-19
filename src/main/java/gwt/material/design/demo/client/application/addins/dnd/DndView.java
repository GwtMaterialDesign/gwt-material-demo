package gwt.material.design.demo.client.application.addins.dnd;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.base.HasDraggable;
import gwt.material.design.addins.client.constants.Restriction;
import gwt.material.design.addins.client.events.DragEndEvent;
import gwt.material.design.addins.client.events.DragMoveEvent;
import gwt.material.design.addins.client.events.DragStartEvent;
import gwt.material.design.addins.client.ui.MaterialDnd;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class DndView extends ViewImpl implements DndPresenter.MyView {
    interface Binder extends UiBinder<Widget, DndView> {
    }

    @UiField
    MaterialPanel panel, woInertialPanel, endOnlyPanel, selfRestrict, restrictPanel, eventPanel;

    @UiField
    MaterialLabel lblStarted, lblMoved, lblEnded;

    @Inject
    DndView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        MaterialDnd dnd = new MaterialDnd();
        dnd.setTarget(panel);

        MaterialDnd dndWoInertia = new MaterialDnd();
        dndWoInertia.setTarget(woInertialPanel);
        dndWoInertia.setInertia(false);

        MaterialDnd dndEndOnly = new MaterialDnd();
        dndEndOnly.setTarget(endOnlyPanel);
        Restriction restriction = new Restriction();
        restriction.setEndOnly(false);
        dndEndOnly.setRestriction(restriction);

        MaterialDnd dndSelfRestrict = new MaterialDnd();
        dndSelfRestrict.setTarget(selfRestrict);
        Restriction restriction1 = new Restriction();
        restriction1.setRestriction(Restriction.Restrict.SELF);
        dndSelfRestrict.setRestriction(restriction1);

        MaterialDnd dndRestrict = new MaterialDnd();
        dndRestrict.setTarget(restrictPanel);
        Restriction restriction2 = new Restriction();
        restriction2.setTop(0.25);
        restriction2.setLeft(0.25);
        restriction2.setRight(0.75);
        restriction2.setBottom(0.75);
        dndRestrict.setRestriction(restriction2);

        final MaterialDnd dndEvent = new MaterialDnd();
        dndEvent.setTarget(eventPanel);

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
        });
    }

}
