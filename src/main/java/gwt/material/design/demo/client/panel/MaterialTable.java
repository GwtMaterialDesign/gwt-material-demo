package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTable extends Composite {

	private static MaterialTableUiBinder uiBinder = GWT
			.create(MaterialTableUiBinder.class);

	interface MaterialTableUiBinder extends UiBinder<Widget, MaterialTable> {
	}

	public MaterialTable() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
