package gwt.material.design.demo.client.application;

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

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;

import java.util.Date;

import static com.google.gwt.i18n.client.DateTimeFormat.getFormat;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    private String link;
    private String specification;

    @UiField HTMLPanel menu;
    @UiField HTMLPanel main;

    @UiField MaterialFooter footer;
    @UiField MaterialFooterCopyright footerCopyRight;

    @UiField
    MaterialPanel panel, titlePanel;
    @UiField
    MaterialLabel title, description;

    @UiField
    MaterialChip chipXml, chipJava, chipSpecification;
    @UiField
    MaterialLabel footerCopyRightLabel;

    @Inject
    ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        ThemeManager.register(footer);
        ThemeManager.register(footerCopyRight, ThemeManager.DARKER_SHADE);
        ThemeManager.initialize();
        bindSlot(ApplicationPresenter.SLOT_MENU, menu);
        bindSlot(ApplicationPresenter.SLOT_MAIN, main);
        DOM.removeChild(RootPanel.getBodyElement(), DOM.getElementById("splashscreen"));

        chipJava.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        chipJava.addClickHandler(clickEvent -> {
            String java = "https://github.com/GwtMaterialDesign/gwt-material-demo/tree/master/src/main/java/gwt/material/design/demo/client/application/" + link + ".java";
            Window.open(java, "_blank", "");
        });

        chipXml.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        chipXml.addClickHandler(clickEvent -> {
            String xml = "https://github.com/GwtMaterialDesign/gwt-material-demo/tree/master/src/main/java/gwt/material/design/demo/client/application/" + link + ".ui.xml";
            Window.open(xml, "_blank", "");
        });
        chipSpecification.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        chipSpecification.addClickHandler(clickEvent -> {
            Window.open(specification, "_blank", "");
        });
        ThemeManager.register(chipXml, ThemeManager.DARKER_SHADE);
        ThemeManager.register(chipXml.getLetterMixin().getSpan(), ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(chipJava, ThemeManager.DARKER_SHADE);
        ThemeManager.register(chipJava.getLetterMixin().getSpan(), ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(chipSpecification, ThemeManager.DARKER_SHADE);
        ThemeManager.register(chipSpecification.getLetterMixin().getSpan(), ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(titlePanel);

        footerCopyRightLabel.setText("© " + getFormat("yyyy").format(new Date()) + " Copyright GWT Material");
    }

    @UiHandler("imgGPlus")
    void onGPlus(ClickEvent e){
        Window.open("https://plus.google.com/communities/108005250093449814286", "", "_blank");
    }

    @Override
    public void setPageTitle(String title, String description, String link, String specification) {
        this.title.setText(title);
        this.description.setText(description);
        this.link = link;
        this.specification = specification;

        if (link.isEmpty()) {
            chipJava.setVisible(false);
            chipXml.setVisible(false);
        } else {
            chipJava.setVisible(true);
            chipXml.setVisible(true);
        }

        if (specification.isEmpty()) {
            chipSpecification.setVisible(false);
        } else {
            chipSpecification.setVisible(true);
        }

        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.title, 1000);
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.description, 1000);
    }
}
