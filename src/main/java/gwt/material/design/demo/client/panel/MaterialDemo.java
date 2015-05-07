package gwt.material.design.demo.client.panel;


import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialTopNav;
import gwt.material.design.demo.client.Place;
import gwt.material.design.demo.client.resources.IMaterialConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDemo extends Composite {

	private static MaterialDemoUiBinder uiBinder = GWT.create(MaterialDemoUiBinder.class);

	interface MaterialDemoUiBinder extends UiBinder<Widget, MaterialDemo> {
	}
	
	@UiField HTMLPanel contentPanel;
	@UiField MaterialNavBar navBar;
	@UiField MaterialTopNav topNav;
	
	public MaterialDemo() {
		initWidget(uiBinder.createAndBindUi(this));
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				String token = event.getValue();
				handleHistoryToken(token);
			}
		});
		handleHistoryToken(History.getToken());
	}
	
	private void handleHistoryToken(String token) {
		Place place = Place.about;
		if (!"".equals(token)) {
			place = Place.valueOf(token);
		}
		changeNav(place);
	}

	@UiHandler("btnChat")
	void onChat(ClickEvent e){
		Window.open(IMaterialConstants.LINK_GITTER_CHAT, "", "");
	}
	
	@UiHandler("btnDownloadPhonegap")
	void onDownloadPhonegap(ClickEvent e){
		Window.open(IMaterialConstants.DOWNLOAD_PHONEGAP_APK, "_blank", "");
	}
	
	private void changeNav(Place place){
		navBar.hide();
		Window.scrollTo(0, 0);
		contentPanel.clear();
		contentPanel.add(place.getContent());
		topNav.setTitle(place.getTitle());
		topNav.setDescription(place.getDescription());
	}
}
