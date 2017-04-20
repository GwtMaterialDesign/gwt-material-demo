package gwt.material.design.demo.client.application.components.navbar;

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


import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.dto.DemoImageDTO;
import gwt.material.design.demo.client.application.dto.DemoImagePanel;

import javax.inject.Inject;

public class NavBarView extends ViewImpl implements NavBarPresenter.MyView {
    interface Binder extends UiBinder<Widget, NavBarView> {
    }

    @UiField
    MaterialPanel typePanel;

    @UiField
    MaterialNavSection navSection;

    @Inject
    NavBarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        navSection.addSelectionHandler(selectionEvent -> MaterialToast.fireToast(selectionEvent.getSelectedItem() + " Selected Index"));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Default NavBar", "Provides a non-fixed navbar. Good for blogs.",
                "http://i.imgur.com/rGx7XRW.gif",
                generateDemoLink("default"),
                generateSource("navbardefault/DefaultNavBarView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Fixed NavBar", "By setting layoutPosition='FIXED', your navbar will be fixed on top when scrolling through the content.",
                "http://i.imgur.com/muYAAjl.gif",
                generateDemoLink("fixed"),
                generateSource("navbarfixed/FixedNavBarView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Tall NavBar", "You can easily adjust the navbar's height to make it tall by height='200px',",
                "http://i.imgur.com/dtUsHRd.gif",
                generateDemoLink("tall"),
                generateSource("navbartall/TallNavBarView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Extended NavBar", "Using MaterialNavContent - you can easily attached any component for the extension of your MaterialNavBar",
                "http://i.imgur.com/bUYC6qs.png",
                generateDemoLink("extend"),
                generateSource("navbarextend/ExtendNavBarView.ui.xml"))));


        typePanel.add(new DemoImagePanel(new DemoImageDTO("Tabs in NavBar", "You can easily add tabs for secondary navigation on MaterialNavBar by attaching it on MaterialNavContent",
                "http://i.imgur.com/7c3AGBs.png",
                generateDemoLink("tab"),
                generateSource("navbartab/TabNavBarView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Shrinkable NavBar", "Provides a delightful scrolling effect when expanding or shrinking the navbar.",
                "http://i.imgur.com/tHUDgqB.gif",
                generateDemoLink("shrink"),
                generateSource("navbarshrink/ShrinkNavBarView.ui.xml"))));
    }

    protected String generateSource(String type) {
        return "https://github.com/GwtMaterialDesign/gwt-material-patterns/tree/release_2.0/src/main/java/com/github/gwtmaterialdesign/client/application/" + type;
    }

    protected String generateDemoLink(String type) {
        return "https://gwtmaterialdesign.github.io/gwt-material-patterns/snapshot/#navbar_" + type;
    }
}
