package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialModal.TYPE;
import gwt.material.design.client.ui.MaterialToast;

public class MaterialDialogs extends Composite {

	private static MaterialDialogsUiBinder uiBinder = GWT.create(MaterialDialogsUiBinder.class);

	interface MaterialDialogsUiBinder extends UiBinder<Widget, MaterialDialogs> {
	}

	public MaterialDialogs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	@UiHandler("btnToast")
	void onToast(ClickEvent e){
		MaterialToast.alert("I Love Material Design");
	}
	
	@UiHandler("btnToastAction")
	void onToastAction(ClickEvent e){
		MaterialLink link = new MaterialLink("UNDO", "yellow");
		link.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				MaterialToast.alert("UNDO DONE");
			}
		});
		MaterialToast.alert("Item Deleted", link);
	}
	
	@UiHandler("btnToastRounded")
	void onToastStyle(ClickEvent e){
		MaterialToast.alert("I Love Material Design", "rounded");
	}
	
	@UiHandler("btnModal")
	void onModal(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), TYPE.DEFAULT);
	}
	
	@UiHandler("btnMoadalBottomSheets")
	void onModalBottom(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), TYPE.BOTTOM_SHEET);
	}
	
	@UiHandler("btnModalFixFooter")
	void onModalFix(ClickEvent e){
		MaterialModal.showModal(new ModalContent(), TYPE.FIXED_FOOTER);
	}
	
	@UiHandler("btnWindow")
	void onWindowModal(ClickEvent e){
		MaterialModal.showWindow(new ModalContent(), TYPE.WINDOW, "Window Title", "blue");
	}
}
