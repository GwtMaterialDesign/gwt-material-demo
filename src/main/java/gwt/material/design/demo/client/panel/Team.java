package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Team extends Composite {

	private static TeamUiBinder uiBinder = GWT.create(TeamUiBinder.class);

	interface TeamUiBinder extends UiBinder<Widget, Team> {
	}

	public Team() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
