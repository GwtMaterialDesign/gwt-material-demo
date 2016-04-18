package gwt.material.design.demo.client.application.components.loader;

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
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.addins.client.autocomplete.base.MaterialSuggestionOracle;
import gwt.material.design.client.constants.ProgressType;
import gwt.material.design.client.ui.MaterialCollapsibleItem;
import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialNavBar;

import javax.inject.Inject;

public class LoaderView extends ViewImpl implements LoaderPresenter.MyView {
    interface Binder extends UiBinder<Widget, LoaderView> {
    }

    @UiField
    MaterialNavBar navBar;

    @UiField
    MaterialCollapsibleItem collapseItemOne, collapseItemTwo, collapseItemThree;

    @UiField
    MaterialAutoComplete acList;

    @Inject
    LoaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        acList.setSuggestions(getSimpleSuggestions());
    }

    @UiHandler("btnShowLoader")
    void onShowLoader(ClickEvent e) {
        MaterialLoader.showLoading(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showLoading(false);
            }
        };
        t.schedule(3000);
    }

    @UiHandler("btnShowProgress")
    void onShowProgress(ClickEvent e) {
        MaterialLoader.showProgress(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showProgress(false);
            }
        };
        t.schedule(3000);
    }

    @UiHandler("btnShowNavBarProgress")
    void onShowNavBarProgress(ClickEvent e) {
        navBar.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                navBar.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemOne")
    void onShowCollapseProgress(ClickEvent e){
        collapseItemOne.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemOne.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemTwo")
    void onShowCollapseTwoProgress(ClickEvent e){
        collapseItemTwo.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemTwo.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemThree")
    void onShowCollapseThreeProgress(ClickEvent e){
        collapseItemThree.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemThree.hideProgress();
            }
        };
        t.schedule(3000);
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

    @UiHandler("acList")
    void onKeyUp(KeyUpEvent e){
        acList.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                acList.hideProgress();
            }
        };
        t.schedule(1000);
    }
}
