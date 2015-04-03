package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCollapsibles extends Composite {

	private static MaterialCollapsiblesUiBinder uiBinder = GWT.create(MaterialCollapsiblesUiBinder.class);

	interface MaterialCollapsiblesUiBinder extends UiBinder<Widget, MaterialCollapsibles> {
	}

	public MaterialCollapsibles() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
