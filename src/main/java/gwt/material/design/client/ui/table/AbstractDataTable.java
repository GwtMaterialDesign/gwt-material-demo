/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.client.ui.table;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.HasCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.dom.client.TableCellElement;
import com.google.gwt.dom.client.TableRowElement;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.view.client.Range;
import gwt.material.design.client.base.constants.TableCssName;
import gwt.material.design.client.data.DataSource;
import gwt.material.design.client.data.Renderer;
import gwt.material.design.client.data.SelectionType;
import gwt.material.design.client.data.SortDir;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.component.ComponentFactory;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.data.events.SetupEvent;
import gwt.material.design.client.data.events.SetupHandler;
import gwt.material.design.client.data.factory.RowComponentFactory;
import gwt.material.design.client.events.DefaultHandlerRegistry;
import gwt.material.design.client.events.HandlerRegistry;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.jquery.client.api.Functions.EventFunc1;
import gwt.material.design.jquery.client.api.Functions.EventFunc2;
import gwt.material.design.jquery.client.api.Functions.EventFunc3;
import gwt.material.design.jquery.client.api.JQueryElement;
import gwt.material.design.jquery.client.api.MouseEvent;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.data.DataView;
import gwt.material.design.client.data.StandardDataView;
import gwt.material.design.client.data.SortContext;
import gwt.material.design.client.ui.table.cell.Column;
import gwt.material.design.client.ui.table.events.RowExpansion;
import gwt.material.design.jscore.client.api.core.Element;

import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An abstract data table implementation that can be attached to the DOM.
 * The core functionality is based on the registered {@link DataView},
 * this will handle scaffolding, event registration, and attachment.
 *
 * @author Ben Dol
 */
