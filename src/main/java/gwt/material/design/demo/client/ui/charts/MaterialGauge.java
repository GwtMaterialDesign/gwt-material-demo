package gwt.material.design.demo.client.ui.charts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.gauge.Gauge;
import com.googlecode.gwt.charts.client.gauge.GaugeOptions;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialGauge extends Composite {

	private static MaterialGaugeUiBinder uiBinder = GWT.create(MaterialGaugeUiBinder.class);

	interface MaterialGaugeUiBinder extends UiBinder<Widget, MaterialGauge> {
	}

	@UiField MaterialCardContent cardContent;
	
	private Gauge gauge;

	public MaterialGauge() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.GAUGE);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				gauge = new Gauge();
				cardContent.add(gauge);
				draw();
			}
		});
	}

	private void draw() {

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "LabelStyle");
		dataTable.addColumn(ColumnType.NUMBER, "Value");
		dataTable.addRows(3);
		dataTable.setValue(0, 0, "Memory");
		dataTable.setValue(0, 1, 80);

		// Set options
		GaugeOptions options = GaugeOptions.create();
		options.setGreenFrom(0);
		options.setGreenTo(40);
		options.setYellowFrom(40);
		options.setYellowTo(80);
		options.setRedFrom(80);
		options.setRedTo(100);
		
		// Draw the chart
		gauge.draw(dataTable, options);
	}
}
