package gwt.material.design.demo.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MaterialResources extends ClientBundle {
	public static final MaterialResources INSTANCE = GWT.create(MaterialResources.class);

	ImageResource ic_gwt_logo();
	ImageResource ic_front();
	ImageResource ic_bold();
	ImageResource ic_metaphor();
	ImageResource ic_motion();
	ImageResource ic_getting_started();
	ImageResource bg_top_nav();
	ImageResource yuna();
	ImageResource parallax1();
	ImageResource parallax2();
	ImageResource parallax3();
	ImageResource ic_theme();
	ImageResource starter();
	ImageResource ic_splash();
	
	ImageResource template_login();
	ImageResource template_parallax();
	ImageResource template_starter();
	ImageResource template_wrenx();
}
