package gwt.material.design.demo.client.showcase;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WindowDialog extends Composite {

	private static WindowDialogUiBinder uiBinder = GWT
			.create(WindowDialogUiBinder.class);

	interface WindowDialogUiBinder extends UiBinder<Widget, WindowDialog> {
	}

	public WindowDialog() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
