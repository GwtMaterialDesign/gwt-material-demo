package gwt.material.design.demo.client.application.components.autocomplete;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.MaterialSuggestionOracle;
import gwt.material.design.client.ui.MaterialAutoComplete;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;
import java.util.List;

public class AutoCompleteView extends ViewImpl implements AutoCompletePresenter.MyView {
    interface Binder extends UiBinder<Widget, AutoCompleteView> {
    }

    @UiField MaterialAutoComplete acList, acWithImage, acListLimit;

    @Inject
    AutoCompleteView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        acList.setSuggestions(getSimpleSuggestions());
        acListLimit.setSuggestions(getSimpleSuggestions());
        acWithImage.setSuggestions(getWithImageSuggestions());
    }

    private MaterialSuggestionOracle getSimpleSuggestions() {
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

    private MaterialSuggestionOracle getWithImageSuggestions() {
        MaterialSuggestionOracle suggestions = new MaterialSuggestionOracle();
        suggestions.add("Yunalis Mat Zara'ai", new Image("http://b.vimeocdn.com/ps/339/488/3394886_300.jpg"));
        suggestions.add("Marjorie Matias", new Image("http://lorempixel.com/50/50/people?1"));
        suggestions.add("Zenaida Ringor", new Image("http://lorempixel.com/50/50/people?8"));
        suggestions.add("Hanna Matias", new Image("http://lorempixel.com/50/50/people?2"));
        return suggestions;
    }

    @UiHandler("btnGetAll")
    void onGetAll(ClickEvent e) {
        List<String> listItems = acList.getItemValues();
        for(String item : listItems) {
            MaterialToast.fireToast(item);
        }
    }

    @UiHandler("btnGetAllContacts")
    void onGetAllContacts(ClickEvent e) {
        List<String> listItems = acWithImage.getItemValues();
        for(String item : listItems) {
            MaterialToast.fireToast(item);
        }
    }

    @UiHandler("btnClear")
    void onClear(ClickEvent e){
        acList.clear();
    }

    @UiHandler("btnClearWithImage")
    void onClearWithImage(ClickEvent e){
        acWithImage.clear();
    }
}
