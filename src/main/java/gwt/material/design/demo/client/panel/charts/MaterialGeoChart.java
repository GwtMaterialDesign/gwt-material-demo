package gwt.material.design.demo.client.panel.charts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.geochart.GeoChart;
import com.googlecode.gwt.charts.client.geochart.GeoChartColorAxis;
import com.googlecode.gwt.charts.client.geochart.GeoChartOptions;
import gwt.material.design.client.ui.MaterialCard;

public class MaterialGeoChart extends Composite {

	private static MaterialGeoChartUiBinder uiBinder = GWT.create(MaterialGeoChartUiBinder.class);

	interface MaterialGeoChartUiBinder extends UiBinder<Widget, MaterialGeoChart> {
	}
	
	@UiField MaterialCard chartCard;
	private GeoChart geoChart;
	
	public MaterialGeoChart() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}
	
	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.GEOCHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				geoChart = new GeoChart();
				chartCard.add(geoChart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Country");
		dataTable.addColumn(ColumnType.NUMBER, "Popularity");
		dataTable.addRows(6);
		dataTable.setValue(0, 0, "Germany");
		dataTable.setValue(0, 1, 200);
		dataTable.setValue(1, 0, "United States");
		dataTable.setValue(1, 1, 300);
		dataTable.setValue(2, 0, "Brazil");
		dataTable.setValue(2, 1, 400);
		dataTable.setValue(3, 0, "Canada");
		dataTable.setValue(3, 1, 500);
		dataTable.setValue(4, 0, "France");
		dataTable.setValue(4, 1, 600);
		dataTable.setValue(5, 0, "RU");
		dataTable.setValue(5, 1, 700);
		
		// Set Geo Chart Colors
		
		// Set options
		GeoChartOptions options = GeoChartOptions.create();
		GeoChartColorAxis geoChartColorAxis = GeoChartColorAxis.create();
		geoChartColorAxis.setColors(getNativeArray());
		options.setColorAxis(geoChartColorAxis);
		options.setDatalessRegionColor("e3f2fd");

		// Draw the chart
		geoChart.draw(dataTable, options);
	}

	private native JsArrayString getNativeArray() /*-{
		return ["0d47a1", "1565c0", "1976d2", "1e88e5", "2196f3", "42a5f5"];
	}-*/;
}
