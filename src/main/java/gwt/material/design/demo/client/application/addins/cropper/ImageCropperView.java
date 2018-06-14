package gwt.material.design.demo.client.application.addins.cropper;

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
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.cropper.MaterialImageCropper;
import gwt.material.design.addins.client.cropper.constants.Shape;
import gwt.material.design.addins.client.cropper.constants.Type;
import gwt.material.design.addins.client.cropper.js.JsCropperDimension;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;
import java.util.List;

public class ImageCropperView extends ViewImpl implements ImageCropperPresenter.MyView {
    interface Binder extends UiBinder<Widget, ImageCropperView> {
    }

    @UiField
    MaterialImageCropper cropper;

    @UiField
    MaterialDialog dialog;

    @UiField
    MaterialImage croppedImage;

    @UiField
    MaterialComboBox<Integer> comboViewPortWidth, comboViewPortHeight, comboBoundaryWidth, comboBoundaryHeight;

    @UiField
    MaterialComboBox<Shape> comboShape;

    @UiField
    MaterialCheckBox enableResize;

    private static Integer[] values = new Integer[]{200, 300, 400, 500};

    @Inject
    ImageCropperView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        // View Port and Boundary
        for (Integer value : values) {
            int boundary = value * 2;
            // view port
            comboViewPortWidth.addItem(value + "", value);
            comboViewPortHeight.addItem(value + "", value);

            // boundary
            comboBoundaryWidth.addItem(boundary + "", boundary);
            comboBoundaryHeight.addItem(boundary + "", boundary);
        }

        // Shapes
        comboShape.addItem(Shape.SQUARE.getCssName(), Shape.SQUARE);
        comboShape.addItem(Shape.CIRCLE.getCssName(), Shape.CIRCLE);

        // Crop Handler
        cropper.addCropHandler(valueChangeEvent -> {
            croppedImage.setUrl(valueChangeEvent.getResult());
            dialog.open();
        });
    }

    @UiHandler("close")
    void close(ClickEvent e) {
        dialog.close();
    }

    @UiHandler("crop")
    void crop(ClickEvent e) {
        cropper.crop(Type.BASE64);
    }

    @UiHandler("rotate")
    void rotate(ClickEvent e) {
        cropper.rotate(270);
    }

    @UiHandler("enableZoom")
    void enableZoom(ValueChangeEvent<Boolean> event) {
        cropper.setEnableZoom(event.getValue());
        cropper.reload();
    }

    @UiHandler("enableResize")
    void enableResize(ValueChangeEvent<Boolean> event) {
        cropper.setEnableResize(event.getValue());
        cropper.reload();
    }

    @UiHandler("enableMouseWheelZoom")
    void enableMouseWheelZoom(ValueChangeEvent<Boolean> event) {
        cropper.setMouseWheelZoom(event.getValue());
        cropper.reload();
    }

    @UiHandler("showZoomer")
    void showZoomer(ValueChangeEvent<Boolean> event) {
        cropper.setShowZoomer(event.getValue());
        cropper.reload();
    }

    @UiHandler("enableOrientation")
    void enableOrientation(ValueChangeEvent<Boolean> event) {
        cropper.setEnableOrientation(event.getValue());
        cropper.reload();
    }

    @UiHandler("enforceBoundary")
    void enforceBoundary(ValueChangeEvent<Boolean> event) {
        cropper.setEnforceBoundary(event.getValue());
        cropper.reload();
    }

    @UiHandler("comboViewPortWidth")
    void setComboViewPortWidth(ValueChangeEvent<List<Integer>> event) {
        applyDimension();
    }

    @UiHandler("comboViewPortHeight")
    void setComboViewPortHeight(ValueChangeEvent<List<Integer>> event) {
        applyDimension();
    }

    @UiHandler("comboBoundaryWidth")
    void setComboBoundaryWidth(ValueChangeEvent<List<Integer>> event) {
        applyDimension();
    }

    @UiHandler("comboBoundaryHeight")
    void setComboBoundaryHeight(ValueChangeEvent<List<Integer>> event) {
        applyDimension();
    }

    @UiHandler("comboShape")
    void setComboShape(ValueChangeEvent<List<Shape>> event) {
        cropper.setShape(comboShape.getSingleValue());
        cropper.setEnableResize(false);
        enableResize.setValue(false);
        cropper.reload();
    }

    void applyDimension() {

        if (comboViewPortWidth.getSingleValue() > comboBoundaryWidth.getSingleValue()) {
            MaterialToast.fireToast("Boundary width must be greater than the Viewport width");
            return;
        }

        if (comboViewPortHeight.getSingleValue() > comboBoundaryHeight.getSingleValue()) {
            MaterialToast.fireToast("Boundary height must be greater than the Viewport height");
            return;
        }

        JsCropperDimension viewPort = new JsCropperDimension();
        viewPort.width = comboViewPortWidth.getSingleValue();
        viewPort.height = comboViewPortHeight.getSingleValue();

        JsCropperDimension boundary = new JsCropperDimension();
        boundary.width = comboBoundaryWidth.getSingleValue();
        boundary.height = comboBoundaryHeight.getSingleValue();

        cropper.setViewport(viewPort);
        cropper.setBoundary(boundary);
        cropper.reload();
    }
}
