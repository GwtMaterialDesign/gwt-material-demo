package gwt.material.design.demo.client.panel.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialSliderFullscreen extends Composite {

	private static MaterialSliderFullscreenUiBinder uiBinder = GWT.create(MaterialSliderFullscreenUiBinder.class);

	interface MaterialSliderFullscreenUiBinder extends UiBinder<Widget, MaterialSliderFullscreen> {
	}

	public MaterialSliderFullscreen() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
