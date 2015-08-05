package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialIcons extends Composite {

	private static MaterialIconsUiBinder uiBinder = GWT.create(MaterialIconsUiBinder.class);

	interface MaterialIconsUiBinder extends UiBinder<Widget, MaterialIcons> {
	}

	public MaterialIcons() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
