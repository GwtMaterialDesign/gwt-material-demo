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
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.BubbleChart;
import com.googlecode.gwt.charts.client.corechart.BubbleChartOptions;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialBubbleChart extends Composite {

	private static MaterialBubbleChartUiBinder uiBinder = GWT.create(MaterialBubbleChartUiBinder.class);

	interface MaterialBubbleChartUiBinder extends UiBinder<Widget, MaterialBubbleChart> {
	}
	
	@UiField MaterialCardContent cardContent;
	private BubbleChart chart;

	public MaterialBubbleChart() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}
	
	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new BubbleChart();
				cardContent.add(chart);
				draw();
			}
		});
	}

	private void draw() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "ID");
		dataTable.addColumn(ColumnType.NUMBER, "Life Expectancy");
		dataTable.addColumn(ColumnType.NUMBER, "Fertility Rate");
		dataTable.addColumn(ColumnType.STRING, "Region");
		dataTable.addColumn(ColumnType.NUMBER, "Population");
		dataTable.addRows(4);
		dataTable.setValue(0, 0, "CAN");
		dataTable.setValue(1, 0, "DEU");
		dataTable.setValue(2, 0, "DNK");
		dataTable.setValue(3, 0, "EGY");
		dataTable.setValue(0, 1, 80.66);
		dataTable.setValue(1, 1, 79.84);
		dataTable.setValue(2, 1, 78.6);
		dataTable.setValue(3, 1, 72.73);
		dataTable.setValue(0, 2, 1.67);
		dataTable.setValue(1, 2, 1.36);
		dataTable.setValue(2, 2, 1.84);
		dataTable.setValue(3, 2, 2.78);
		dataTable.setValue(0, 3, "North America");
		dataTable.setValue(1, 3, "Europe");
		dataTable.setValue(2, 3, "Europe");
		dataTable.setValue(3, 3, "Africa");
		dataTable.setValue(0, 4, 33739900);
		dataTable.setValue(1, 4, 81902307);
		dataTable.setValue(2, 4, 5523095);
		dataTable.setValue(3, 4, 79716203);

		// Set options
		

		// Draw the chart
		chart.draw(dataTable, getOptions());
	}
	
	private BubbleChartOptions getOptions() {
		BubbleChartOptions options = BubbleChartOptions.create();
		options.setColors("2196f3", "42a5f5", "64b5f6");
		
		// Set Legend
		Legend legend = Legend.create();
		legend.setPosition(LegendPosition.TOP);
		options.setLegend(legend);
		
		return options;
	}

}
