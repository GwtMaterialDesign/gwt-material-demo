package gwt.material.design.demo.client.ui;

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


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.addins.client.overlay.MaterialOverlay;

public class InstallBannerFallbackOverlay extends Composite {

    private static InstallBannerFallbackOverlayUiBinder uiBinder = GWT.create(InstallBannerFallbackOverlayUiBinder.class);

    interface InstallBannerFallbackOverlayUiBinder extends UiBinder<Widget, InstallBannerFallbackOverlay> {
    }
    
    @UiField
    MaterialOverlay overlay;

    public InstallBannerFallbackOverlay() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("gotIt")
    void onClose(ClickEvent e) {
        close();
    }

    public void open() {
        overlay.open();
    }
    
    public void close() {
        overlay.close();
    }
}
