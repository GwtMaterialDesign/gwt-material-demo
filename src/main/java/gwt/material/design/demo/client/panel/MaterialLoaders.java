package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialNavBar;

public class MaterialLoaders extends Composite {

	private static MaterialLoaderUiBinder uiBinder = GWT.create(MaterialLoaderUiBinder.class);

	interface MaterialLoaderUiBinder extends UiBinder<Widget, MaterialLoaders> {
	}

	@UiField
	MaterialNavBar navBar;
	
	public MaterialLoaders() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("btnShowLoader")
	void onShowLoader(ClickEvent e){
		MaterialLoader.showLoading(true);
		Timer t = new Timer() {
			
			@Override
			public void run() {
				MaterialLoader.showLoading(false);
			}
		};
		t.schedule(3000);
	}
	
	@UiHandler("btnShowProgress")
	void onShowProgress(ClickEvent e){
		MaterialLoader.showProgress(true);
		Timer t = new Timer() {
			
			@Override
			public void run() {
				MaterialLoader.showProgress(false);
			}
		};
		t.schedule(3000);
	}
	
	@UiHandler("btnShowNavBarProgress")
	void onShowNavBarProgress(ClickEvent e){
		navBar.showProgress(true);
		Timer t = new Timer() {
			
			@Override
			public void run() {
				navBar.showProgress(false);
			}
		};
		t.schedule(3000);
	}

}
