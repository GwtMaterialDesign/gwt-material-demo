package gwt.material.design.demo.client.application.components.forms;

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


import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class FormsView extends ViewImpl implements FormsPresenter.MyView {
    interface Binder extends UiBinder<Widget, FormsView> {
    }

    @UiField MaterialListBox lstOptions;
    @UiField MaterialCheckBox cbBoxAll, cbBox, cbBlue, cbRed, cbCyan, cbGreen, cbBrown;

    @UiField MaterialSwitch switch1, switch2;
    @UiField MaterialLabel lblRange;
    @UiField MaterialRange range;

    @UiField MaterialTextArea txtAreaAuto;
    @UiField MaterialTextArea txtAreaFocus;

    @UiField MaterialFloatBox txtFloatBox;
    @UiField MaterialIntegerBox txtIntegerBox;
    @UiField MaterialDoubleBox txtDoubleBox;
    @UiField MaterialLongBox txtLongBox;

    @Inject
    FormsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        txtFloatBox.setValue(1000.25f);
        txtIntegerBox.setValue(10);
        txtDoubleBox.setValue(9999.90);
        txtLongBox.setValue((long) 1000.00);

        txtAreaAuto.setValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam mauris, accumsan placerat " +
            "lectus ac, tincidunt mattis nisl. Ut efficitur massa in libero gravida tincidunt. Vestibulum eget massa " +
            "eget ex auctor tempus. Aenean vitae augue euismod, lacinia lectus ut, rhoncus enim. Sed vitae laoreet " +
            "felis, eget ullamcorper nunc. Vivamus elit urna, varius et arcu vel, euismod auctor augue. Praesent " +
            "scelerisque scelerisque libero sit amet euismod. Mauris eu est at felis feugiat tincidunt eu vel lectus. " +
            "Ut pretium magna vitae massa sollicitudin, eu tincidunt sapien scelerisque. Maecenas gravida lorem non dui " +
            "pretium, id vestibulum mi imperdiet. Fusce facilisis, dui nec ultrices molestie, nisi metus bibendum lacus, " +
            "eget posuere est odio vitae nulla. Mauris laoreet non justo fringilla tempus. Mauris ut risus risus. " +
            "Vivamus auctor accumsan gravida. Nam venenatis sapien nisl, quis accumsan odio dignissim non. Vestibulum " +
            "aliquam semper condimentum. Suspendisse a eros elementum, dapibus quam in, aliquet lorem. Morbi mi dui, " +
            "convallis at luctus ultricies, malesuada at leo. Morbi et turpis a ex vehicula ullamcorper. Vestibulum " +
            "lacinia, orci eget elementum fermentum, lectus velit interdum erat, sit amet pharetra justo elit in tortor. " +
            "Suspendisse ac vestibulum nisi.\n" +
            "\n" +
            "Nunc euismod metus nec elit sollicitudin blandit. Proin eleifend ex bibendum sodales blandit. Vestibulum " +
            "varius pharetra arcu, sit amet pellentesque odio hendrerit nec. Integer faucibus imperdiet tortor a tempus. " +
            "Sed accumsan condimentum nisl. Cras interdum sapien quis maximus commodo. Nulla malesuada imperdiet enim, " +
            "non ornare elit auctor in. Fusce at ipsum eget turpis tincidunt maximus. Nunc sodales tortor nec tincidunt " +
            "fringilla. Quisque sollicitudin ipsum at dolor faucibus, ultricies convallis ipsum convallis. Donec " +
            "consequat velit vel molestie tempus. Donec et accumsan lacus, non sollicitudin quam. Morbi arcu lacus, " +
            "blandit eu lacus nec, finibus tempus ligula.", true);

        txtAreaFocus.setValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam mauris, accumsan placerat " +
            "lectus ac, tincidunt mattis nisl. Ut efficitur massa in libero gravida tincidunt. Vestibulum eget massa " +
            "eget ex auctor tempus. Aenean vitae augue euismod, lacinia lectus ut, rhoncus enim. Sed vitae laoreet " +
            "felis, eget ullamcorper nunc. Vivamus elit urna, varius et arcu vel, euismod auctor augue. Praesent " +
            "scelerisque scelerisque libero sit amet euismod. Mauris eu est at felis feugiat tincidunt eu vel lectus. " +
            "Ut pretium magna vitae massa sollicitudin, eu tincidunt sapien scelerisque. Maecenas gravida lorem non dui " +
            "pretium, id vestibulum mi imperdiet. Fusce facilisis, dui nec ultrices molestie, nisi metus bibendum lacus, " +
            "eget posuere est odio vitae nulla. Mauris laoreet non justo fringilla tempus. Mauris ut risus risus. " +
            "Vivamus auctor accumsan gravida. Nam venenatis sapien nisl, quis accumsan odio dignissim non. Vestibulum " +
            "aliquam semper condimentum. Suspendisse a eros elementum, dapibus quam in, aliquet lorem. Morbi mi dui, " +
            "convallis at luctus ultricies, malesuada at leo. Morbi et turpis a ex vehicula ullamcorper. Vestibulum " +
            "lacinia, orci eget elementum fermentum, lectus velit interdum erat, sit amet pharetra justo elit in tortor. " +
            "Suspendisse ac vestibulum nisi.\n" +
            "\n" +
            "Nunc euismod metus nec elit sollicitudin blandit. Proin eleifend ex bibendum sodales blandit. Vestibulum " +
            "varius pharetra arcu, sit amet pellentesque odio hendrerit nec. Integer faucibus imperdiet tortor a tempus. " +
            "Sed accumsan condimentum nisl. Cras interdum sapien quis maximus commodo. Nulla malesuada imperdiet enim, " +
            "non ornare elit auctor in. Fusce at ipsum eget turpis tincidunt maximus. Nunc sodales tortor nec tincidunt " +
            "fringilla. Quisque sollicitudin ipsum at dolor faucibus, ultricies convallis ipsum convallis. Donec " +
            "consequat velit vel molestie tempus. Donec et accumsan lacus, non sollicitudin quam. Morbi arcu lacus, " +
            "blandit eu lacus nec, finibus tempus ligula.", true);
    }

    @UiHandler("lstOptions")
    void onChangeListBox(ValueChangeEvent<String> e) {
        MaterialToast.fireToast("Selected Index: " + lstOptions.getSelectedIndex());
    }

    @UiHandler("cbBox")
    void onCheckBox(ValueChangeEvent<Boolean> e) {
        if(e.getValue()) {
            cbBox.setText("CheckBox 1: true");
        } else {
            cbBox.setText("CheckBox 1: false");
        }
    }

    @UiHandler("cbBoxAll")
    void onCheckAll(ValueChangeEvent<Boolean> e) {
        if(e.getValue()) {
            cbBlue.setValue(true);
            cbRed.setValue(true);
            cbCyan.setValue(true);
            cbGreen.setValue(true);
            cbBrown.setValue(true);
        } else {
            cbBlue.setValue(false);
            cbRed.setValue(false);
            cbCyan.setValue(false);
            cbGreen.setValue(false);
            cbBrown.setValue(false);
        }
    }

    @UiHandler("range")
    void onRange(ChangeEvent e) {
        lblRange.setText("Value: " + String.valueOf(range.getValue()));
    }
}
