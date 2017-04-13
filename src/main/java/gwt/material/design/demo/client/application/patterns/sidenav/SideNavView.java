package gwt.material.design.demo.client.application.patterns.sidenav;

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
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.demo.client.application.patterns.PatternDto;
import gwt.material.design.demo.client.application.patterns.PatternItem;

public class SideNavView extends ViewImpl implements SideNavPresenter.MyView {
    public interface Binder extends UiBinder<Widget, SideNavView> {
    }

    @UiField
    MaterialPanel patternPanel;

    @Inject
    SideNavView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        patternPanel.add(new PatternItem(new PatternDto("Fixed Sidenav", "It is the default type for Sidenav component, which has a permanent structure and opened by default.",
                "https://i.imgur.com/FG8zdzn.gif",
                generateDemoLink("fixed"),
                generateResizer("fixed"))));

        patternPanel.add(new PatternItem(new PatternDto("Drawer Sidenav", "It's a persistent type of sidenav which can be opened (Adds also an overlay on top of the page) / closed. This type of sidenav is hidden by default.",
                "http://i.imgur.com/IgfPnXo.gif",
                generateDemoLink("drawer"),
                generateResizer("drawer"))));

        patternPanel.add(new PatternItem(new PatternDto("Drawer with Header Sidenav", "The same structure as the Drawer Sidenav, the only difference is that the it overlays together with the header navbar.",
                "http://i.imgur.com/yZQH1iq.gif",
                generateDemoLink("drawer_header"),
                generateResizer("drawer_header"))));

        patternPanel.add(new PatternItem(new PatternDto("Push Sidenav", "It's a persistent type of sidenav which can be opened / closed. It pushes the entire page including the header / footer / main components when opening the sidenav.",
                "http://i.imgur.com/rIktoKt.gif",
                generateDemoLink("push"),
                generateResizer("push"))));

        patternPanel.add(new PatternItem(new PatternDto("Push with Header Sidenav", "The same structure as the Push Sidenav, the only difference is that the header is fixed and cannot push , only the main / footer components are pushed when opening the sidenav.",
                "http://i.imgur.com/AtGh0Vb.gif",
                generateDemoLink("push_header"),
                generateResizer("push_header"))));

        patternPanel.add(new PatternItem(new PatternDto("Card Sidenav", "It adds a delightful shadow on this sidenav container, this sidenav is good for few sidenav link items.",
                "http://i.imgur.com/DjqKg1X.gif",
                generateDemoLink("card"),
                generateResizer("card"))));

        patternPanel.add(new PatternItem(new PatternDto("Mini Sidenav", "Mini Variant / Icon Only sidenav is good for wide page content plus a section wherein you can easily navigate the sidenav menu.",
                "http://i.imgur.com/XMtfBsr.gif",
                generateDemoLink("mini"),
                generateResizer("mini"))));

        patternPanel.add(new PatternItem(new PatternDto("Mini Expandable Sidenav", "Added a little variation from icon only to drawer sidenav.",
                "http://i.imgur.com/ZR0HsfA.gif",
                generateDemoLink("mini_expandable"),
                generateResizer("mini_expandable"))));
    }

    protected String generateResizer(String type) {
        return "https://material.io/resizer/#url=https%3A%2F%2Fgwtmaterialdesign.github.io%2Fgwt-material-patterns%2Fsnapshot%2F%23sidenav_" + type;
    }

    protected String generateDemoLink(String type) {
        return "https://gwtmaterialdesign.github.io/gwt-material-patterns/snapshot/#sidenav_" + type;
    }
}
