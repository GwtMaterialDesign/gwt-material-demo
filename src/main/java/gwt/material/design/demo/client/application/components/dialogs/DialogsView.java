package gwt.material.design.demo.client.application.components.dialogs;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.ModalType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.ui.ModalContent;

import javax.inject.Inject;

public class DialogsView extends ViewImpl implements DialogsPresenter.MyView {
    interface Binder extends UiBinder<Widget, DialogsView> {
    }

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
        MaterialModal.showModal(new ModalContent(), ModalType.DEFAULT, false);
    }

    @UiHandler("btnMoadalBottomSheets")
    void onModalBottom(ClickEvent e) {
        MaterialModal.showModal(new ModalContent(), ModalType.BOTTOM_SHEET, false);
    }

    @UiHandler("btnModalFixFooter")
    void onModalFix(ClickEvent e) {
        MaterialModal.showModal(new ModalContent(), ModalType.FIXED_FOOTER, false);
    }

    @UiHandler("btnWindow")
    void onWindowModal(ClickEvent e) {
        MaterialModal.showWindow(new ModalContent(), ModalType.WINDOW, "Window Title", "blue", false);
    }

    @UiHandler("btnClosable")
    void onClosable(ClickEvent e) {
        MaterialModal.showModal(new ModalContent(), ModalType.FIXED_FOOTER,  true);
    }
}
