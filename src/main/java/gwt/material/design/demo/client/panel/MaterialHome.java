package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialHome extends Composite {

	private static MaterialHomeUiBinder uiBinder = GWT.create(MaterialHomeUiBinder.class);

	interface MaterialHomeUiBinder extends UiBinder<Widget, MaterialHome> {
	}

	public MaterialHome() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
