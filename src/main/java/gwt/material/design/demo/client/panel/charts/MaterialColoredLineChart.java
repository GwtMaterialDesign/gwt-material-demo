package gwt.material.design.demo.client.panel.charts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.LineChart;
import com.googlecode.gwt.charts.client.corechart.LineChartOptions;
import com.googlecode.gwt.charts.client.options.*;
import gwt.material.design.client.ui.MaterialCard;

public class MaterialColoredLineChart extends Composite {

	private static MaterialChartPanelUiBinder uiBinder = GWT.create(MaterialChartPanelUiBinder.class);

	interface MaterialChartPanelUiBinder extends UiBinder<Widget, MaterialColoredLineChart> {
	}

	@UiField
	MaterialCard chartCard;
	private LineChart chart;

	public MaterialColoredLineChart() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	

	@Override
	protected void onAttach() {
		initialize();
	}



	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new LineChart();
				chartCard.addContent(chart);
				draw();
				Timer timer = new Timer() {
				      public void run() {
				        draw2();
				      }
				    };
				timer.schedule(2000);
			}
		});
	}

	private void draw() {

		String[] countries = new String[] { "Austria", "Bulgaria", "Denmark", "Greece" };
		int[] years = new int[] { 2003, 2004, 2005, 2006, 2007, 2008 };
		int[][] values = new int[][] { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Year");
		for (int i = 0; i < countries.length; i++) {
			dataTable.addColumn(ColumnType.NUMBER, countries[i]);
		}
		dataTable.addRows(years.length);
		for (int i = 0; i < years.length; i++) {
			dataTable.setValue(i, 0, String.valueOf(years[i]));
		}
		for (int col = 0; col < values.length; col++) {
			for (int row = 0; row < values[col].length; row++) {
				dataTable.setValue(row, col + 1, values[col][row]);
			}
		}

		chart.draw(dataTable, getOptions());
	}

	private void draw2() {

		String[] countries = new String[] { "Austria", "Bulgaria", "Denmark", "Greece" };
		int[] years = new int[] { 2003, 2004, 2005, 2006, 2007, 2008 };
		int[][] values = new int[][] { { 1336060, 1538156, 1576579, 1600652, 1968113, 1901067 }, { 400361, 366849, 440514, 434552, 393032, 517206 }, { 1001582, 1119450, 993360, 1004163, 979198, 916965 }, { 997974, 941795, 930593, 897127, 1080887, 1056036 } };

		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Year");
		for (int i = 0; i < countries.length; i++) {
			dataTable.addColumn(ColumnType.NUMBER, countries[i]);
		}
		dataTable.addRows(years.length);
		for (int i = 0; i < years.length; i++) {
			dataTable.setValue(i, 0, String.valueOf(years[i]));
		}
		for (int col = 0; col < values.length; col++) {
			for (int row = 0; row < values[col].length; row++) {
				dataTable.setValue(row, col + 1, values[col][row]);
			}
		}

		chart.draw(dataTable, getOptions());
	}

	private LineChartOptions getOptions() {
		// Options
		LineChartOptions options = LineChartOptions.create();
		options.setBackgroundColor("#2196F3");

		// Legends
		Legend legend = Legend.create();
		legend.setPosition(LegendPosition.NONE);
		options.setLegend(legend);

		// Text Styles
		TextStyle hStyle = TextStyle.create();
		hStyle.setColor("90caf9");

		// Grid Lines
		Gridlines lines = Gridlines.create();
		lines.setColor("1e88e5");

		// HAxis and VAxis
		HAxis hAxis = HAxis.create("");
		VAxis vAxis = VAxis.create("");
		hAxis.setTextStyle(hStyle);
		hAxis.setGridlines(lines);
		vAxis.setTextStyle(hStyle);
		vAxis.setGridlines(lines);

		options.setHAxis(hAxis);
		options.setVAxis(vAxis);

		CurveType type = CurveType.NONE;

		options.setColors("white");
		options.setEnableInteractivity(true);
		options.setCurveType(type);
		options.setPointSize(5);

		// Set Animation
		Animation animation = Animation.create();
		animation.setEasing(AnimationEasing.OUT);
		animation.setDuration(250);

		options.setAnimation(animation);
		return options;
	}

}
