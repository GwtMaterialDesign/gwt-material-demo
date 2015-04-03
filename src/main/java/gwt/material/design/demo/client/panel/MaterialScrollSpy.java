package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialScrollSpy extends Composite {

	private static MaterialScrollSpyUiBinder uiBinder = GWT.create(MaterialScrollSpyUiBinder.class);

	interface MaterialScrollSpyUiBinder extends UiBinder<Widget, MaterialScrollSpy> {
	}

	public MaterialScrollSpy() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	

	@Override
	protected void onAttach() {
		// TODO Auto-generated method stub
		super.onAttach();
		initScrollSpy();
	}



	public native void initScrollSpy()/*-{
		$wnd.jQuery(document).ready(function() {
			$wnd.jQuery('.scrollspy').scrollSpy();
		});
	}-*/;

}
