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
}
