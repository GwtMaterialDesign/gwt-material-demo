package gwt.material.design.demo.client.application.addins.signature;

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
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.signature.MaterialSignaturePad;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;
import java.util.Arrays;

import static gwt.material.design.jquery.client.api.JQuery.$;


public class SignaturePadView extends ViewImpl implements SignaturePadPresenter.MyView {

    interface Binder extends UiBinder<Widget, SignaturePadView> {
    }

    @UiField
    MaterialRow colorRow;

    @UiField
    MaterialSignaturePad signaturePad;

    @UiField
    MaterialLabel colorSelected;

    @UiField
    MaterialImage imageData;

    @UiField
    MaterialDialog dataDialog;

    @UiField
    MaterialComboBox<Double> comboDotSize, comboMinWidth, comboMaxWidth, comboVelocity;

    @UiField
    MaterialComboBox<Integer> comboThrottle;

    @UiField
    MaterialColumn eventCol;

    private Integer[] throttleValues = new Integer[] {0, 10, 20, 30, 40};
    private Double[] velocity = new Double[] {100.0, 0.1, 0.3, 0.5, 1.0};
    private Double[] styleValues = new Double[]{1.0, 3.0, 5.0, 10.0};

    @Inject
    SignaturePadView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        colorRow.forEach(widget -> {
            if (widget instanceof MaterialColumn) {
                ((MaterialColumn) widget).addClickHandler(clickEvent -> {
                    chooseColor((MaterialColumn) widget);
                });
            }
        });

        Arrays.asList(throttleValues).forEach(value -> comboThrottle.addItem(value));
        Arrays.asList(velocity).forEach(value -> comboVelocity.addItem(value));

        Arrays.asList(styleValues).forEach(value -> {
            comboDotSize.addItem(value);
            comboMinWidth.addItem(value);
            comboMaxWidth.addItem(value);

        });

        comboDotSize.addValueChangeHandler(e -> signaturePad.setDotSize(e.getValue().get(0)));
        comboMinWidth.addValueChangeHandler(e -> signaturePad.setLineMinWidth(e.getValue().get(0)));
        comboMaxWidth.addValueChangeHandler(e -> signaturePad.setLineMaxWidth(e.getValue().get(0)));
        comboThrottle.addValueChangeHandler(e -> signaturePad.setThrottle(e.getValue().get(0)));
        comboVelocity.addValueChangeHandler(e -> signaturePad.setVelocityFilterWeight(e.getValue().get(0)));

        signaturePad.addSignatureStartHandler(event -> eventCol.add(new MaterialLabel("Event : Begin Signature Event fired")));
        signaturePad.addSignatureEndHandler(event -> eventCol.add(new MaterialLabel("Event : End Signature Event fired")));
        signaturePad.addSignatureClearHandler(event -> eventCol.add(new MaterialLabel("Event : Clear Signature Event fired")));
    }

    @UiHandler("png")
    void saveAsPng(ClickEvent e) {
        dataDialog.open();
        imageData.setUrl(signaturePad.toDataUrl());
    }

    @UiHandler("clear")
    void clear(ClickEvent e) {
        signaturePad.clear();
    }

    @UiHandler("closeDialog")
    void closeDialog(ClickEvent e) {
        dataDialog.close();
    }

    protected void chooseColor(MaterialColumn widget) {
        Color color = widget.getBackgroundColor();
        if (color != null) {
            signaturePad.setPenColor(ColorHelper.setupComputedBackgroundColor(color));
        }
        colorSelected.setText("Pen Color : " + color.name());
        colorSelected.setTextColor(color);
    }

    @Override
    public void resizeSignaturePad() {
        signaturePad.reset();
    }
}
