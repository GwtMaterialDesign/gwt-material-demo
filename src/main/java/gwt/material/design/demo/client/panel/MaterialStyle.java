package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialStyle extends Composite {

	private static MaterialStyleUiBinder uiBinder = GWT
			.create(MaterialStyleUiBinder.class);

	interface MaterialStyleUiBinder extends UiBinder<Widget, MaterialStyle> {
	}

	public MaterialStyle() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
