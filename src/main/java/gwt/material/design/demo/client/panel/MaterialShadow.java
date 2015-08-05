package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialShadow extends Composite {

	private static MaterialShadowUiBinder uiBinder = GWT
			.create(MaterialShadowUiBinder.class);

	interface MaterialShadowUiBinder extends UiBinder<Widget, MaterialShadow> {
	}

	public MaterialShadow() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
