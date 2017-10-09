package gwt.material.design.demo.client.application.components.chips;

import gwt.material.design.client.ui.MaterialChip;
import gwt.material.design.client.ui.MaterialToast;

public class CustomChip extends MaterialChip {

    @Override
    protected void onLoad() {
        super.onLoad();

        getHandlerRegistry().clearHandlers();
        getIcon().addClickHandler(clickEvent -> {
            clickEvent.preventDefault();
            clickEvent.stopPropagation();
        });
    }
}
