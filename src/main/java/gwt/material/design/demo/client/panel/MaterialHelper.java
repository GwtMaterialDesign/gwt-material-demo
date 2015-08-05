package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialHelper extends Composite {

	private static MaterialHelperUiBinder uiBinder = GWT
			.create(MaterialHelperUiBinder.class);

	interface MaterialHelperUiBinder extends UiBinder<Widget, MaterialHelper> {
	}

	public MaterialHelper() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