public abstract class AbstractDataTable<T> extends MaterialWidget implements DataDisplay<T>,
        HandlerRegistry {

    private static final Logger logger = Logger.getLogger(AbstractDataTable.class.getName());

    public static class DefaultTableScaffolding extends AbstractTableScaffolding {
        @Override
        public MaterialWidget createTableBody() {
            MaterialWidget tableBody = new MaterialWidget(DOM.createDiv());
            tableBody.addStyleName(TableCssName.TABLE_BODY);
            return tableBody;
        }

        @Override
        public MaterialWidget createTopPanel() {
            MaterialWidget topPanel = new MaterialWidget(DOM.createDiv());
            topPanel.addStyleName(TableCssName.TOP_PANEL);
            return topPanel;
        }

        @Override
        public MaterialWidget createInfoPanel() {
            MaterialWidget infoPanel = new MaterialWidget(DOM.createDiv());
            infoPanel.addStyleName(TableCssName.INFO_PANEL);
            return infoPanel;
        }

        @Override
        public MaterialWidget createToolPanel() {
            MaterialWidget toolPanel = new MaterialWidget(DOM.createDiv());
            toolPanel.addStyleName(TableCssName.TOOL_PANEL);
            return toolPanel;
        }

        @Override
        protected Table createTable() {
            Table table = new Table();
            table.addStyleName(TableCssName.TABLE);
            return table;
        }

        @Override
        protected XScrollPanel createXScrollPanel(Panel container) {
            return new XScrollPanel(container);
        }
    }

    protected DataView<T> view;
    protected TableScaffolding scaffolding;
    protected HandlerRegistry handlerRegistry;

    private boolean focused;
    private boolean refreshing;
    private boolean cellIsEditing;
    private boolean destroyOnUnload;

    private HandlerRegistration setupHandler;

    public AbstractDataTable() {
        this(new StandardDataView<>());
    }

    public AbstractDataTable(DataView<T> view) {
        this(view, new DefaultTableScaffolding());
    }

    public AbstractDataTable(TableScaffolding scaffolding) {
        this();
        this.scaffolding = scaffolding;
    }

    public AbstractDataTable(DataView<T> view, TableScaffolding scaffolding) {
        super(DOM.createElement("section"));
        this.view = view;
        this.scaffolding = scaffolding;

        view.setDisplay(this);
        setStyleName("table-container");

        handlerRegistry = new DefaultHandlerRegistry(this);

        // Build the table scaffolding
        scaffolding.build();
        scaffolding.apply(this);

        // Apply the DOM build.
        build();
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        if(!view.isSetup()) {
            try {
                view.setup(scaffolding);
            } catch (Exception ex) {
                logger.log(Level.SEVERE,
                    "Could not setup AbstractDataTable due to previous errors.", ex);
            }
        // We should recalculate when we load again.
        } else if(view.isUseCategories()) {
            view.getSubheaderLib().recalculate(true);
        }
    }

    @Override
    protected void onUnload() {
        super.onUnload();

        clearHandlers();

        if(destroyOnUnload) {
            view.destroy();
        }
    }

    @Override
    public final DataView<T> getView() {
        return view;
    }

    @Override
    public final Range getVisibleRange() {
        return view.getVisibleRange();
    }

    @Override
    public final void setVisibleRange(int start, int length) {
        view.setVisibleRange(start, length);
    }

    @Override
    public final void setVisibleRange(Range range) {
        view.setVisibleRange(range);
    }

    @Override
    public final int getRowCount() {
        return view.getRowCount();
    }

    @Override
    public final void setRowData(int start, List<? extends T> values) {
        view.setRowData(start, values);
    }

    @Override
    public final void setCategoryFactory(ComponentFactory<? extends CategoryComponent, String> categoryFactory) {
        view.setCategoryFactory(categoryFactory);
    }

    @Override
    public final CategoryComponent getCategory(String categoryName) {
        return view.getCategory(categoryName);
    }

    @Override
    public final List<CategoryComponent> getCategories() {
        return view.getCategories();
    }

    @Override
    public final List<CategoryComponent> getOpenCategories() {
        return view.getOpenCategories();
    }

    @Override
    public final boolean isCategoryEmpty(CategoryComponent category) {
        return view.isCategoryEmpty(category);
    }

    @Override
    public final void addCategory(String category) {
        view.addCategory(category);
    }

    @Override
    public final void addCategory(CategoryComponent category) {
        view.addCategory(category);
    }

    @Override
    public final boolean hasCategory(String categoryName) {
        return view.hasCategory(categoryName);
    }

    @Override
    public final void disableCategory(String categoryName) {
        view.disableCategory(categoryName);
    }

    @Override
    public final void enableCategory(String categoryName) {
        view.enableCategory(categoryName);
    }

    @Override
    public final void openCategory(String categoryName) {
        view.openCategory(categoryName);
    }

    @Override
    public final void openCategory(CategoryComponent category) {
        view.openCategory(category);
    }

    @Override
    public final void closeCategory(String categoryName) {
        view.closeCategory(categoryName);
    }

    @Override
    public final void closeCategory(CategoryComponent category) {
        view.closeCategory(category);
    }

    @Override
    public final void clearRowsAndCategories(boolean clearData) {
        view.clearRowsAndCategories(clearData);
    }

    @Override
    public final void clearCategories() {
        view.clearCategories();
    }

    @Override
    public final void addColumn(Column<T, ?> column) {
        view.addColumn(column);
    }

    @Override
    public final void addColumn(Column<T, ?> column, String header) {
        view.addColumn(column, header);
    }

    @Override
    public final void insertColumn(int beforeIndex, Column<T, ?> col, String header) {
        view.insertColumn(beforeIndex, col, header);
    }

    @Override
    public final void removeColumn(int colIndex) {
        view.removeColumn(colIndex);
    }

    @Override
    public final void removeColumns() {
        view.removeColumns();
    }

    @Override
    public final List<Column<T, ?>> getColumns() {
        return view.getColumns();
    }

    @Override
    public final int getColumnOffset() {
        return view.getColumnOffset();
    }

    @Override
    public final void sort(int columnIndex) {
        view.sort(columnIndex);
    }

    @Override
    public final void sort(int columnIndex, SortDir dir) {
        view.sort(columnIndex, dir);
    }

    @Override
    public final void sort(Column<T, ?> column) {
        view.sort(column);
    }

    @Override
    public final void sort(Column<T, ?> column, SortDir dir) {
        view.sort(column, dir);
    }

    @Override
    public final int getLeftFrozenColumns() {
        return view.getLeftFrozenColumns();
    }

    @Override
    public final int getRightFrozenColumns() {
        return view.getRightFrozenColumns();
    }

    @Override
    public final void setDataSource(DataSource<T> dataSource) {
        view.setDataSource(dataSource);
    }

    @Override
    public final DataSource<T> getDataSource() {
        return view.getDataSource();
    }

    @Override
    public final void setRenderer(Renderer<T> renderer) {
        view.setRenderer(renderer);
    }

    @Override
    public final int getTotalRows() {
        return view.getTotalRows();
    }

    @Override
    public final void setTotalRows(int totalRows) {
        view.setTotalRows(totalRows);
    }

    @Override
    public final int getRowHeight() {
        return view.getRowHeight();
    }

    @Override
    public final void setRowHeight(int rowHeight) {
        view.setRowHeight(rowHeight);
    }

    @Override
    public final void updateRow(T model) {
        view.updateRow(model);
    }

    @Override
    public final RowComponent<T> getRow(T model) {
        return view.getRow(model);
    }

    @Override
    public final RowComponent<T> getRow(int index) {
        return view.getRow(index);
    }

    @Override
    public final RowComponent<T> getRowByModel(T model) {
        return view.getRowByModel(model);
    }

    @Override
    public final void clearRows(boolean clearData) {
        view.clearRows(clearData);
    }

    @Override
    public final void setRowFactory(RowComponentFactory<T> rowFactory) {
        view.setRowFactory(rowFactory);
    }

    @Override
    public RowComponentFactory<T> getRowFactory() {
        return view.getRowFactory();
    }

    @Override
    public final void setSelectionType(SelectionType selectionType) {
        view.setSelectionType(selectionType);
    }

    @Override
    public final SelectionType getSelectionType() {
        return view.getSelectionType();
    }

    @Override
    public final void selectAllRows(boolean select) {
        view.selectAllRows(select);
    }

    @Override
    public final void selectAllRows(boolean select, boolean fireEvent) {
        view.selectAllRows(select, fireEvent);
    }

    @Override
    public final void toggleRowSelect(com.google.gwt.dom.client.Element row) {
        view.toggleRowSelect(row);
    }

    @Override
    public final void toggleRowSelect(com.google.gwt.dom.client.Element row, boolean fireEvent) {
        view.toggleRowSelect(row, fireEvent);
    }

    @Override
    public final void selectRow(com.google.gwt.dom.client.Element row, boolean fireEvent) {
        view.selectRow(row, fireEvent);
    }

    @Override
    public final void deselectRow(com.google.gwt.dom.client.Element row, boolean fireEvent) {
        view.deselectRow(row, fireEvent);
    }

    @Override
    public final boolean hasDeselectedRows(boolean visibleOnly) {
        return view.hasDeselectedRows(visibleOnly);
    }

    @Override
    public final boolean hasSelectedRows(boolean visibleOnly) {
        return view.hasSelectedRows(visibleOnly);
    }

    @Override
    public final List<T> getSelectedRowModels(boolean visibleOnly) {
        return view.getSelectedRowModels(visibleOnly);
    }

    @Override
    public final boolean isUseStickyHeader() {
        return view.isUseStickyHeader();
    }

    @Override
    public final void setUseStickyHeader(boolean stickyHeader) {
        view.setUseStickyHeader(stickyHeader);
    }

    @Override
    public final boolean isUseCategories() {
        return view.isUseCategories();
    }

    @Override
    public final void setUseCategories(boolean useCategories) {
        view.setUseCategories(useCategories);
    }

    @Override
    public final boolean isUseLoadOverlay() {
        return view.isUseLoadOverlay();
    }

    @Override
    public final void setUseLoadOverlay(boolean useLoadOverlay) {
        view.setUseLoadOverlay(useLoadOverlay);
    }

    @Override
    public final boolean isUseRowExpansion() {
        return view.isUseRowExpansion();
    }

    @Override
    public final void setUseRowExpansion(boolean useRowExpansion) {
        view.setUseRowExpansion(useRowExpansion);
    }

    @Override
    public final int getLongPressDuration() {
        return view.getLongPressDuration();
    }

    @Override
    public final void setLongPressDuration(int longPressDuration) {
        view.setLongPressDuration(longPressDuration);
    }

    @Override
    public final String getHeight() {
        return view.getHeight();
    }

    @Override
    public final void setHeight(String height) {
        view.setHeight(height);
    }

    @Override
    public void onBrowserEvent(Event event) {
        CellBasedWidgetImpl.get().onBrowserEvent(this, event);

        // Ignore spurious events (such as onblur) while we refresh the table.
        if (refreshing) {
            return;
        }

        // Verify that the target is still a child of this widget. IE fires focus
        // events even after the element has been removed from the DOM.
        EventTarget eventTarget = event.getEventTarget();
        if (!com.google.gwt.dom.client.Element.is(eventTarget)) {
            return;
        }
        com.google.gwt.dom.client.Element target = com.google.gwt.dom.client.Element.as(eventTarget);
        if (!getElement().isOrHasChild(com.google.gwt.dom.client.Element.as(eventTarget))) {
            return;
        }
        super.onBrowserEvent(event);

        String eventType = event.getType();
        if (BrowserEvents.FOCUS.equals(eventType)) {
            // Remember the focus state.
            focused = true;
            onFocus();
        } else if (BrowserEvents.BLUR.equals(eventType)) {
            // Remember the blur state.
            focused = false;
            onBlur();
        } else if (BrowserEvents.KEYDOWN.equals(eventType)) {
            // A key event indicates that we already have focus.
            focused = true;
        } else if (BrowserEvents.MOUSEDOWN.equals(eventType)
            && CellBasedWidgetImpl.get().isFocusable(com.google.gwt.dom.client.Element.as(target))) {
            // If a natively focusable element was just clicked, then we must have
            // focus.
            focused = true;
        }
    }

    protected void onFocus() {
        // Do nothing by default
    }

    protected void onBlur() {
        // Do nothing by default
    }

    /**
     * Get the index of the row value from the associated {@link TableRowElement}.
     *
     * @param row the row element
     * @return the row value index
     */
    public final int getRowValueIndex(TableRowElement row) {
        return row.getSectionRowIndex() + getView().getVisibleRange().getStart();
    }

    /**
     * Fire an event to the Cell within the specified {@link TableCellElement}.
     */
    private <C> void fireEventToCell(Event event, String eventType, com.google.gwt.dom.client.Element parentElem,
                                     final T rowValue, Context context, HasCell<T, C> column) {
        // Check if the cell consumes the event.
        Cell<C> cell = column.getCell();
        if (!cellConsumesEventType(cell, eventType)) {
            return;
        }

        C cellValue = column.getValue(rowValue);
        boolean cellWasEditing = cell.isEditing(context, parentElem, cellValue);
        if (column instanceof Column) {
          /*
           * If the HasCell is a Column, let it handle the event itself. This is
           * here for legacy support.
           */
            Column<T, C> col = (Column<T, C>) column;
            col.onBrowserEvent(context, parentElem, rowValue, event);
        } else {
            // Create a FieldUpdater.
            final FieldUpdater<T, C> fieldUpdater = column.getFieldUpdater();
            final int index = context.getIndex();
            ValueUpdater<C> valueUpdater = (fieldUpdater == null) ? null : (value) -> {
                fieldUpdater.update(index, rowValue, value);
            };

            // Fire the event to the cell.
            cell.onBrowserEvent(context, parentElem, cellValue, event, valueUpdater);
        }

        // Reset focus if needed.
        cellIsEditing = cell.isEditing(context, parentElem, cellValue);
        if (cellWasEditing && !cellIsEditing) {
            CellBasedWidgetImpl.get().resetFocus(() -> {
                setFocus(true);
            });
        }
    }

    /**
     * Check if a cell consumes the specified event type.
     *
     * @param cell the cell
     * @param eventType the event type to check
     * @return true if consumed, false if not
     */
    protected boolean cellConsumesEventType(Cell<?> cell, String eventType) {
        Set<String> consumedEvents = cell.getConsumedEvents();
        return consumedEvents != null && consumedEvents.contains(eventType);
    }

    /**
     * Get the tables scaffolding elements.
     */
    @Override
    public TableScaffolding getScaffolding() {
        return scaffolding;
    }

    /**
     * @deprecated use {@link #addSetupHandler(SetupHandler)}
     */
    @Deprecated
    public void setLoadedCallback(LoadedCallback callback) {
        if(setupHandler != null) {
            setupHandler.removeHandler();
            setupHandler = null;
        }
        setupHandler = addSetupHandler(event -> {
            callback.onLoaded();
        });
    }

    /**
     * Event fired when the tables view calls {@link DataView#setup(TableScaffolding)}.
     * @return Handler registration to remove the event handler.
     */
    public HandlerRegistration addSetupHandler(SetupHandler handler) {
        return addHandler(handler, SetupEvent.TYPE);
    }

    public boolean isDestroyOnUnload() {
        return destroyOnUnload;
    }

    public void setDestroyOnUnload(boolean destroyOnUnload) {
        this.destroyOnUnload = destroyOnUnload;
    }

    // JQuery Event Handler

    @Override
    public HandlerRegistration registerHandler(HandlerRegistration registration) {
        return handlerRegistry.registerHandler(registration);
    }

    @Override
    public void clearHandlers() {
        handlerRegistry.clearHandlers();
    }

    @Override
    public void removeJQueryHandlers() {
        $this().off("." + view.getId());
    }

    @Override
    public void addSelectAllHandler(EventFunc3<List<T>, List<JQueryElement>, Boolean> handler) {
        $this().on(TableEvents.SELECT_ALL + "." + view.getId(), handler);
    }

    @Override
    public void removeSelectAllHandler(EventFunc3<List<T>, List<JQueryElement>, Boolean> handler) {
        $this().off(TableEvents.SELECT_ALL, handler);
    }

    @Override
    public void removeSelectAllHandlers() {
        $this().off(TableEvents.SELECT_ALL);
    }

    @Override
    public void addRowSelectHandler(EventFunc3<T, Element, Boolean> handler) {
        $this().on(TableEvents.ROW_SELECT + "." + view.getId(), handler);
    }

    @Override
    public void removeRowSelectHandler(EventFunc3<T, Element, Boolean> handler) {
        $this().off(TableEvents.ROW_SELECT, handler);
    }

    @Override
    public void removeRowSelectHandlers() {
        $this().off(TableEvents.ROW_SELECT);
    }

    @Override
    public void addStretchHandler(EventFunc1<Boolean> handler) {
        $this().on(TableEvents.STRETCH + "." + view.getId(), handler);
    }

    @Override
    public void removeStretchHandler(EventFunc1<Boolean> handler) {
        $this().off(TableEvents.STRETCH, handler);
    }

    @Override
    public void removeStretchHandlers() {
        $this().off(TableEvents.STRETCH);
    }

    @Override
    public void addRowExpandHandler(EventFunc1<RowExpansion> handler) {
        $this().on(TableEvents.ROW_EXPAND + "." + view.getId(), handler);
    }

    @Override
    public void removeRowExpandHandler(EventFunc1<RowExpansion> handler) {
        $this().off(TableEvents.ROW_EXPAND, handler);
    }

    @Override
    public void removeRowExpandHandlers() {
        $this().off(TableEvents.ROW_EXPAND);
    }

    @Override
    public void addRowExpandedHandler(EventFunc1<RowExpansion> handler) {
        $this().on(TableEvents.ROW_EXPANDED + "." + view.getId(), handler);
    }

    @Override
    public void removeRowExpandedHandler(EventFunc1<RowExpansion> handler) {
        $this().off(TableEvents.ROW_EXPANDED, handler);
    }

    @Override
    public void removeRowExpandedHandlers() {
        $this().off(TableEvents.ROW_EXPANDED);
    }

    @Override
    public void addRowCollapseHandler(EventFunc1<RowExpansion> handler) {
        $this().on(TableEvents.ROW_COLLAPSE + "." + view.getId(), handler);
    }

    @Override
    public void removeRowCollapseHandler(EventFunc1<RowExpansion> handler) {
        $this().off(TableEvents.ROW_COLLAPSE, handler);
    }

    @Override
    public void removeRowCollapseHandlers() {
        $this().off(TableEvents.ROW_COLLAPSE);
    }

    @Override
    public void addRowCollapsedHandler(EventFunc1<RowExpansion> handler) {
        $this().on(TableEvents.ROW_COLLAPSED + "." + view.getId(), handler);
    }

    @Override
    public void removeRowCollapsedHandler(EventFunc1<RowExpansion> handler) {
        $this().off(TableEvents.ROW_COLLAPSED, handler);
    }

    @Override
    public void removeRowCollapsedHandlers() {
        $this().off(TableEvents.ROW_COLLAPSED);
    }

    @Override
    public void addRowCountChangeHandler(EventFunc2<Integer, Boolean> handler) {
        $this().on(TableEvents.ROW_COUNT_CHANGE + "." + view.getId(), handler);
    }

    @Override
    public void removeRowCountChangeHandler(EventFunc2<Integer, Boolean> handler) {
        $this().off(TableEvents.ROW_COUNT_CHANGE, handler);
    }

    @Override
    public void removeRowCountChangeHandlers() {
        $this().off(TableEvents.ROW_COUNT_CHANGE);
    }

    @Override
    public void addRowContextMenuHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().on(TableEvents.ROW_CONTEXTMENU + "." + view.getId(), handler);
    }

    @Override
    public void removeRowContextMenuHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().off(TableEvents.ROW_CONTEXTMENU, handler);
    }

    @Override
    public void removeRowContextMenuHandlers() {
        $this().off(TableEvents.ROW_CONTEXTMENU);
    }

    @Override
    public void addRowDoubleClickHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().on(TableEvents.ROW_DOUBLECLICK + "." + view.getId(), handler);
    }

    @Override
    public void removeRowDoubleClickHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().off(TableEvents.ROW_DOUBLECLICK, handler);
    }

    @Override
    public void removeRowDoubleClickHandlers() {
        $this().off(TableEvents.ROW_DOUBLECLICK);
    }

    @Override
    public void addRowLongPressHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().on(TableEvents.ROW_LONGPRESS + "." + view.getId(), handler);
    }

    @Override
    public void removeRowLongPressHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().off(TableEvents.ROW_LONGPRESS, handler);
    }

    @Override
    public void removeRowLongPressHandlers() {
        $this().off(TableEvents.ROW_LONGPRESS);
    }

    @Override
    public void addRowShortPressHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().on(TableEvents.ROW_SHORTPRESS + "." + view.getId(), handler);
    }

    @Override
    public void removeRowShortPressHandler(EventFunc3<MouseEvent, T, Element> handler) {
        $this().off(TableEvents.ROW_SHORTPRESS, handler);
    }

    @Override
    public void removeRowShortPressHandlers() {
        $this().off(TableEvents.ROW_SHORTPRESS);
    }

    @Override
    public void addSortColumnHandler(EventFunc2<SortContext, Integer> handler) {
        $this().on(TableEvents.SORT_COLUMN + "." + view.getId(), handler);
    }

    @Override
    public void removeSortColumnHandler(EventFunc2<SortContext, Integer> handler) {
        $this().off(TableEvents.SORT_COLUMN, handler);
    }

    @Override
    public void removeSortColumnHandlers() {
        $this().off(TableEvents.SORT_COLUMN);
    }

    @Override
    public void addCategoryOpenedHandler(EventFunc1<String> handler) {
        $this().on(TableEvents.CATEGORY_OPENED + "." + view.getId(), handler);
    }

    @Override
    public void removeCategoryOpenedHandler(EventFunc1<String> handler) {
        $this().off(TableEvents.CATEGORY_OPENED, handler);
    }

    @Override
    public void removeCategoryOpenedHandlers() {
        $this().off(TableEvents.CATEGORY_OPENED);
    }

    @Override
    public void addCategoryClosedHandler(EventFunc1<String> handler) {
        $this().on(TableEvents.CATEGORY_CLOSED + "." + view.getId(), handler);
    }

    @Override
    public void removeCategoryClosedHandler(EventFunc1<String> handler) {
        $this().off(TableEvents.CATEGORY_CLOSED, handler);
    }

    @Override
    public void removeCategoryClosedHandlers() {
        $this().off(TableEvents.CATEGORY_CLOSED);
    }

    @Override
    public void addComponentsRenderedHandler(Functions.EventFunc handler) {
        $this().on(TableEvents.COMPONENTS_RENDERED + "." + view.getId(), handler);
    }

    @Override
    public void removeComponentsRenderedHandler(Functions.EventFunc handler) {
        $this().off(TableEvents.COMPONENTS_RENDERED, handler);
    }

    @Override
    public void removeComponentsRenderedHandlers() {
        $this().off(TableEvents.COMPONENTS_RENDERED);
    }

    @Override
    public void addRenderedHandler(Functions.EventFunc handler) {
        $this().on(TableEvents.RENDERED + "." + view.getId(), handler);
    }

    @Override
    public void removeRenderedHandler(Functions.EventFunc handler) {
        $this().off(TableEvents.RENDERED, handler);
    }

    @Override
    public void removeRenderedHandlers() {
        $this().off(TableEvents.RENDERED);
    }
}
