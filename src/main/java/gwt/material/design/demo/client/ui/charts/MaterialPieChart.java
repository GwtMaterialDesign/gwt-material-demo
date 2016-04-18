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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.PieChart;
import com.googlecode.gwt.charts.client.corechart.PieChartOptions;
import com.googlecode.gwt.charts.client.corechart.PieChartTooltip;
import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.ChartArea;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.PieSliceText;
import com.googlecode.gwt.charts.client.options.Slice;
import com.googlecode.gwt.charts.client.options.TextStyle;
import gwt.material.design.client.ui.MaterialCardContent;

public class MaterialPieChart extends Composite {

	private static MaterialPieChartUiBinder uiBinder = GWT.create(MaterialPieChartUiBinder.class);

	interface MaterialPieChartUiBinder extends UiBinder<Widget, MaterialPieChart> {
	}

	@UiField MaterialCardContent cardContent;

	public MaterialPieChart() {
		initWidget(uiBinder.createAndBindUi(this));
		initializeRegularChart();
		initializeDonutChart();
		initialize3DChart();
	}

	private void initializeRegularChart() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				PieChart chart = new PieChart();
				chart.setWidth("100%");
				chart.setHeight("100%");
				cardContent.add(chart);
				DataTable dataTable = DataTable.create();
				dataTable.addColumn(ColumnType.STRING, "Task");
				dataTable.addColumn(ColumnType.NUMBER, "Hours per Day");
				dataTable.addRows(5);
				dataTable.setValue(0, 0, "Work");
				dataTable.setValue(0, 1, 11);
				dataTable.setValue(1, 0, "Sleep");
				dataTable.setValue(1, 1, 7);
				dataTable.setValue(2, 0, "Watch TV");
				dataTable.setValue(2, 1, 3);
				dataTable.setValue(3, 0, "Eat");
				dataTable.setValue(3, 1, 2);
				dataTable.setValue(4, 0, "Commute");
				dataTable.setValue(4, 1, 1);

				PieOpt opt = new PieOpt();
				opt.setColors("2196f3", "42a5f5", "64b5f6", "90caf9", "bbdefb");

				chart.draw(dataTable, opt.get());
			}
		});

	}

	private void initializeDonutChart() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				PieChart chart = new PieChart();
				chart.setWidth("100%");
				chart.setHeight("100%");
				cardContent.add(chart);
				DataTable dataTable = DataTable.create();
				dataTable.addColumn(ColumnType.STRING, "Task");
				dataTable.addColumn(ColumnType.NUMBER, "Hours per Day");
				dataTable.addRows(5);
				dataTable.setValue(0, 0, "Work");
				dataTable.setValue(0, 1, 11);
				dataTable.setValue(1, 0, "Sleep");
				dataTable.setValue(1, 1, 7);
				dataTable.setValue(2, 0, "Watch TV");
				dataTable.setValue(2, 1, 3);
				dataTable.setValue(3, 0, "Eat");
				dataTable.setValue(3, 1, 2);
				dataTable.setValue(4, 0, "Commute");
				dataTable.setValue(4, 1, 1);

				PieOpt opt = new PieOpt();
				opt.setColors("2196f3", "42a5f5", "64b5f6", "90caf9", "bbdefb");
				opt.setHole(0.8);

				chart.draw(dataTable, opt.get());
			}
		});
	}

	private void initialize3DChart() {
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				PieChart chart = new PieChart();
				chart.setWidth("100%");
				chart.setHeight("100%");
				cardContent.add(chart);
				DataTable dataTable = DataTable.create();
				dataTable.addColumn(ColumnType.STRING, "Task");
				dataTable.addColumn(ColumnType.NUMBER, "Hours per Day");
				dataTable.addRows(5);
				dataTable.setValue(0, 0, "Work");
				dataTable.setValue(0, 1, 11);
				dataTable.setValue(1, 0, "Sleep");
				dataTable.setValue(1, 1, 7);
				dataTable.setValue(2, 0, "Watch TV");
				dataTable.setValue(2, 1, 3);
				dataTable.setValue(3, 0, "Eat");
				dataTable.setValue(3, 1, 2);
				dataTable.setValue(4, 0, "Commute");
				dataTable.setValue(4, 1, 1);

				PieOpt opt = new PieOpt();
				opt.setColors("2196f3", "42a5f5", "64b5f6", "90caf9", "bbdefb");
				opt.setIs3D(true);

				chart.draw(dataTable, opt.get());
			}
		});
	}
	
	/**
	 * Adding a Donut Pie Functionality
	 * 
	 * @author DES
	 * 
	 */
	class PieOpt {
		private PieChartOptions _this;

		private PieOpt() {
			_this = PieChartOptions.create();
		}

		public PieOpt newInstance() {
			return new PieOpt();
		}

		public PieChartOptions get() {
			return _this;
		}

		public final void setBackgroundColor(BackgroundColor backgroundColor) {
			_this.setBackgroundColor(backgroundColor);
		}

		public final void setBackgroundColor(String color) {
			_this.setBackgroundColor(color);
		}

		public final void setChartArea(ChartArea chartArea) {
			_this.setChartArea(chartArea);
		}

		public final void setColors(String... colors) {
			_this.setColors(colors);
		}

		public final void setFontName(String name) {
			_this.setFontName(name);
		}

		public final void setFontSize(double size) {
			_this.setFontSize(size);
		}

		public final void setIs3D(boolean is3D) {
			_this.setIs3D(is3D);
		}

		public final void setLegend(Legend legend) {
			_this.setLegend(legend);
		}

		public final void setPieResidueSliceColor(String pieResidueSliceColor) {
			_this.setPieResidueSliceColor(pieResidueSliceColor);
		}

		public final void setPieResidueSliceLabel(String pieResidueSliceLabel) {
			_this.setPieResidueSliceLabel(pieResidueSliceLabel);
		}

		public final void setPieSliceBorderColor(String pieSliceBorderColor) {
			_this.setPieSliceBorderColor(pieSliceBorderColor);
		}

		public final void setPieSliceText(PieSliceText pieSliceText) {
			_this.setPieSliceText(pieSliceText);
		}

		public final void setPieSliceTextStyle(TextStyle pieSliceTextStyle) {
			_this.setPieSliceTextStyle(pieSliceTextStyle);
		}

		public final void setReverseCategories(boolean reverseCategories) {
			_this.setReverseCategories(reverseCategories);
		}

		public final void setSlices(JsArray<Slice> slices) {
			_this.setSlices(slices);
		}

		public final void setSliceVisibilityThreshold(double sliceVisibilityThreshold) {
			_this.setSliceVisibilityThreshold(sliceVisibilityThreshold);
		}

		public final void setTitle(String title) {
			_this.setTitle(title);
		}

		public final void setTitleTextStyle(TextStyle textStyle) {
			_this.setTitleTextStyle(textStyle);
		}

		public final void setTooltip(PieChartTooltip tooltip) {
			_this.setTooltip(tooltip);
		}

		public void setHole(double d) {
			setHole(get(), d);
		}

		private final native void setHole(PieChartOptions chartOptions, double d) /*-{
			chartOptions.pieHole = d;
		}-*/;
	}

}
