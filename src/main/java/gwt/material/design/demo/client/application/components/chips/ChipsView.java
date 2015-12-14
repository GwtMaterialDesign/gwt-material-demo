package gwt.material.design.demo.client.application.components.chips;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialChip;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class ChipsView extends ViewImpl implements ChipsPresenter.MyView {
    interface Binder extends UiBinder<Widget, ChipsView> {
    }

    @UiField
    MaterialChip chip;

    @Inject
    ChipsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        chip.getIcon().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                MaterialToast.fireToast(chip.getText());
            }
        });
    }

    @UiHandler("chipClick")
    void onClickChip(ClickEvent e) {
        MaterialToast.fireToast("You clicked me");
    }
}
