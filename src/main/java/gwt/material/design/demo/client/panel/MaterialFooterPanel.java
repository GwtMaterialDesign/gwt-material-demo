package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialFooterPanel extends Composite {

	private static MaterialFooterPanelUiBinder uiBinder = GWT.create(MaterialFooterPanelUiBinder.class);

	interface MaterialFooterPanelUiBinder extends UiBinder<Widget, MaterialFooterPanel> {
	}

	public MaterialFooterPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
