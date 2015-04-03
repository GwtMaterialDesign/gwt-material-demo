package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialGrid extends Composite  {

	private static MaterialGridUiBinder uiBinder = GWT.create(MaterialGridUiBinder.class);

	interface MaterialGridUiBinder extends UiBinder<Widget, MaterialGrid> {
	}

	public MaterialGrid() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
