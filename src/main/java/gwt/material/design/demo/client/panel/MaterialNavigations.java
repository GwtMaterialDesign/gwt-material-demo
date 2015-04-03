package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialNavigations extends Composite  {

	private static MaterialNavigationsUiBinder uiBinder = GWT
			.create(MaterialNavigationsUiBinder.class);

	interface MaterialNavigationsUiBinder extends
			UiBinder<Widget, MaterialNavigations> {
	}

	public MaterialNavigations() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
}
