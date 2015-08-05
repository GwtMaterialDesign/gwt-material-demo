package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialCharts extends Composite {

	private static MaterialChartsUiBinder uiBinder = GWT.create(MaterialChartsUiBinder.class);

	interface MaterialChartsUiBinder extends UiBinder<Widget, MaterialCharts> {
	}
	
	public MaterialCharts() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
