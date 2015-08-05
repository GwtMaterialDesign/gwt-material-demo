package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialSplashScreen;
import gwt.material.design.demo.client.resources.IMaterialConstants;
import gwt.material.design.demo.client.resources.MaterialResources;
import gwt.material.design.demo.client.showcase.MaterialLogin;
import gwt.material.design.demo.client.showcase.MaterialParallax;

public class MaterialShowcase extends Composite {

	private static MaterialShowcaseUiBinder uiBinder = GWT.create(MaterialShowcaseUiBinder.class);

	interface MaterialShowcaseUiBinder extends UiBinder<Widget, MaterialShowcase> {
	}

	public MaterialShowcase() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("btnLogin")
	void onLogin(ClickEvent e){
		RootPanel.get().clear();
		RootPanel.get().add(new MaterialLogin());
	}
	
	@UiHandler("btnParallax")
	void onParallax(ClickEvent e){
		RootPanel.get().clear();
		RootPanel.get().add(new MaterialParallax());
	}
	
	@UiHandler("btnPhoneGap")
	void onPhoneGap(ClickEvent e){
		Window.open(IMaterialConstants.DOWNLOAD_PHONEGAP_APK, "_blank", "");
	}
	
	@UiHandler("btnLoginSource")
	void onShowcase(ClickEvent e){
		Window.open(IMaterialConstants.SOURCE_LOGIN, "_blank", "");
	}
	
	@UiHandler("btnPhonegapSource")
	void onPhoneSourcePhoneGap(ClickEvent e){
		Window.open(IMaterialConstants.LINK_PHONEGAP_REPO, "_blank", "");
	}
	
	@UiHandler("btnParallaxSource")
	void onParallaxSource(ClickEvent e){
		Window.open(IMaterialConstants.SOURCE_PARALLAX, "_blank", "");
	}
	
	@UiHandler("btnSplashScreen")
	void onSplash(ClickEvent e){
		MaterialSplashScreen splash = new MaterialSplashScreen();
		splash.setSplashTime(5000);
		splash.setMain(new MaterialDemo());
		splash.setLogo(MaterialResources.INSTANCE.ic_splash());
		splash.setAppName("gwt-material");
		splash.setAppDescription("Material Design Look and Feel for GWT Apps");
		splash.setColor("blue");
		splash.setTextColor("white");
		splash.show();
	}
}
