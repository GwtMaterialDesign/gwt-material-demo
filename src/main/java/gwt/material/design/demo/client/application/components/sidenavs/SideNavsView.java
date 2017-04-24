package gwt.material.design.demo.client.application.components.sidenavs;

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
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.demo.client.application.dto.DemoImageDTO;
import gwt.material.design.demo.client.application.dto.DemoImagePanel;

import javax.inject.Inject;


public class SideNavsView extends ViewImpl implements SideNavsPresenter.MyView {
    interface Binder extends UiBinder<Widget, SideNavsView> {
    }

    @UiField
    MaterialPanel typePanel;

    @Inject
    SideNavsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        buildPanel();
    }

    protected void buildPanel() {
        typePanel.add(new DemoImagePanel(new DemoImageDTO("Fixed Sidenav", "It is the default type for Sidenav component, which has a permanent structure and opened by default.",
                "https://i.imgur.com/FG8zdzn.gif",
                generateDemoLink("fixed"),
                generateSource("sidenavfixed/FixedSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Drawer Sidenav", "It's a persistent type of sidenav which can be opened (Adds also an overlay on top of the page) / closed. This type of sidenav is hidden by default.",
                "https://i.imgur.com/IgfPnXo.gif",
                generateDemoLink("drawer"),
                generateSource("sidenavdrawer/DrawerSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Drawer with Header Sidenav", "The same structure as the Drawer Sidenav, the only difference is that the it overlays together with the header navbar.",
                "https://i.imgur.com/yZQH1iq.gif",
                generateDemoLink("drawer_header"),
                generateSource("sidenavdrawerheader/DrawerHeaderSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Push Sidenav", "It's a persistent type of sidenav which can be opened / closed. It pushes the entire page including the header / footer / main components when opening the sidenav.",
                "https://i.imgur.com/rIktoKt.gif",
                generateDemoLink("push"),
                generateSource("sidenavpush/PushSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Push with Header Sidenav", "The same structure as the Push Sidenav, the only difference is that the header is fixed and cannot push , only the main / footer components are pushed when opening the sidenav.",
                "https://i.imgur.com/AtGh0Vb.gif",
                generateDemoLink("push_header"),
                generateSource("sidenavpushheader/PushHeaderSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Card Sidenav", "It adds a delightful shadow on this sidenav container, this sidenav is good for few sidenav link items.",
                "https://i.imgur.com/DjqKg1X.gif",
                generateDemoLink("card"),
                generateSource("sidenavcard/CardSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Mini Sidenav", "Mini Variant / Icon Only sidenav is good for wide page content plus a section wherein you can easily navigate the sidenav menu.",
                "https://i.imgur.com/XMtfBsr.gif",
                generateDemoLink("mini"),
                generateSource("sidenavmini/MiniSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Mini Expandable Sidenav", "Added a little variation from icon only to drawer sidenav.",
                "https://i.imgur.com/ZR0HsfA.gif",
                generateDemoLink("mini_expandable"),
                generateSource("sidenavminiexpand/MiniExpandSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Edge (Right)", "Sidenavs also can be placed on the RIGHT Edge of the page for other usecase.",
                "https://i.imgur.com/FuYq68d.gif",
                generateDemoLink("edge"),
                generateSource("sidenavedge/EdgeSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Collapsible Items", "Using collapsible component you can add easily a sub menu into your sidenav.",
                "http://i.imgur.com/aTrfz70.gif",
                generateDemoLink("colaps"),
                generateSource("sidenavcollapsible/CollapsibleSideNavView.ui.xml"))));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("SideNav Content", "A component inside SideNav which you can place any plain contents like input fields, picture, labesl and description.",
                "http://i.imgur.com/21DoL6L.gif",
                generateDemoLink("content"),
                generateSource("sidenavcontent/SideNavContentView.ui.xml"))));
    }

    protected String generateSource(String type) {
        return "https://github.com/GwtMaterialDesign/gwt-material-patterns/tree/release_2.0/src/main/java/com/github/gwtmaterialdesign/client/application/" + type;
    }

    protected String generateDemoLink(String type) {
        return "https://gwtmaterialdesign.github.io/gwt-material-patterns/snapshot/#sidenav_" + type;
    }
}
