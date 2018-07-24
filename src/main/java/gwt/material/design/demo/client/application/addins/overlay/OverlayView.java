package gwt.material.design.demo.client.application.addins.overlay;

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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.overlay.MaterialOverlay;
import gwt.material.design.addins.client.overlay.MaterialOverlayTab;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;


public class OverlayView extends ViewImpl implements OverlayPresenter.MyView {
    interface Binder extends UiBinder<Widget, OverlayView> {
    }

    @UiField
    MaterialOverlay overlay, overlayEvents, overlayParent, overlayChild, overlayChild2;

    @UiField
    MaterialButton btnOpenOverlay, btnOpenOverlayEvents, btnCloseOverlay, btnCloseOverlayEvents, btnOverlayTab,
            btnCloseParent, btnOpenChild, btnOpenParent, btnCloseChild, btnOpenChild2, btnCloseChild2;

    @UiField
    MaterialPanel panel;

    @Inject
    OverlayView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        ThemeManager.register(overlay, ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(btnCloseOverlay, ThemeManager.DARKER_SHADE);

        ThemeManager.register(overlayEvents, ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(btnCloseOverlayEvents, ThemeManager.DARKER_SHADE);

        btnOpenOverlay.addClickHandler(clickEvent -> overlay.open(btnOpenOverlay));
        btnCloseOverlay.addClickHandler(e -> overlay.close());

        overlayEvents.addOpenHandler(openEvent -> MaterialToast.fireToast("Overlay Opened"));
        overlayEvents.addCloseHandler(closeEvent -> MaterialToast.fireToast("Overlay Closed"));

        btnOpenOverlayEvents.addClickHandler(clickEvent -> overlayEvents.open(btnOpenOverlayEvents));
        btnCloseOverlayEvents.addClickHandler(e -> overlayEvents.close());

        btnOpenParent.addClickHandler(clickEvent -> overlayParent.open(btnOpenParent));
        btnOpenChild.addClickHandler(clickEvent -> overlayChild.open(btnOpenChild));
        btnCloseParent.addClickHandler(clickEvent -> overlayParent.close());
        btnCloseChild.addClickHandler(clickEvent -> overlayChild.close());
        btnOpenChild2.addClickHandler(clickEvent -> overlayChild2.open(btnOpenChild2));
        btnCloseChild2.addClickHandler(clickEvent -> overlayChild2.close());

        /**
         * TODO Overlay Container minimize sample
         */
        MaterialOverlayTab overlayContainer = new MaterialOverlayTab();
        panel.add(overlayContainer);
        for (int i = 1; i <= 5; i++) {
            MaterialOverlay overlay = new MaterialOverlay();
            overlay.setBackgroundColor(Color.WHITE);
            overlay.setPadding(20);

            MaterialLabel lblLabel = new MaterialLabel("Some Description " + i);
            lblLabel.setFontSize("1em");
            overlay.add(lblLabel);

            MaterialLabel lblTitle = new MaterialLabel("Overlay Title " + i);
            lblTitle.setFontSize("2em");
            lblTitle.setFontWeight(Style.FontWeight.BOLD);
            overlay.add(lblTitle);

            MaterialLabel lblNumber = new MaterialLabel(i + "");
            lblNumber.addStyleName("number");
            overlay.add(lblNumber);

            // Set the tab overlay for minimize function
            overlay.setOverlayTab(overlayContainer);
            panel.add(overlay);

            MaterialButton btnOpen = new MaterialButton("Open " + i);
            btnOpen.setMargin(20);
            btnOpen.addClickHandler(e -> {
                overlay.open(btnOpen);
            });
            panel.add(btnOpen);
            overlayContainer.setActivator(btnOverlayTab);
        }
    }
}
