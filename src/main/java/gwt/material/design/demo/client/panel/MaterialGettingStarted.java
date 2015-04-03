package gwt.material.design.demo.client.panel;

import gwt.material.design.demo.client.resources.IMaterialConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialGettingStarted extends Composite{

	private static MaterialGettingStartedUiBinder uiBinder = GWT
			.create(MaterialGettingStartedUiBinder.class);

	interface MaterialGettingStartedUiBinder extends
			UiBinder<Widget, MaterialGettingStarted> {
	}

	public MaterialGettingStarted() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("btnDownloadAsset")
	void onDownloadAsset(ClickEvent e){
		Window.open(IMaterialConstants.DOWNLOAD_MATERIALIZE, "_blank", "");
	}

	@UiHandler("btnDownloadJar")
	void onDownloadJar(ClickEvent e){
		Window.open(IMaterialConstants.DOWNLOAD_GWT_MATERIAL, "_blank", "");
	}
	
}	
