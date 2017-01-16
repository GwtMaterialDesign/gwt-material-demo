package gwt.material.design.demo.client.application.style.helper;

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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.helper.ViewPortHelper;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialLabel;
import com.google.gwt.user.client.Window;
import gwt.material.design.client.ui.MaterialLink;

import javax.inject.Inject;

public class HelperView extends ViewImpl implements HelperPresenter.MyView {
    interface Binder extends UiBinder<Widget, HelperView> {
    }

    @UiField
    MaterialLink lblViewPort;

    @Inject
    HelperView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        detectViewPort();
        Window.addResizeHandler(resizeEvent -> {
            detectViewPort();
        });
    }

    protected void detectViewPort() {
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.MOBILE_SMALL)) {
            lblViewPort.setText("ViewPort : Mobile Small");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.MOBILE_MEDIUM)) {
            lblViewPort.setText("ViewPort : Mobile Medium");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.MOBILE_LARGE)) {
            lblViewPort.setText("ViewPort : Mobile Large");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.TABLET)) {
            lblViewPort.setText("ViewPort : Tablet");
            lblViewPort.setIconType(IconType.TABLET_ANDROID);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.LAPTOP)) {
            lblViewPort.setText("ViewPort : Laptop");
            lblViewPort.setIconType(IconType.LAPTOP);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.LAPTOP_LARGE)) {
            lblViewPort.setText("ViewPort : Laptop Large");
            lblViewPort.setIconType(IconType.LAPTOP);
        }
        if (ViewPortHelper.matchMedia(ViewPortHelper.ViewPort.LAPTOP_4K)) {
            lblViewPort.setText("ViewPort : Laptop 4K");
            lblViewPort.setIconType(IconType.LAPTOP);
        }
    }
}
