package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialMedia extends Composite {

	private static MaterialMediaUiBinder uiBinder = GWT.create(MaterialMediaUiBinder.class);

	interface MaterialMediaUiBinder extends UiBinder<Widget, MaterialMedia> {
	}

	public MaterialMedia() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
