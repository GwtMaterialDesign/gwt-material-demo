package gwt.material.design.demo.client.application.pwa.serviceworker;

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
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.pwa.PwaManager;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class ServiceWorkerView extends ViewImpl implements ServiceWorkerPresenter.MyView {
    interface Binder extends UiBinder<Widget, ServiceWorkerView> {
    }

    @Inject
    ServiceWorkerView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnGetScope")
    void getScope(ClickEvent e) {
        MaterialToast.fireToast(PwaManager.getInstance().getServiceWorkerManager().getServiceWorker().scriptURL);
    }

    @UiHandler("btnGetState")
    void getState(ClickEvent e) {
        MaterialToast.fireToast(PwaManager.getInstance().getServiceWorkerManager().getServiceWorker().state);
    }

    @UiHandler("btnUnregister")
    void unregister(ClickEvent e) {
        PwaManager.getInstance().getServiceWorkerManager().unload();
    }
}
