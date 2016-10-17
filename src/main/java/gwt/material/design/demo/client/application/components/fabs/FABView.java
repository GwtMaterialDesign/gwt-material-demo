package gwt.material.design.demo.client.application.components.fabs;

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
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialFAB;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class FABView extends ViewImpl implements FABPresenter.MyView {
    interface Binder extends UiBinder<Widget, FABView> {
    }

    @UiField
    MaterialFAB fab, btnFABEvent, btnClickOnlyFABEvent;

    @Inject
    FABView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        btnFABEvent.addOpenHandler(openEvent -> MaterialToast.fireToast("Opened Default FAB"));
        btnFABEvent.addCloseHandler(closeEvent -> MaterialToast.fireToast("Closed Default FAB"));
        btnClickOnlyFABEvent.addOpenHandler(openEvent -> MaterialToast.fireToast("Opened Click Only FAB"));
        btnClickOnlyFABEvent.addCloseHandler(closeEvent -> MaterialToast.fireToast("Closed Click Only FAB"));
    }

    @UiHandler("btnOpen")
    void onOpen(ClickEvent e) {
        fab.open();
    }

    @UiHandler("btnClose")
    void onClose(ClickEvent e) {
        fab.close();
    }
}
