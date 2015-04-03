package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCard extends Composite {

	private static MaterialCardUiBinder uiBinder = GWT
			.create(MaterialCardUiBinder.class);

	interface MaterialCardUiBinder extends UiBinder<Widget, MaterialCard> {
	}

	public MaterialCard() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
