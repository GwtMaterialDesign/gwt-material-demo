package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialScrollspyPanel extends Composite {

	private static MaterialScrollspyPanelUiBinder uiBinder = GWT.create(MaterialScrollspyPanelUiBinder.class);

	interface MaterialScrollspyPanelUiBinder extends UiBinder<Widget, MaterialScrollspyPanel> {
	}

	public MaterialScrollspyPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
