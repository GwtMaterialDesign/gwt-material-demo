package gwt.material.design.demo.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MaterialResources extends ClientBundle {
	MaterialResources INSTANCE = GWT.create(MaterialResources.class);

	@Source("img/ic_gwt_logo.png")
	ImageResource ic_gwt_logo();

	@Source("img/ic_front.png")
	ImageResource ic_front();

	@Source("img/ic_bold.png")
	ImageResource ic_bold();

	@Source("img/ic_metaphor.png")
	ImageResource ic_metaphor();

	@Source("img/ic_motion.png")
	ImageResource ic_motion();

	@Source("img/ic_getting_started.png")
	ImageResource ic_getting_started();

	@Source("img/bg_top_nav.png")
	ImageResource bg_top_nav();

	@Source("img/yuna.jpg")
	ImageResource yuna();

	@Source("img/parallax1.jpg")
	ImageResource parallax1();

	@Source("img/parallax2.jpg")
	ImageResource parallax2();

	@Source("img/parallax3.jpg")
	ImageResource parallax3();

	@Source("img/ic_theme.png")
	ImageResource ic_theme();

	@Source("img/starter.png")
	ImageResource starter();

	@Source("img/ic_splash.png")
	ImageResource ic_splash();

	@Source("img/template_login.png")
	ImageResource template_login();

	@Source("img/template_parallax.gif")
	ImageResource template_parallax();

	@Source("img/template_starter.gif")
	ImageResource template_starter();

	@Source("img/template_wrenx.gif")
	ImageResource template_wrenx();
}
