package gwt.material.design.demo.client.application.incubator.alert;

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
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.alert.Alert;
import gwt.material.design.incubator.client.alert.constants.AlertType;

public class AlertView extends ViewImpl implements AlertPresenter.MyView {
    public interface Binder extends UiBinder<Widget, AlertView> {
    }

    @UiField
    Alert alertError;

    @UiField
    MaterialComboBox<AlertType> comboType;

    @UiField
    MaterialCheckBox withCallback;

    @Inject
    AlertView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        comboType.addItem(AlertType.INFORMATION);
        comboType.addItem(AlertType.ERROR);
        comboType.addItem(AlertType.WARNING);
    }

    @UiHandler("showAlertError")
    void showAlertError(ClickEvent e) {
        alertError.setType(comboType.getSingleValue());
        if (withCallback.getValue()) {
            alertError.open(() -> MaterialToast.fireToast("Callback Fired"));
            return;
        }
        alertError.open();
    }
    
    @UiHandler("hideAlertError")
    void hideAlertError(ClickEvent e) {
        alertError.close();
    }
}
