package gwt.material.design.demo.client;

import gwt.material.design.demo.client.panel.MaterialDemo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_material_design_demo implements EntryPoint {
	
	public void onModuleLoad() {
		RootPanel.get().add(new MaterialDemo());
	}
}
