package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDropDowns extends Composite {

	private static MaterialDropDownsUiBinder uiBinder = GWT.create(MaterialDropDownsUiBinder.class);

	interface MaterialDropDownsUiBinder extends UiBinder<Widget, MaterialDropDowns> {
	}

	public MaterialDropDowns() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
