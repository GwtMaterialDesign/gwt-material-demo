package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialButtonPanel extends Composite {

	private static MaterialButtonPanelUiBinder uiBinder = GWT.create(MaterialButtonPanelUiBinder.class);

	interface MaterialButtonPanelUiBinder extends UiBinder<Widget, MaterialButtonPanel> {
	}
	
	
	public MaterialButtonPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
