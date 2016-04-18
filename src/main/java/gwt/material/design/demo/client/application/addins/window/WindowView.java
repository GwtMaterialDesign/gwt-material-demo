package gwt.material.design.demo.client.application.addins.window;

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
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.OpenHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.window.MaterialWindow;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class WindowView extends ViewImpl implements WindowPresenter.MyView {
    interface Binder extends UiBinder<Widget, WindowView> {
    }

    @UiField
    MaterialWindow window, windowTab, styledWindow;

    @Inject
    WindowView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        window.addOpenHandler(new OpenHandler<Boolean>() {
            @Override
            public void onOpen(OpenEvent<Boolean> event) {
                MaterialToast.fireToast("Opened : " + window.getTitle());
            }
        });

        window.addCloseHandler(new CloseHandler<Boolean>() {
            @Override
            public void onClose(CloseEvent<Boolean> event) {
                MaterialToast.fireToast("Closed : " + window.getTitle());
            }
        });
    }

    @UiHandler("btnOpenWindow")
    void onOpenWindow(ClickEvent e) {
        window.openWindow();
    }

    @UiHandler("btnWindowTab")
    void onOpenWindowWithTab(ClickEvent e) {
        windowTab.openWindow();
    }

    @UiHandler("btnOpenWindowStyles")
    void onOpenStyledWindow(ClickEvent e) {
        styledWindow.openWindow();
    }

    @UiHandler("btnOpenMaximizedWindow")
    void onOpenMaximizedWindow(ClickEvent e) {
        window.setMaximize(true);
        window.openWindow();
    }
}
