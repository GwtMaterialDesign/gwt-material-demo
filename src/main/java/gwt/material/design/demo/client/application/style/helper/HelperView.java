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


import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.base.viewport.Resolution;
import gwt.material.design.client.base.viewport.ViewPort;
import gwt.material.design.client.constants.IconType;
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
    }

    protected void detectViewPort() {
        ViewPort.when(Resolution.MOBILE_SMALL).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Mobile Small");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        });

        ViewPort.when(Resolution.MOBILE_MEDIUM).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Mobile Medium");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        });

        ViewPort.when(Resolution.MOBILE_LARGE).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Mobile Large");
            lblViewPort.setIconType(IconType.PHONE_ANDROID);
        });

        ViewPort.when(Resolution.TABLET).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Tablet");
            lblViewPort.setIconType(IconType.TABLET_ANDROID);
        });

        ViewPort.when(Resolution.LAPTOP).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Laptop");
            lblViewPort.setIconType(IconType.LAPTOP);
        });

        ViewPort.when(Resolution.LAPTOP_LARGE).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Laptop Large");
            lblViewPort.setIconType(IconType.LAPTOP);
        });

        ViewPort.when(Resolution.LAPTOP_4K).then(viewPortChange -> {
            lblViewPort.setText("ViewPort : Laptop 4K");
            lblViewPort.setIconType(IconType.LAPTOP);
        });
    }
}
