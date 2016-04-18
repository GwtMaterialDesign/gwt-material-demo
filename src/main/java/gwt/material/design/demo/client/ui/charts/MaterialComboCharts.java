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
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.ComboChart;
import com.googlecode.gwt.charts.client.corechart.ComboChartOptions;
import com.googlecode.gwt.charts.client.corechart.ComboChartSeries;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.SeriesType;
import com.googlecode.gwt.charts.client.options.VAxis;
import com.googlecode.gwt.charts.client.util.ChartHelper;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialComboCharts extends Composite {

	private static MaterialComboChartsUiBinder uiBinder = GWT.create(MaterialComboChartsUiBinder.class);

	interface MaterialComboChartsUiBinder extends UiBinder<Widget, MaterialComboCharts> {
	}

	@UiField MaterialCardContent cardContent;
	
	private ComboChart chart;
	
	public MaterialComboCharts() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}
	
	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new ComboChart();
				cardContent.add(chart);
				draw();
			}
		});
	}

	private void draw() {
		JsArrayMixed dataArray = JsonUtils
				.unsafeEval("[['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua  Guinea', 'Rwanda', 'Average'],['2004/05', 165, 938, 522, 998, 450, 614.6],['2005/06', 135, 1120, 599, 1268, 288, 682],['2006/07', 157, 1167, 587, 807, 397, 623],['2007/08', 139, 1110, 615, 968, 215, 609.4],['2008/09', 136, 691, 629, 1026, 366, 569.6]]");

		// Prepare the data
		DataTable dataTable = ChartHelper.arrayToDataTable(dataArray);

		// Set options
		ComboChartOptions options = ComboChartOptions.create();
		options.setFontName("Tahoma");
		options.setTitle("Monthly Coffee Production by Country");
		options.setHAxis(HAxis.create("Cups"));
		options.setVAxis(VAxis.create("Month"));
		options.setSeriesType(SeriesType.BARS);
		ComboChartSeries series = ComboChartSeries.create();
		series.setType(SeriesType.LINE);
		options.setSeries(5, series);

		// Draw the chart
		chart.draw(dataTable, options);
	}

}
