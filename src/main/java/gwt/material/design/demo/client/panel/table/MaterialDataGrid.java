package gwt.material.design.demo.client.panel.table;

import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionModel;
import gwt.material.design.client.custom.MaterialButtonCell;
import gwt.material.design.client.custom.MaterialCheckBoxCell;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.resources.IMaterialConstants;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaterialDataGrid extends Composite {

	private static MaterialDataGridUiBinder uiBinder = GWT.create(MaterialDataGridUiBinder.class);

	interface MaterialDataGridUiBinder extends UiBinder<Widget, MaterialDataGrid> {
	}

	private List<OrderDTO> orders = new ArrayList<OrderDTO>();

	private DataGrid<OrderDTO> dataGrid;
	private ListDataProvider<OrderDTO> orderDTOProvider;
	private ListHandler<OrderDTO> sortDataHandler;
	private final ProvidesKey<OrderDTO> KEY_PROVIDER = new ProvidesKey<OrderDTO>() {

		@Override
		public Object getKey(OrderDTO item) {
			return item.getId();
		}
	};

	private final SelectionModel<OrderDTO> selectionModel = new MultiSelectionModel<OrderDTO>(KEY_PROVIDER);

	private OrderDTO OrderDTO;

	@UiField
	SimplePanel gridPanel, pagerPanel;

	public MaterialDataGrid() {
		initWidget(uiBinder.createAndBindUi(this));
		setGrid();
	}

	private void setGrid() {
		dataGrid = createDatagrid();
		gridPanel.setWidget(dataGrid);
		refreshData();
	}

	private void refreshData() {
		orderDTOProvider.setList(new ArrayList<OrderDTO>());
		getAllOrderDTO();
	}

	private DataGrid<OrderDTO> createDatagrid() {

		this.sortDataHandler = new ListHandler<OrderDTO>(new ArrayList<OrderDTO>());

		Column<OrderDTO, Boolean> checkColumn = new Column<OrderDTO, Boolean>(new MaterialCheckBoxCell()) {
			@Override
			public Boolean getValue(OrderDTO object) {
				boolean value = selectionModel.isSelected(object);
				
				return value;
			}
		};
		
		FieldUpdater<OrderDTO, Boolean> checkColumnFU = new FieldUpdater<OrderDTO, Boolean>() {

            @Override
            public void update(int index, OrderDTO object, Boolean value) {
                selectionModel.setSelected(object, value);
            }
        };
        checkColumn.setFieldUpdater(checkColumnFU);

		TextColumn<OrderDTO> colUser = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getUser();
			}
		};
		colUser.setSortable(true);
		sortDataHandler.setComparator(colUser, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getUser().compareTo(o2.getUser());
			}
		});

		TextColumn<OrderDTO> colName = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getName();
			}
		};
		colName.setSortable(true);
		sortDataHandler.setComparator(colName, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		TextColumn<OrderDTO> colPrice = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getPrice();
			}
		};
		colPrice.setSortable(true);
		sortDataHandler.setComparator(colPrice, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getPrice().compareTo(o2.getPrice());
			}
		});

		Column<OrderDTO, MaterialButton> showLogBtnColumn = new Column<OrderDTO, MaterialButton>(new MaterialButtonCell()) {
            @Override
            public MaterialButton getValue(OrderDTO object) {
                
                MaterialButton mb = new MaterialButton("Show log", "blue", "light");
                mb.setIcon("mdi-action-polymer");
                mb.setIconPosition("left");
                mb.getElement().getStyle().setProperty("display", "inline-flex");
                return mb;
            }
            
        };
        
        showLogBtnColumn.setFieldUpdater(new FieldUpdater<OrderDTO, MaterialButton>() {
			
			@Override
			public void update(int index, OrderDTO object, MaterialButton value) {
				MaterialToast.alert(object.getName());
			}
		});

		final DataGrid<OrderDTO> dataGrid = new DataGrid<OrderDTO>(100, KEY_PROVIDER);
		dataGrid.setSize("100%", "75vh");

		dataGrid.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
		dataGrid.setColumnWidth(checkColumn, "40px");
		dataGrid.addColumn(colUser, "User");
		dataGrid.addColumn(colName, "Item Name");
		dataGrid.addColumn(colPrice, "Price");
		dataGrid.addColumn(showLogBtnColumn, "Action");

		dataGrid.setStyleName("responsive-table");
		

		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		SimplePager pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(dataGrid);

		orderDTOProvider = new ListDataProvider<OrderDTO>();
		orderDTOProvider.addDataDisplay(dataGrid);
		dataGrid.addColumnSortHandler(sortDataHandler);

		return dataGrid;

	}

	private void getAllOrderDTO() {
		orders.add(new OrderDTO(1, "Marjorie", "Nexus", "Php 30000"));
		orders.add(new OrderDTO(1, "Karah", "Asus", "Php 23000"));
		orders.add(new OrderDTO(1, "Xenia", "Oppo", "Php 30000"));
		orders.add(new OrderDTO(1, "Alejandria", "Samsung", "Php 40000"));
		orderDTOProvider.setList(orders);
		sortDataHandler.setList(orderDTOProvider.getList());
	}

	public OrderDTO getOrderDTO() {
		return OrderDTO;
	}

	public void setOrderDTO(OrderDTO OrderDTO) {
		this.OrderDTO = OrderDTO;
	}
	
	@UiHandler("rbDefault")
	void onDefault(ClickEvent e){
		dataGrid.setStyleName("responsive-table");
	}
	
	@UiHandler("rbBordered")
	void onBordered(ClickEvent e){
		dataGrid.setStyleName("bordered responsive-table");
	}
	
	@UiHandler("rbStriped")
	void onStriped(ClickEvent e){
		dataGrid.setStyleName("striped responsive-table");
	}

	@UiHandler("rbHoverable")
	void onHoverable(ClickEvent e){
		dataGrid.setStyleName("hoverable responsive-table");
	}
	
	@UiHandler("btnSource")
	void onSource(ClickEvent e){
		Window.open(IMaterialConstants.LINK_DATAGRID, "", "_blank");
	}
	
}
