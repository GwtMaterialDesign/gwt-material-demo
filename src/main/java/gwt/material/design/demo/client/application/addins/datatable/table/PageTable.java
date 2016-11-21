package gwt.material.design.demo.client.application.addins.datatable.table;

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
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.*;
import gwt.material.design.client.data.ListDataSource;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.pager.MaterialDataPager;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import gwt.material.design.demo.client.application.addins.datatable.table.factory.PersonRowFactory;
import gwt.material.design.demo.client.application.addins.datatable.table.renderer.CustomRenderer;
import gwt.material.design.jquery.client.api.JQueryElement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class PageTable extends Composite {

    interface PageGridUiBinder extends UiBinder<HTMLPanel, PageTable> {
    }

    private static PageGridUiBinder ourUiBinder = GWT.create(PageGridUiBinder.class);

    @UiField
    MaterialDataTable<Person> table;

    private MaterialDataPager pager = new MaterialDataPager();

    private ListDataSource<Person> dataSource;

    public PageTable() {
        // Generate 20 categories
        int rowIndex = 1;
        List<Person> people = new ArrayList<>();
        for(int k = 1; k <= 10; k++){
            // Generate 100 rows
            for(int i = 1; i <= 10; i++, rowIndex++){
                people.add(new Person(i, "http://joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + rowIndex, "Field " + i, "Field " + rowIndex, "No " + i,"Category " + k));
            }
        }

        initWidget(ourUiBinder.createAndBindUi(this));

        dataSource = new ListDataSource<>();
        dataSource.add(0, people);

        pager.setTable(table);
        pager.setDataSource(dataSource);

    }

    @Override
    protected void onLoad() {
        super.onLoad();

        table.setVisibleRange(1, 10);
        table.add(pager);

        // We will manually add this category otherwise categories
        // can be loaded on the fly with HasDataCategory, or a custom
        // RowComponentFactory as demonstrated below
        //table.addCategory(new CustomCategoryComponent("Custom Category"));

        // We will define our own person row factory to generate the
        // category name. This can be used to generate your own
        // RowComponent's too, if custom functionality is required.
        table.setRowFactory(new PersonRowFactory());

        // It is possible to create your own custom renderer per table
        // When you use the BaseRenderer you can override certain draw
        // methods to create elements the way you would like.
        table.setRenderer(new CustomRenderer<>());

        // Now we will add our tables columns.
        // There are a number of methods that can provide custom column configurations.

        table.addColumn(new TextColumn<Person>() {
            @Override
            public Comparator<? super RowComponent<Person>> getSortComparator() {
                return (o1, o2) -> o1.getData().getFirstName().compareToIgnoreCase(o2.getData().getFirstName());
            }
            @Override
            public String getValue(Person object) {
                return object.getFirstName();
            }
        }, "First Name");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public Comparator<? super RowComponent<Person>> getSortComparator() {
                return (o1, o2) -> o1.getData().getLastName().compareToIgnoreCase(o2.getData().getLastName());
            }
            @Override
            public String getValue(Person object) {
                return object.getLastName();
            }
        }, "Last Name");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public boolean isNumeric() {
                return true;
            }
            @Override
            public HideOn getHideOn() {
                return HideOn.HIDE_ON_MED_DOWN;
            }
            @Override
            public Comparator<? super RowComponent<Person>> getSortComparator() {
                return (o1, o2) -> o1.getData().getPhone().compareToIgnoreCase(o2.getData().getPhone());
            }
            @Override
            public String getValue(Person object) {
                return object.getPhone();
            }
        }, "Phone");

        for(int i = 0; i < 8; i++) {
            final int index = i;
            table.addColumn(new TextColumn<Person>() {
                @Override
                public Comparator<? super RowComponent<Person>> getSortComparator() {
                    return (o1, o2) -> o1.getData().getPhone().compareToIgnoreCase(o2.getData().getPhone());
                }
                @Override
                public String getValue(Person object) {
                    return object.getPhone() + " " + index;
                }
            }, "Column " + index);
        }

        // Example of a widget column!
        // You can add any handler to the column cells widget.
        table.addColumn(new WidgetColumn<Person, MaterialBadge>() {
            @Override
            public TextAlign getTextAlign() {
                return TextAlign.CENTER;
            }
            @Override
            public MaterialBadge getValue(Person object) {
                MaterialBadge badge = new MaterialBadge();
                badge.setText("badge " + object.getId());
                badge.setBackgroundColor(Color.BLUE);
                badge.setLayoutPosition(Position.RELATIVE);
                return badge;
            }
        });

        // Here we are adding a row expansion handler.
        // This is invoked when a row is expanded.
        table.addRowExpandHandler((e, rowExpand) -> {
            JQueryElement section = rowExpand.getOverlay();

            if(rowExpand.isExpand()) {
                // Fake Async Task
                // This is demonstrating a fake asynchronous call to load
                // the data inside the expansion element.
                new Timer() {
                    @Override
                    public void run() {
                        // Clear the content first.
                        MaterialWidget content = new MaterialWidget(
                                rowExpand.getRow().find(".content").empty().asElement());

                        // Add new content.
                        MaterialBadge badge = new MaterialBadge("This content", Color.WHITE, Color.BLUE);
                        badge.getElement().getStyle().setPosition(Position.RELATIVE);
                        badge.getElement().getStyle().setRight(0, Unit.PX);
                        badge.setFontSize(12, Unit.PX);
                        content.add(badge);

                        MaterialButton btn = new MaterialButton("was made", ButtonType.RAISED,
                                new MaterialIcon(IconType.FULLSCREEN));
                        content.add(btn);

                        MaterialTextBox textBox = new MaterialTextBox();
                        textBox.setText(" from an asynchronous");
                        textBox.setGwtDisplay(Display.INLINE_TABLE);
                        textBox.setWidth("200px");
                        content.add(textBox);

                        MaterialIcon icon = new MaterialIcon(IconType.CALL);
                        icon.getElement().getStyle().setPosition(Position.RELATIVE);
                        icon.getElement().getStyle().setTop(12, Unit.PX);
                        content.add(icon);

                        // Hide the expansion elements overlay section.
                        // The overlay is retrieved using EowExpand#getOverlay()
                        section.css("display", "none");
                    }
                }.schedule(2000);
            }
            return true;
        });

        // Add a row select handler, called when a user selects a row.
        table.addRowSelectHandler((e, model, elem, selected) -> {
            GWT.log(model.getId() + ": " + selected);
            return true;
        });

        // Add a sort column handler, called when a user sorts a column.
        table.addSortColumnHandler((e, sortContext, columnIndex) -> {
            GWT.log("Sorted: " + sortContext.getSortDir() + ", columnIndex: " + columnIndex);
            table.refreshView();
            return true;
        });

        // Add a row count change handler, called when the row count changes.
        table.addRowCountChangeHandler((e, newCount, isExact) -> {
            GWT.log("Row Count Changed: " + newCount + ", isExact: " + isExact);
            return true;
        });

        // Add category opened handler, called when a category is opened.
        table.addCategoryOpenedHandler((e, categoryName) -> {
            GWT.log("Category Opened: " + categoryName);
            return true;
        });

        // Add category closed handler, called when a category is closed.
        table.addCategoryClosedHandler((e, categoryName) -> {
            GWT.log("Category Closed: " + categoryName);
            return true;
        });

        // Add a row double click handler, called when a row is double clicked.
        table.addRowDoubleClickHandler((e, mouseEvent, model, row) -> {
           // GWT.log("Row Double Clicked: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
            Window.alert("Row Double Clicked: " + model.getId());
            return true;
        });

        // Configure the tables long press duration configuration.
        // The short press is when a click is held less than this duration.
        table.setLongPressDuration(400);

        // Add a row long press handler, called when a row is long pressed.
        table.addRowLongPressHandler((e, mouseEvent, model, row) -> {
            //GWT.log("Row Long Pressed: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
            return true;
        });

        // Add a row short press handler, called when a row is short pressed.
        table.addRowShortPressHandler((e, mouseEvent, model, row) -> {
            //.log("Row Short Pressed: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
            return true;
        });
    }

    @UiHandler("btnGotoFirstPage")
    void onGotoFirstPage(ClickEvent e) {
        pager.firstPage();
    }

    @UiHandler("btnGotoLastPage")
    void onGotoLastPage(ClickEvent e) {
        pager.lastPage();
    }
}