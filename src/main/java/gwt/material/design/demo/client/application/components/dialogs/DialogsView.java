package gwt.material.design.demo.client.application.components.dialogs;

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

    @UiField
    MaterialCutOut cutout;

    @UiField
    MaterialIcon btnCutOut;

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

    @UiHandler("btnCutOut")
    void onCutOut(ClickEvent e){
        cutout.setTarget(btnCutOut);
        cutout.openCutOut();
    }

    @UiHandler("btnCutOutClose")
    void onClose(ClickEvent e){
        cutout.closeCutOut();
    }
}
