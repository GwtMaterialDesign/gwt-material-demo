package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialBadges extends Composite {

	private static MaterialBadgesUiBinder uiBinder = GWT.create(MaterialBadgesUiBinder.class);

	interface MaterialBadgesUiBinder extends UiBinder<Widget, MaterialBadges> {
	}

	public MaterialBadges() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
