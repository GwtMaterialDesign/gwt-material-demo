package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialTabs;

public class MaterialTabsPanel extends Composite {

	private static MaterialTabsPanelUiBinder uiBinder = GWT.create(MaterialTabsPanelUiBinder.class);

	interface MaterialTabsPanelUiBinder extends UiBinder<Widget, MaterialTabsPanel> {
	}

	@UiField
	MaterialTabs tab2;
	
	public MaterialTabsPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		tab2.setTabIndex(2);
	}

}
