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
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class DialogsView extends ViewImpl implements DialogsPresenter.MyView {
    interface Binder extends UiBinder<Widget, DialogsView> {
    }

    @UiField
    MaterialDialog dialog, dialogFixed, dialogBottomSheet, dialogClosable, dialogEvents,
            dialog1, dialog2, dialog3, dialogFullScreen;

    @UiField
    MaterialButton turnOffFullscreen;

    @Inject
    DialogsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        dialogEvents.addOpenHandler(openEvent -> MaterialToast.fireToast("Opened"));
        dialogEvents.addCloseHandler(closeEvent -> MaterialToast.fireToast("Closed"));

        dialog1.addOpenHandler(openEvent -> MaterialToast.fireToast("Dialog 1 - Open"));
        dialog2.addOpenHandler(openEvent -> MaterialToast.fireToast("Dialog 2 - Open"));
        dialog3.addOpenHandler(openEvent -> MaterialToast.fireToast("Dialog 3 - Open"));

        dialog1.addCloseHandler(closeEvent -> MaterialToast.fireToast("Dialog 1 - Closed"));
        dialog2.addCloseHandler(closeEvent -> MaterialToast.fireToast("Dialog 2 - Closed"));
        dialog3.addCloseHandler(closeEvent -> MaterialToast.fireToast("Dialog 3 - Closed"));
    }

    @UiHandler("openFullscreenDialog")
    void onOpenFullScreenDialog(ClickEvent e) {
        dialogFullScreen.setFullscreen(true);
        turnOffFullscreen.setVisible(true);
        dialogFullScreen.open();
    }

    @UiHandler("turnOffFullscreen")
    void turnOffFullScreen(ClickEvent e) {
        turnOffFullscreen.setVisible(false);
        dialogFullScreen.setFullscreen(false);
    }

    @UiHandler("closeFullscreenDialog")
    void closeFullScreen(ClickEvent e) {
        dialogFullScreen.close();
    }

    @UiHandler("btnOpenDialog1")
    void onOpenDialog1(ClickEvent e) {
        dialog1.open();
    }

    @UiHandler("btnOpenDialog2")
    void onOpenDialog2(ClickEvent e) {
        dialog2.open();
    }

    @UiHandler("btnOpenDialog3")
    void onOpenDialog3(ClickEvent e) {
        dialog3.open();
    }

    @UiHandler("btnCloseDialog1")
    void onCloseDialog1(ClickEvent e) {
        dialog1.close();
    }

    @UiHandler("btnCloseDialog2")
    void onCloseDialog2(ClickEvent e) {
        dialog2.close();
    }

    @UiHandler("btnCloseDialog3")
    void onCloseDialog3(ClickEvent e) {
        dialog3.close();
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
        new MaterialToast(() -> {
            MaterialToast.fireToast("BANG!");
        }).toast("Explosion in: 5, 4, 3, 2, 1", 5000);
    }

    @UiHandler("btnToastRounded")
    void onToastStyle(ClickEvent e) {
        MaterialToast.fireToast("I Love Material Design", "rounded");
    }

    @UiHandler("btnDialog")
    void onDialog(ClickEvent e) {
        dialog.open();
    }

    @UiHandler("btnMoadalBottomSheets")
    void onDialogBottom(ClickEvent e) {
       dialogBottomSheet.open();
    }

    @UiHandler("btnDialogFixFooter")
    void onDialogFix(ClickEvent e) {
        dialogFixed.open();
    }

    @UiHandler("btnClosable")
    void onClosable(ClickEvent e) {
        dialogClosable.open();
    }

    @UiHandler("btnEvents")
    void onEvents(ClickEvent e) {
        dialogEvents.open();
    }

    @UiHandler("btnCloseDialog")
    void onCloseDialog(ClickEvent e){
        dialog.close();
    }

    @UiHandler("btnCloseDialogEvents")
    void onCloseEvents(ClickEvent e) {
        dialogEvents.close();
    }

    @UiHandler("btnCloseFixedDialog")
    void onCloseFixedDialog(ClickEvent e) {
        dialogFixed.close();
    }

    @UiHandler("btnCloseBottomSheetDialog")
    void onCloseBottomDialog(ClickEvent e) {
        dialogBottomSheet.close();
    }

    @UiHandler("btnCloseDialogDismiss")
    void onCloseDialogDismiss(ClickEvent e) {
        dialogClosable.close();
    }
}
