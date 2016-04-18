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
import com.googlecode.gwt.charts.client.corechart.AreaChart;
import com.googlecode.gwt.charts.client.corechart.AreaChartOptions;
import com.googlecode.gwt.charts.client.options.Animation;
import com.googlecode.gwt.charts.client.options.AnimationEasing;
import com.googlecode.gwt.charts.client.options.ChartArea;
import com.googlecode.gwt.charts.client.options.Gridlines;
import com.googlecode.gwt.charts.client.options.HAxis;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.LegendAlignment;
import com.googlecode.gwt.charts.client.options.LegendPosition;
import com.googlecode.gwt.charts.client.options.TextPosition;
import com.googlecode.gwt.charts.client.options.VAxis;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialAreaChart extends Composite {

	private static MaterialAreaChartUiBinder uiBinder = GWT.create(MaterialAreaChartUiBinder.class);

	interface MaterialAreaChartUiBinder extends UiBinder<Widget, MaterialAreaChart> {
	}

	@UiField
	MaterialCardContent cardContent;
	
	private AreaChart chart;
	boolean isLoop = false;
	
	private int[][] values = new int[][] { { 165, 135, 157, 139, 136 }, { 938, 1120, 1167, 1110, 691 }, { 522, 599, 587, 615, 629 }, { 998, 1268, 807, 968, 1026 }, { 450, 288, 397, 215, 366 } };
	private int[][] valuesInitial = new int[][] { {1167 , 1110, 938, 1120, 691 }, { 135, 165, 165, 157, 136 }, { 450, 288, 397, 215, 366 }, { 522, 599, 587, 615, 629 }, { 998, 1268, 807, 968, 1026 } };
	private String[] countries = new String[] { "Bolivia", "Ecuador", "Madagascar", "Papua Guinea", "Rwanda" };
	private String[] months = new String[] { "2004/05", "2005/06", "2006/07", "2007/08", "2008/09" };
	
	public MaterialAreaChart() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	private void initialize() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				chart = new AreaChart();
				cardContent.add(chart);
				// Prepare the data with loop inside to populate the initial data 
				setLoop();
			}
		});
	}

	private void setLoop() {
		Timer timer = new Timer() {
		  public void run() {
			  if(isLoop) {
				  drawChart(values);
				  isLoop = false;
			  } else {
				  drawChart(valuesInitial);
				  isLoop = true;
			  }
		  }
		};
		timer.scheduleRepeating(1000);
	}
	
	private void drawChart(int[][] values) {
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Year");
		for (int i = 0; i < countries.length; i++) {
			dataTable.addColumn(ColumnType.NUMBER, countries[i]);
		}
		dataTable.addRows(months.length);
		for (int i = 0; i < months.length; i++) {
			dataTable.setValue(i, 0, months[i]);
		}
		for (int col = 0; col < values.length; col++) {
			for (int row = 0; row < values[col].length; row++) {
				dataTable.setValue(row, col + 1, values[col][row]);
			}
		}
		chart.draw(dataTable, getOptions());
	}
	
	private AreaChartOptions getOptions() {
		//Grid Lines
		Gridlines lines = Gridlines.create();
		lines.setColor("fff");

		// Text Positions X and Y Axis
		HAxis hAxis = HAxis.create();
		hAxis.setTextPosition(TextPosition.NONE);

		VAxis vAxis = VAxis.create();
		vAxis.setTextPosition(TextPosition.NONE);
		vAxis.setGridlines(lines);
		hAxis.setGridlines(lines);
		// Legend
		Legend legend = Legend.create();
		legend.setPosition(LegendPosition.TOP);
		legend.setAligment(LegendAlignment.END);

		// Set options
		AreaChartOptions options = AreaChartOptions.create();
		options.setIsStacked(true);
		options.setAreaOpacity(1);
		options.setVAxis(vAxis);
		options.setHAxis(hAxis);
		options.setLegend(legend);
		options.setColors("2196f3", "42a5f5", "64b5f6", "90caf9", "bbdefb");
		
		ChartArea area = ChartArea.create();
		area.setTop(0);
		area.setLeft(0);
		area.setWidth("100%");
		area.setHeight("100%");
		options.setChartArea(area);
		
		//Set Animation
		Animation animation = Animation.create();
		animation.setDuration(500);
		animation.setEasing(AnimationEasing.OUT);
		options.setAnimation(animation);
		
		return options;
	}

}
