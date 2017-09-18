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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.*;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.TableSubHeader;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import gwt.material.design.demo.client.application.addins.datatable.table.factory.CustomCategoryFactory;
import gwt.material.design.demo.client.application.addins.datatable.table.factory.PersonRowFactory;
import gwt.material.design.demo.client.application.addins.datatable.table.renderer.CustomRenderer;
import gwt.material.design.jquery.client.api.JQueryElement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomTable extends Composite {
    public static class CustomCategoryComponent extends CategoryComponent {
        public CustomCategoryComponent(String category) {
            super(category);
        }

        @Override
        protected void render(TableSubHeader subheader) {
            super.render(subheader);

            subheader.setOpenIcon(IconType.FOLDER_OPEN);
            subheader.setCloseIcon(IconType.FOLDER);
        }
    }

    interface StandardGridUiBinder extends UiBinder<HTMLPanel, CustomTable> {
    }

    private static StandardGridUiBinder ourUiBinder = GWT.create(StandardGridUiBinder.class);

    @UiField
    MaterialDataTable<Person> table;

    public CustomTable() {
        initWidget(ourUiBinder.createAndBindUi(this));

        // Setting table title
        table.getTableTitle().setText("My Custom Table");

        //Adding / removing table toolpanel action buttons / icons
        Panel panel = table.getScaffolding().getToolPanel();
        panel.clear();
        // Add two buttons
        panel.add(new MaterialIcon(IconType.FAVORITE));
        panel.add(new MaterialIcon(IconType.DELETE));
        panel.add(new MaterialIcon(IconType.MESSAGE));

        // We will manually add this category otherwise categories
        // can be loaded on the fly with HasDataCategory, or a custom
        // RowComponentFactory as demonstrated below
        //table.addCategory(new CustomCategoryComponent("Custom Category"));

        // We will define our own person row factory to generate the
        // category name. This can be used to generate your own
        // RowComponent's too, if custom functionality is required.
        table.setRowFactory(new PersonRowFactory());

        // If we want to generate all our categories using CustomCategoryComponent
        // We can define our own CategoryComponentFactory. There we can define our
        // own CategoryComponent implementations.
        table.setCategoryFactory(new CustomCategoryFactory());

        // It is possible to create your own custom renderer per table
        // When you use the BaseRenderer you can override certain draw
        // methods to create elements the way you would like.
        table.setRenderer(new CustomRenderer<>());

        table.addColumn(new WidgetColumn<Person, MaterialImage>() {
            @Override
            public MaterialImage getValue(Person object) {
                MaterialImage profile = new MaterialImage();
                profile.setUrl(object.getPicture());
                profile.setWidth("40px");
                profile.setHeight("40px");
                profile.setPadding(4);
                profile.setMarginTop(8);
                profile.setBackgroundColor(Color.GREY_LIGHTEN_2);
                profile.setCircle(true);
                return profile;
            }
        });

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
            public Comparator<? super RowComponent<Person>> sortComparator() {
                return (o1, o2) -> o1.getData().getEmail().compareToIgnoreCase(o2.getData().getEmail());
            }

            @Override
            public String getValue(Person object) {
                return object.getEmail();
            }
        }, "Email");

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

        table.addColumn(new WidgetColumn<Person, MaterialComboBox>() {

            @Override
            public MaterialComboBox getValue(Person object) {
                MaterialComboBox<String> comboBox = new MaterialComboBox<>();
                comboBox.addItem("State 1", "State 1");
                comboBox.addItem("State 2", "State 2");
                comboBox.addItem("State 3", "State 3");
                comboBox.addItem("State 4", "State 4");
                comboBox.addItem("State 5", "State 5");
                return comboBox;
            }
        });

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
                badge.setLayoutPosition(Position.RELATIVE);
                return badge;
            }
        });

        // Set the visible range of the table for  pager (later)
        table.setVisibleRange(0, 2001);

        // Generate 20 categories
        int rowIndex = 0;
        List<Person> people = new ArrayList<>();
        for (int k = 1; k <= 5; k++) {
            // Generate 100 rows
            for (int i = 1; i <= 5; i++, rowIndex++) {
                people.add(new Person(i, "https://joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + rowIndex, "Field " + i, "Field " + rowIndex, "No " + i, "Category " + k));
            }
        }
        table.setRowData(0, people);

        // Here we are adding a row expansion handler.
        // This is invoked when a row is expanded.
        table.addRowExpandingHandler(event -> {
            JQueryElement section = event.getExpansion().getOverlay();

            // Fake Async Task
            // This is demonstrating a fake asynchronous call to load
            // the data inside the expansion element.
            new Timer() {
                @Override
                public void run() {
                    // Clear the content first.
                    JQueryElement element = event.getExpansion().getRow().find(".content").empty();
                    // Assign the jquery element to a GMD Widget
                    MaterialWidget content = new MaterialWidget(element);

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
    }
}