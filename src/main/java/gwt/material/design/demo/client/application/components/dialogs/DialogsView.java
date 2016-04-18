package gwt.material.design.demo.client.application.components.dialogs;

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
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class DialogsView extends ViewImpl implements DialogsPresenter.MyView {
    interface Binder extends UiBinder<Widget, DialogsView> {
    }

    @UiField
    MaterialModal modal, modalFixed, modalBottomSheet, modalClosable;

    @Inject
    DialogsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnToast")
    void onToast(ClickEvent e) {
        MaterialToast.fireToast("I Love Material Design");
    }

    @UiHandler("btnToastAction")
    void onToastAction(ClickEvent e) {
        MaterialLink link = new MaterialLink("UNDO");
        link.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                MaterialToast.fireToast("UNDO DONE");
            }
        });
        new MaterialToast(link).toast("Item Deleted");
    }

    @UiHandler("btnToastCallback")
    void onToastCallback(ClickEvent e) {
        new MaterialToast(new Runnable() {
            @Override
            public void run() {
                MaterialToast.fireToast("BANG!");
            }
        }).toast("Explosion in: 5, 4, 3, 2, 1", 5000);
    }

    @UiHandler("btnToastRounded")
    void onToastStyle(ClickEvent e) {
        MaterialToast.fireToast("I Love Material Design", "rounded");
    }

    @UiHandler("btnModal")
    void onModal(ClickEvent e) {
        modal.openModal();
    }

    @UiHandler("btnMoadalBottomSheets")
    void onModalBottom(ClickEvent e) {
       modalBottomSheet.openModal();
    }

    @UiHandler("btnModalFixFooter")
    void onModalFix(ClickEvent e) {
        modalFixed.openModal();
    }

    @UiHandler("btnClosable")
    void onClosable(ClickEvent e) {
        modalClosable.openModal();
    }

    @UiHandler("btnCloseModal")
    void onCloseModal(ClickEvent e){
        modal.closeModal();
    }

    @UiHandler("btnCloseFixedModal")
    void onCloseFixedModal(ClickEvent e) {
        modalFixed.closeModal();
    }

    @UiHandler("btnCloseBottomSheetModal")
    void onCloseBottomModal(ClickEvent e) {
        modalBottomSheet.closeModal();
    }

    @UiHandler("btnCloseModalDismiss")
    void onCloseModalDismiss(ClickEvent e) {
        modalClosable.closeModal();
    }
}
