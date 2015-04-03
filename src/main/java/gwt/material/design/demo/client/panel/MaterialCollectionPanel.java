package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCollectionPanel extends Composite {

	private static MaterialCollectionPanelUiBinder uiBinder = GWT.create(MaterialCollectionPanelUiBinder.class);

	interface MaterialCollectionPanelUiBinder extends UiBinder<Widget, MaterialCollectionPanel> {
	}

	public MaterialCollectionPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
