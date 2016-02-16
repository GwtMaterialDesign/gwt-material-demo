package gwt.material.design.demo.client.application.addins.dnd;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialCutOut;
import gwt.material.design.addins.client.ui.MaterialDnd;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialPanel;

import javax.inject.Inject;


public class DndView extends ViewImpl implements DndPresenter.MyView {
    interface Binder extends UiBinder<Widget, DndView> {
    }

    @UiField
    MaterialPanel panel, woInertialPanel;

    @Inject
    DndView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        MaterialDnd dnd = new MaterialDnd();
        dnd.setTarget(panel);

        MaterialDnd dndWoInertia = new MaterialDnd();
        dndWoInertia.setTarget(woInertialPanel);
        dndWoInertia.setInertia(false);
    }

}
