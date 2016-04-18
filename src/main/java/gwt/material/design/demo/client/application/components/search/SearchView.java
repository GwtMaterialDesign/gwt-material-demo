package gwt.material.design.demo.client.application.components.search;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.SearchObject;
import gwt.material.design.client.events.SearchFinishEvent;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialSearch;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.Hero;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class SearchView extends ViewImpl implements SearchPresenter.MyView {
    interface Binder extends UiBinder<Widget, SearchView> {
    }

    @UiField
    MaterialNavBar navBar, navBarSearch;

    @UiField
    MaterialSearch txtSearch;

    @UiField
    MaterialImage imgHero;

    @UiField
    MaterialLabel lblName, lblDescription;

    @Inject
    SearchView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        txtSearch.addCloseHandler(new CloseHandler<String>() {
            @Override
            public void onClose(CloseEvent<String> event) {
                navBar.setVisible(true);
                navBarSearch.setVisible(false);
            }
        });

        // Populate the search keyword into search component
        List<SearchObject> objects = new ArrayList<>();
        for(Hero hero : DataHelper.getAllHeroes()){
            objects.add(hero);
        }
        txtSearch.setListSearches(objects);

        // Add Finish Handler
        txtSearch.addSearchFinishHandler(new SearchFinishEvent.SearchFinishHandler() {
            @Override
            public void onSearchFinish(SearchFinishEvent event) {
                // Get the selected search object
                Hero hero = (Hero)txtSearch.getSelectedObject();
                MaterialAnimator.animate(Transition.ZOOMIN, imgHero, 0);
                imgHero.setResource(hero.getResource());
                lblName.setText(hero.getName());
                lblDescription.setText(hero.getDescription());
            }
        });
    }

    @UiHandler("btnSearch")
    void onSearch(ClickEvent e){
        navBar.setVisible(false);
        navBarSearch.setVisible(true);
    }
}
