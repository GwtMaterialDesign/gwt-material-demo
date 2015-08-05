package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialTheme extends Composite {

	private static MaterialThemeUiBinder uiBinder = GWT
			.create(MaterialThemeUiBinder.class);

	interface MaterialThemeUiBinder extends UiBinder<Widget, MaterialTheme> {
	}

	public MaterialTheme() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
