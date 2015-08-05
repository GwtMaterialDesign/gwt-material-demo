package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.UnorderedList;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;

public class MaterialTransitions extends Composite {

	private static MaterialTransitionsUiBinder uiBinder = GWT
			.create(MaterialTransitionsUiBinder.class);

	interface MaterialTransitionsUiBinder extends
			UiBinder<Widget, MaterialTransitions> {
	}
	
	@UiField
	UnorderedList listContainer;
	@UiField
	MaterialImage image;
	
	public MaterialTransitions() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("btnStaggered")
	void onStaggered(ClickEvent e){
		MaterialAnimator.animate(Transition.SHOW_STAGGERED_LIST, listContainer, 0);
	}
	
	@UiHandler("btnFade")
	void onFade(ClickEvent e){
		MaterialAnimator.animate(Transition.FADE_IN_IMAGE, image, 0);
	}

}
