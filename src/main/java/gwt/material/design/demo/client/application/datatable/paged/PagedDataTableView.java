package gwt.material.design.demo.client.application.datatable.paged;

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
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.base.viewport.Resolution;
import gwt.material.design.client.base.viewport.ViewPort;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.Display;
import gwt.material.design.client.constants.HideOn;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.data.ListDataSource;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialBadge;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.pager.MaterialDataPager;
import gwt.material.design.client.ui.pager.actions.PageListBox;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.demo.client.application.datatable.table.factory.PersonRowFactory;
import gwt.material.design.demo.client.application.datatable.table.renderer.CustomRenderer;
import gwt.material.design.demo.client.ui.NavigatedView;
import gwt.material.design.jquery.client.api.JQueryElement;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PagedDataTableView extends NavigatedView implements PagedDataTablePresenter.MyView {
    interface Binder extends UiBinder<Widget, PagedDataTableView> {
    }

    @UiField
    MaterialDataTable<Person> table;

    private MaterialDataPager<Person> pager = new MaterialDataPager<>();

    private ListDataSource<Person> dataSource;

    @Inject
    PagedDataTableView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        // Generate 20 categories
        int rowIndex = 1;
        List<Person> people = new ArrayList<>();
        for(int k = 1; k <= 10; k++){
            // Generate 100 rows
            for(int i = 1; i <= 10; i++, rowIndex++){
                people.add(new Person(i, "https//joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + rowIndex, "Field " + i, "Field " + rowIndex, "No " + i,"Category " + k));
            }
        }

        dataSource = new ListDataSource<>();
        dataSource.add(0, people);

        /* Uncomment to make use of listbox page selection instead of integerbox */
        /*pager.setPageSelection(new PageListBox());*/
        pager.setTable(table);
        pager.setDataSource(dataSource);

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
            public Comparator<? super RowComponent<Person>> sortComparator() {
                return (o1, o2) -> o1.getData().getFirstName().compareToIgnoreCase(o2.getData().getFirstName());
            }
            @Override
            public String getValue(Person object) {
                return object.getFirstName();
            }
        }, "First Name");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public Comparator<? super RowComponent<Person>> sortComparator() {
                return (o1, o2) -> o1.getData().getLastName().compareToIgnoreCase(o2.getData().getLastName());
            }
            @Override
            public String getValue(Person object) {
                return object.getLastName();
            }
        }, "Last Name");

        table.addColumn(new TextColumn<Person>() {
            @Override
            public boolean numeric() {
                return true;
            }
            @Override
            public HideOn hideOn() {
                return HideOn.HIDE_ON_MED_DOWN;
            }
            @Override
            public Comparator<? super RowComponent<Person>> sortComparator() {
                return (o1, o2) -> o1.getData().getPhone().compareToIgnoreCase(o2.getData().getPhone());
            }
            @Override
            public String getValue(Person object) {
                return object.getPhone();
            }
        }, "Phone");

        for (int i = 0; i < 20; i++) {
            final int index = i;
            table.addColumn(new TextColumn<Person>() {
                @Override
                public Comparator<? super RowComponent<Person>> sortComparator() {
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
            public TextAlign textAlign() {
                return TextAlign.CENTER;
            }
            @Override
            public MaterialBadge getValue(Person object) {
                MaterialBadge badge = new MaterialBadge();
                badge.setText("badge " + object.getId());
                badge.setBackgroundColor(Color.BLUE);
                badge.setLayoutPosition(Style.Position.RELATIVE);
                return badge;
            }
        });

        // Here we are adding a row expansion handler.
        // This is invoked when a row is expanded.
        table.addRowExpandingHandler(event -> {
            JQueryElement section = event.getExpansion().getOverlay();

            // Clear the content first.
            MaterialWidget content = new MaterialWidget(
                event.getExpansion().getContent().empty().asElement());

            // Fake Async Task
            // This is demonstrating a fake asynchronous call to load
            // the data inside the expansion element.
            new Timer() {
                @Override
                public void run() {
                    MaterialLabel title = new MaterialLabel("Expansion Row Panel");
                    title.setFontSize("1.6em");
                    title.setDisplay(Display.BLOCK);
                    MaterialLabel description = new MaterialLabel("This content was made from asynchronous call");

                    content.setPadding(20);
                    content.add(title);
                    content.add(description);

                    // Hide the expansion elements overlay section.
                    // The overlay is retrieved using EowExpand#getOverlay()
                    section.css("display", "none");
                }
            }.schedule(2000);
        });

        // Add a row select handler, called when a user selects a row.
        table.addRowSelectHandler(event -> {
            GWT.log(event.getModel().getId() + ": " + event.isSelected());
        });

        // Add a sort column handler, called when a user sorts a column.
        table.addColumnSortHandler(event -> {
            GWT.log("Sorted: " + event.getSortContext().getSortDir() + ", columnIndex: " + event.getColumnIndex());
            table.getView().refresh();
        });

        // Add category opened handler, called when a category is opened.
        table.addCategoryOpenedHandler(event -> {
            GWT.log("Category Opened: " + event.getName());
        });

        // Add category closed handler, called when a category is closed.
        table.addCategoryClosedHandler(event -> {
            GWT.log("Category Closed: " + event.getName());
        });

        // Add a row double click handler, called when a row is double clicked.
        table.addRowDoubleClickHandler(event -> {
            // GWT.log("Row Double Clicked: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
            Window.alert("Row Double Clicked: " + event.getModel().getId());
        });

        // Configure the tables long press duration configuration.
        // The short press is when a click is held less than this duration.
        table.setLongPressDuration(400);

        // Add a row long press handler, called when a row is long pressed.
        table.addRowLongPressHandler(event -> {
            //GWT.log("Row Long Pressed: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
        });

        // Add a row short press handler, called when a row is short pressed.
        table.addRowShortPressHandler(event -> {
            //.log("Row Short Pressed: " + model.getId() + ", x:" + mouseEvent.getPageX() + ", y: " + mouseEvent.getPageY());
        });

        ViewPort.when(Resolution.ALL_MOBILE).then(param1 -> {
            table.setHeight("60vh");
        }, viewPort -> {
            table.setHeight("100%");
            return false;
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
