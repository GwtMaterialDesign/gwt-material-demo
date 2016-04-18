package gwt.material.design.demo.client.application.addins.menubar;

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


import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class MenuBarView extends ViewImpl implements MenuBarPresenter.MyView {
    interface Binder extends UiBinder<Widget, MenuBarView> {
    }

    @UiField
    MaterialDropDown dpMode;

    @Inject
    MenuBarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler({"dpFile", "dpNew", "dpView", "dpEdit", "dpFormat"})
    void onSelectionFileDropdown(SelectionEvent<Widget> selection) {
        if(selection.getSelectedItem() instanceof MaterialLink){
            MaterialToast.fireToast("Triggered : " + ((MaterialLink)selection.getSelectedItem()).getText());
        }else if(selection.getSelectedItem() instanceof MaterialCheckBox){
            MaterialToast.fireToast("Checked : " + ((MaterialCheckBox)selection.getSelectedItem()).getText());
        }
    }

    @UiHandler("dpMode")
    void onSelectionMode(SelectionEvent<Widget> selection) {
        for(Widget w : dpMode.getItems()){
            if(w instanceof MaterialCheckBox){
                ((MaterialCheckBox) w).setValue(false);
            }
        }
        if(selection.getSelectedItem() instanceof MaterialCheckBox){
            ((MaterialCheckBox) selection.getSelectedItem()).setValue(true);
            MaterialToast.fireToast("Checked : " + ((MaterialCheckBox) selection.getSelectedItem()).getText());
        }
    }
}
