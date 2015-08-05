package gwt.material.design.demo.client.showcase;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.demo.client.panel.MaterialDemo;

public class MaterialLogin extends Composite {

	private static MaterialLoginUiBinder uiBinder = GWT.create(MaterialLoginUiBinder.class);

	interface MaterialLoginUiBinder extends UiBinder<Widget, MaterialLogin> {
	}

	public MaterialLogin() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("btnLogin")
	void onLogin(ClickEvent e){
		RootPanel.getBodyElement().addClassName("white");
		RootPanel.get().clear();
		RootPanel.get().add(new MaterialDemo());
	}
	
}
