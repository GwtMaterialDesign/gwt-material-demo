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
import com.googlecode.gwt.charts.client.corechart.CandlestickChart;
import com.googlecode.gwt.charts.client.corechart.CandlestickChartOptions;
import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import com.googlecode.gwt.charts.client.util.ChartHelper;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialCandleStick extends Composite {

	private static MaterialCandleStickUiBinder uiBinder = GWT.create(MaterialCandleStickUiBinder.class);

	interface MaterialCandleStickUiBinder extends UiBinder<Widget, MaterialCandleStick> {
	}

	@UiField MaterialCardContent cardContent;
	
	private CandlestickChart chart;

	public MaterialCandleStick() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				// Create and attach the chart
				chart = new CandlestickChart();
				cardContent.add(chart);
				draw();
			}
		});
	}

	private void draw() {
		JsArrayMixed dataArray = JsonUtils.unsafeEval("[['Mon',20,28,38,45],['Tue',31,38,55,66],['Wed',50,55,77,80],['Thu',77,77,66,50],['Fri',68,66,22,15]]");

		// Prepare the data
		DataTable dataTable = ChartHelper.arrayToDataTable(dataArray, true);

		// Set options
		CandlestickChartOptions options = CandlestickChartOptions.create();
		BackgroundColor bgColor = BackgroundColor.create();
		bgColor.setStroke("#2196f3");
		bgColor.setFill("#90caf9");
		bgColor.setStrokeWidth(2);
		
		
		
		options.setLegend(Legend.create(LegendPosition.NONE));
		options.setFallingColor(bgColor);
		options.setRisingColor(bgColor);

		// Draw the chart
		chart.draw(dataTable, options);
	}

}
