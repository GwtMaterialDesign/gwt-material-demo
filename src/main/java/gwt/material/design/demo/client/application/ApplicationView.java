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
import gwt.material.design.client.base.pwa.PwaManager;
import gwt.material.design.client.ui.MaterialFooter;
import gwt.material.design.client.ui.MaterialFooterCopyright;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField HTMLPanel menu;
    @UiField HTMLPanel main;

    @UiField MaterialFooter footer;
    @UiField MaterialFooterCopyright footerCopyRight;

    @Inject
    ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        ThemeManager.register(footer);
        ThemeManager.register(footerCopyRight, ThemeManager.DARKER_SHADE);
        ThemeManager.initialize();
        bindSlot(ApplicationPresenter.SLOT_MENU, menu);
        bindSlot(ApplicationPresenter.SLOT_MAIN, main);
        DOM.removeChild(RootPanel.getBodyElement(), DOM.getElementById("splashscreen"));

        // Detect whether the app is running online / not.
        if (!PwaManager.getInstance().isOnline()) {
            MaterialToast.fireToast("No Internet Connection");
        }
    }

    @UiHandler("imgGPlus")
    void onGPlus(ClickEvent e){
        Window.open("https://plus.google.com/communities/108005250093449814286", "", "_blank");
    }
}
