package gwt.material.design.demo.client.ui.charts;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


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
import com.googlecode.gwt.charts.client.corechart.BarChart;
import com.googlecode.gwt.charts.client.corechart.BarChartOptions;
import com.googlecode.gwt.charts.client.options.Animation;
import com.googlecode.gwt.charts.client.options.AnimationEasing;
import com.googlecode.gwt.charts.client.options.Bar;
import com.googlecode.gwt.charts.client.options.Gridlines;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendAlignment;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import com.googlecode.gwt.charts.client.options.TextPosition;
import com.googlecode.gwt.charts.client.options.VAxis;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialBarChart extends Composite {

	private static MaterialBarChartUiBinder uiBinder = GWT.create(MaterialBarChartUiBinder.class);

	interface MaterialBarChartUiBinder extends UiBinder<Widget, MaterialBarChart> {
	}

	@UiField
	MaterialCardContent cardContent;

	private boolean isLoop;
	private BarChart chart;
	private String[] countries = new String[] { "Austria", "Bulgaria", "Denmark", "Greece" };
	private int[] years = new int[] { 2003, 2004, 2005 };
	private int[][] values = new int[][] { { 1336060, 1538156, 1576579 }, { 400361, 366849, 440514 }, { 1001582, 1119450, 993360 }, { 997974, 941795, 930593 } };
	private int[][] valuesInitial = new int[][] { { 1538156, 1336060, 1576579 }, { 366849, 400361, 440514}, { 1001582, 993360, 1119450 }, { 941795, 997974, 930593 } };

	public MaterialBarChart() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new BarChart();
				cardContent.add(chart);
				
				// Prepare the data with loop inside to populate the initial data
				setLoop();
			}
		});
	}

	private void setLoop() {

		Timer timer = new Timer() {

			public void run() {
				if (isLoop) {
					drawChart(values);
					isLoop = false;
				}
				else {
					drawChart(valuesInitial);
					isLoop = true;
				}

			}
		};
		timer.scheduleRepeating(1000);
	}

	private void drawChart(int[][] values) {

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

		// Draw the chart
		chart.draw(dataTable, getOptions());
	}

	private BarChartOptions getOptions() {
		// Grid Lines
		Gridlines lines = Gridlines.create();
		lines.setColor("fff");

		// Text Positions X and Y Axis
		HAxis hAxis = HAxis.create();
		hAxis.setTextPosition(TextPosition.NONE);

		VAxis vAxis = VAxis.create();
		vAxis.setGridlines(lines);
		hAxis.setGridlines(lines);

		// Legend
		Legend legend = Legend.create();
		legend.setPosition(LegendPosition.NONE);
		legend.setAligment(LegendAlignment.START);

		// Set options
		BarChartOptions options = BarChartOptions.create();
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Year"));
		options.setColors("#2196f3", "#42a5f5", "#64b5f6", "#90caf9");
		options.setVAxis(vAxis);
		options.setHAxis(hAxis);
		options.setLegend(legend);
		
		// Set Animation
		Animation animation = Animation.create();
		animation.setDuration(500);
		animation.setEasing(AnimationEasing.OUT);
		options.setAnimation(animation);
		
		// Set Bar
		Bar bar = Bar.create();
		bar.setGroupWidth("50%");
		
		return options;
	}

}
