package gwt.material.design.demo.client.application.addins.camera;

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
import gwt.material.design.addins.client.camera.MaterialCameraCapture;
import gwt.material.design.client.constants.Display;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.incubator.client.alert.Alert;

import javax.inject.Inject;


public class CameraView extends ViewImpl implements CameraPresenter.MyView {
    interface Binder extends UiBinder<Widget, CameraView> {
    }

    @UiField
    MaterialCameraCapture camera;

    @UiField
    MaterialImage imageCapture;

    @UiField
    MaterialRow imageCapturedPanel;

    @UiField
    MaterialRow cameraPanel;

    @UiField
    Alert browserNotSupported;

    @Inject
    CameraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        camera.getVideo().setWidth("100%");

        if (MaterialCameraCapture.isSupported()) {
            cameraPanel.setVisible(true);
            browserNotSupported.close();
        } else {
            cameraPanel.setVisible(false);
            browserNotSupported.open();
        }
    }

    @UiHandler("play")
    void play(ClickEvent e) {
        camera.play();
    }

    @UiHandler("pause")
    void pause(ClickEvent e) {
        camera.pause();
    }

    @UiHandler("capture")
    void capture(ClickEvent e) {
        String url = camera.captureToDataURL();
        imageCapture.setUrl(url);
        imageCapturedPanel.setVisible(true);
    }
}
