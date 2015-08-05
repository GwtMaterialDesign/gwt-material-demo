package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialChip;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialChips extends Composite {

	private static MaterialChipsUiBinder uiBinder = GWT
			.create(MaterialChipsUiBinder.class);

	interface MaterialChipsUiBinder extends UiBinder<Widget, MaterialChips> {
	}
	
	@UiField
	MaterialChip chip;

	public MaterialChips() {
		initWidget(uiBinder.createAndBindUi(this));
		chip.getBtnClose().setIcon("mdi-navigation-cancel");
		
		chip.getBtnClose().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				MaterialToast.alert(chip.getText());
			}
		});
	}

}
