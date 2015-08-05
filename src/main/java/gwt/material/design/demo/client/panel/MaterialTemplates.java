package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.demo.client.card.TemplateCard;
import gwt.material.design.demo.client.resources.IMaterialConstants;
import gwt.material.design.demo.client.resources.MaterialResources;
import gwt.material.design.demo.shared.TemplateDTO;

import java.util.ArrayList;
import java.util.List;

public class MaterialTemplates extends Composite {

	private static MaterialTemplatesUiBinder uiBinder = GWT
			.create(MaterialTemplatesUiBinder.class);

	interface MaterialTemplatesUiBinder extends
			UiBinder<Widget, MaterialTemplates> {
	}
	
	@UiField
	MaterialRow rowTemplate;

	public MaterialTemplates() {
		initWidget(uiBinder.createAndBindUi(this));
		
		for(TemplateDTO template : getAllTemplates()){
			rowTemplate.add(new TemplateCard(template));
		}
		
	}
	
	public List<TemplateDTO> getAllTemplates(){
		List<TemplateDTO> templates = new ArrayList<TemplateDTO>();
		templates.add(new TemplateDTO("Starter Template", MaterialResources.INSTANCE.template_starter(), "Inbox UI / UX Template.", IMaterialConstants.DEMO_STARTER, IMaterialConstants.SOURCE_STARTER));
		templates.add(new TemplateDTO("Map Template", MaterialResources.INSTANCE.template_wrenx(), "Sample Map v3 Integration on GWT Apps", IMaterialConstants.DEMO_MAP, IMaterialConstants.SOURCE_MAP));
		templates.add(new TemplateDTO("Parallax Template", MaterialResources.INSTANCE.template_parallax(), "Parallax is an effect where the background content or image in this case, is moved at a different speed than the foreground content while scrolling. Check out the demo to get a better idea of it.", IMaterialConstants.DEMO_PARALLAX, IMaterialConstants.SOURCE_PARALLAX));
		templates.add(new TemplateDTO("Login Template", MaterialResources.INSTANCE.template_login(), "Here is an example of GWT Material Design UI with card base interface", IMaterialConstants.DEMO_LOGIN, IMaterialConstants.SOURCE_LOGIN));
		return templates;
		
	}

}
