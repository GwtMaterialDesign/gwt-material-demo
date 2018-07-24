package gwt.material.design.demo.client.application.datatable.frozen;

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
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Display;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.data.HasCategories;
import gwt.material.design.client.data.RowExpansion;
import gwt.material.design.client.data.SelectionType;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.TableRow;
import gwt.material.design.client.ui.table.TableSubHeader;
import gwt.material.design.client.ui.table.cell.FrozenProperties;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.demo.client.application.datatable.table.Person;
import gwt.material.design.demo.client.application.datatable.table.factory.CustomCategoryFactory;
import gwt.material.design.demo.client.application.datatable.table.factory.PersonRowFactory;
import gwt.material.design.demo.client.application.datatable.table.renderer.CustomRenderer;
import gwt.material.design.demo.client.ui.NavigatedView;
import gwt.material.design.jquery.client.api.JQueryElement;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FrozenDataTableView extends NavigatedView implements FrozenDataTablePresenter.MyView {
    @UiField
    MaterialDataTable<Person> table;
    @UiField
    MaterialComboBox<SelectionType> listSelectionType;
    private List<Person> people;

    @Inject
    FrozenDataTableView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        generatePeople();

        // Populate the ComboBox value
        listSelectionType.addItem("SINGLE", SelectionType.SINGLE);
        listSelectionType.addItem("MULTIPLE", SelectionType.MULTIPLE);
        listSelectionType.addItem("NONE", SelectionType.NONE);

        listSelectionType.addValueChangeHandler(e -> {
            table.setSelectionType(e.getValue().get(0));
            table.getView().setRedraw(true);
            table.getView().refresh();
        });

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

            @Override
            public FrozenProperties frozenProperties() {
                FrozenProperties frozenProperties = new FrozenProperties("100px", "60px");
                return frozenProperties;
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

            @Override
            public FrozenProperties frozenProperties() {
                FrozenProperties frozenProperties = new FrozenProperties("100px", "60px");
                return frozenProperties;
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

            @Override
            public FrozenProperties frozenProperties() {
                FrozenProperties frozenProperties = new FrozenProperties("100px", "60px");
                return frozenProperties;
            }
        }, "Email");

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

        // Set the visible range of the table for  pager (later)
        table.setVisibleRange(0, 2001);

        table.setRowData(0, people);

        // Here we are adding a row expansion handler.
        // This is invoked when a row is expanded.
        table.addRowExpandingHandler(event -> {
            RowExpansion<Person> expansion = event.getExpansion();
            JQueryElement section = expansion.getOverlay();

            // Clear the content first.
            MaterialWidget content = new MaterialWidget(
                event.getExpansion().getContent().empty().asElement());

            // For frozen columns we will need to define the height of our expansion.
            // Since the frozen column requires us to use 'absolute' positioning the height
            // must be defined.
            expansion.setHeight("80px");

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
            GWT.log("Row Double Clicked: " + event.getModel().getId() + ", x:" + event.getMouseEvent().getPageX() + ", y: " + event.getMouseEvent().getPageY());
            Window.alert("Row Double Clicked: " + event.getModel().getId());
        });

        // Configure the tables long press duration configuration.
        // The short press is when a click is held less than this duration.
        table.setLongPressDuration(400);

        // Add a row long press handler, called when a row is long pressed.
        table.addRowLongPressHandler(event -> {
            GWT.log("Row Long Pressed: " + event.getModel().getId() + ", x:" + event.getMouseEvent().getPageX() + ", y: " + event.getMouseEvent().getPageY());
        });

        // Add a row short press handler, called when a row is short pressed.
        table.addRowShortPressHandler(event -> {
            GWT.log("Row Short Pressed: " + event.getModel().getId() + ", x:" + event.getMouseEvent().getPageX() + ", y: " + event.getMouseEvent().getPageY());
        });

        // Add rendered handler, called when 'setRowData' calls finish rendering.
        // Guaranteed to only be called once from the data set render, ignoring sort renders and refreshView renders.
        table.addRenderedHandler(e -> {
            GWT.log("Table Rendered");
        });

        // Add components rendered handler, Called each time when components are rendered,
        // which includes sorting renders and refreshView() renders.
        table.addComponentsRenderedHandler(e -> {
            GWT.log("Components Rendered");
        });
    }

    protected void generatePeople() {
        people = new ArrayList<>();
        // Generate 5 categories
        int rowIndex = 0;

        for (int k = 1; k <= 5; k++) {
            // Generate 5 rows
            for (int i = 1; i <= 5; i++, rowIndex++) {
                people.add(new Person(i, "http://joashpereira.com/templates/material_one_pager/img/avatar1.png", "Field " + rowIndex, "Field " + i, "Field " + rowIndex, "No " + i, "Category " + k));
            }
        }
    }

    @UiHandler("cbCategories")
    void onCategories(ValueChangeEvent<Boolean> e) {
        if (e.getValue()) {
            table.setUseCategories(true);
        } else {
            table.setUseCategories(false);
        }
        table.getView().setRedraw(true);
        table.getView().refresh();
    }

    @UiHandler("cbRowExpansion")
    void onRowExpansion(ValueChangeEvent<Boolean> e) {
        if (e.getValue()) {
            table.setUseRowExpansion(true);
        } else {
            table.setUseRowExpansion(false);
        }
        table.getView().setRedraw(true);
        table.getView().refresh();
    }

    @UiHandler("getFirstRow")
    void onGetFirstRow(ClickEvent e) {
        MaterialToast.fireToast("FIRST ROW: " + table.getRow(0).getData().getFirstName());
    }

    @UiHandler("updateFirstRow")
    void onUpdateFirstRow(ClickEvent e) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";

        if (people.get(0) != null) {
            Person firstPerson = people.get(0);
            firstPerson.setFirstName(firstName);
            firstPerson.setLastName(lastName);
            firstPerson.setEmail(email);
            table.updateRow(firstPerson);

            MaterialToast.fireToast("Updated first row : " + firstName + " " + lastName);
        } else {
            MaterialToast.fireToast("Can not find the first person.");
        }
    }

    @UiHandler("disabledFirstRow")
    void onDisableFirstRow(ClickEvent e) {
        TableRow tableRow = table.getRow(people.get(0)).getWidget();
        tableRow.setEnabled(false);
    }

    interface Binder extends UiBinder<Widget, FrozenDataTableView> {
    }

    public static class CustomCategoryComponent extends CategoryComponent {
        public CustomCategoryComponent(HasCategories parent, String category) {
            super(parent, category);
        }

        @Override
        protected void render(TableSubHeader subheader, int column) {
            super.render(subheader, column);

            subheader.setOpenIcon(IconType.FOLDER_OPEN);
            subheader.setCloseIcon(IconType.FOLDER);
        }
    }
}
