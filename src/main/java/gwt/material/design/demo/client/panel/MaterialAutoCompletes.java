package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.custom.MaterialSuggestionOracle;
import gwt.material.design.client.ui.MaterialAutoComplete;
import gwt.material.design.client.ui.MaterialToast;

import java.util.List;

public class MaterialAutoCompletes extends Composite {

	private static MaterialAutoCompletesUiBinder uiBinder = GWT
			.create(MaterialAutoCompletesUiBinder.class);

	interface MaterialAutoCompletesUiBinder extends
			UiBinder<Widget, MaterialAutoCompletes> {
	}
	
	@UiField
	MaterialAutoComplete acList, acWithImage;

	public MaterialAutoCompletes() {
		initWidget(uiBinder.createAndBindUi(this));
		
		acList.setSuggestions(getSimpleSuggestions());
		acWithImage.setSuggestions(getWithImageSuggestions());
		
	}
	
	private MaterialSuggestionOracle getSimpleSuggestions(){
		MaterialSuggestionOracle suggestions = new MaterialSuggestionOracle();
		suggestions.add("Alabama");
		suggestions.add("Alaska");
		suggestions.add("Arizona");
		suggestions.add("Arkansas");
		suggestions.add("California");
		suggestions.add("Colorado");
		suggestions.add("Connecticut");
		suggestions.add("Delaware");
		suggestions.add("Florida");
		suggestions.add("Georgia");
		suggestions.add("Hawaii");
		suggestions.add("Idaho");
		suggestions.add("Illinois");
		suggestions.add("Indiana");
		suggestions.add("Iowa");
		suggestions.add("Kansas");
		suggestions.add("Kentucky");
		suggestions.add("Louisiana");
		suggestions.add("Maine");
		suggestions.add("Maryland");
		suggestions.add("Massachusetts");
		suggestions.add("Michigan");
		suggestions.add("Minnesota");
		suggestions.add("Mississippi");
		suggestions.add("Missouri");
		suggestions.add("Montana");
		suggestions.add("Louisiana");
		return suggestions;
	}
	
	private MaterialSuggestionOracle getWithImageSuggestions(){
		MaterialSuggestionOracle suggestions = new MaterialSuggestionOracle();
		suggestions.add("Yunalis Mat Zara'ai", new Image("http://b.vimeocdn.com/ps/339/488/3394886_300.jpg"));
		suggestions.add("Marjorie Matias", new Image("http://lorempixel.com/50/50/people?1"));
		suggestions.add("Zenaida Ringor", new Image("http://lorempixel.com/50/50/people?8"));
		suggestions.add("Zenaida Ringor");
		return suggestions;
	}
	
	@UiHandler("btnGetAll")
	void onGetAll(ClickEvent e){
		List<String> listItems = acList.getItemValues();
		for(String item : listItems){
			MaterialToast.alert(item);
		}
	}
	@UiHandler("btnGetAllContacts")
	void onGetAllContacts(ClickEvent e){
		List<String> listItems = acWithImage.getItemValues();
		for(String item : listItems){
			MaterialToast.alert(item);
		}
	}

}
