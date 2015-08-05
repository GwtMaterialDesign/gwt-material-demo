package gwt.material.design.demo.client.card;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.demo.client.showcase.MaterialLogin;
import gwt.material.design.demo.client.showcase.MaterialParallax;
import gwt.material.design.demo.shared.TemplateDTO;

public class TemplateCard extends Composite {

	private static TemplateCardUiBinder uiBinder = GWT
			.create(TemplateCardUiBinder.class);

	interface TemplateCardUiBinder extends UiBinder<Widget, TemplateCard> {
	}
	
	@UiField
	MaterialCard card;
	private TemplateDTO template;

	public TemplateCard(TemplateDTO template) {
		initWidget(uiBinder.createAndBindUi(this));
		setTemplate(template);
		card.setTitle(template.getName());
		card.setDescription(template.getDescription());
		card.setResource(template.getImg());
	}

	@UiHandler("btnDemo")
	void onDemo(ClickEvent e){
		if("Parallax Template".equals(getTemplate().getName())){
			RootPanel.get().clear();
			RootPanel.get().add(new MaterialParallax());
		}else if("Login Template".equals(getTemplate().getName())){
			RootPanel.get().clear();
			RootPanel.get().add(new MaterialLogin());
		}else{
			Window.open(getTemplate().getDemoLink(), "", "_blank");
		}
		
	}
	
	@UiHandler("btnSource")
	void onSource(ClickEvent e){
		Window.open(getTemplate().getSourceLink(), "", "_blank");
	}
	
	
	/**
	 * @return the template
	 */
	public TemplateDTO getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(TemplateDTO template) {
		this.template = template;
	}

}
