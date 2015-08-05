package gwt.material.design.demo.client.panel.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialWindowContent extends Composite {

	private static MaterialWindowContentUiBinder uiBinder = GWT
			.create(MaterialWindowContentUiBinder.class);

	interface MaterialWindowContentUiBinder extends
			UiBinder<Widget, MaterialWindowContent> {
	}

	public MaterialWindowContent() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
