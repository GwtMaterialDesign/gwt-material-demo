package gwt.material.design.demo.client.application.addins.pathanimator;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialPathAnimator;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;


public class PathAnimatorView extends ViewImpl implements PathAnimatorPresenter.MyView {
    interface Binder extends UiBinder<Widget, PathAnimatorView> {
    }

    @UiField
    MaterialButton btnSource1, btnSource3;

    @UiField
    MaterialCard card, panelTarget3;

    @UiField
    MaterialLink btnSource2;

    @UiField
    MaterialPanel panelTarget1, panelTarget2, panelTargetCol1, panelTargetCol2, panelTargetCol3, panelTargetCol4, panelTargetCol5, panelTargetCol6, panelTargetCol7;

    @UiField
    MaterialColumn col1, col2,  col3, col4, col5, col6, col7;

    @Inject
    PathAnimatorView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }


    @UiHandler("btnSource1")
    void onSource(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTarget1.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTarget1.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(btnSource1.getElement(), panelTarget1.getElement(), callback);
    }

    @UiHandler("btnSource2")
    void onClickCard(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTarget2.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTarget2.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(card.getElement(), panelTarget2.getElement(), callback);
    }

    @UiHandler("btnSource3")
    void onClickCard3(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTarget3.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTarget3.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(btnSource3.getElement(), panelTarget3.getElement(), callback);
    }

    @UiHandler("col1")
    void onCol1(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol1.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol1.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col1.getElement(), panelTargetCol1.getElement(), callback);
    }

    @UiHandler("col2")
    void onCol2(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol2.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol2.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col2.getElement(), panelTargetCol2.getElement(), callback);
    }

    @UiHandler("col3")
    void onCol3(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol3.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol3.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col3.getElement(), panelTargetCol3.getElement(), callback);
    }

    @UiHandler("col4")
    void onCol4(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol4.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol4.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col4.getElement(), panelTargetCol4.getElement(), callback);
    }

    @UiHandler("col5")
    void onCol5(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol5.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol5.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col5.getElement(), panelTargetCol5.getElement(), callback);
    }

    @UiHandler("col6")
    void onCol6(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol6.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol6.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col6.getElement(), panelTargetCol6.getElement(), callback);
    }

    @UiHandler("col7")
    void onCol7(ClickEvent e) {
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTargetCol7.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTargetCol7.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(col7.getElement(), panelTargetCol7.getElement(), callback);
    }

    @UiHandler("btnClose1")
    void onClose(ClickEvent e) {
        panelTarget1.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTarget1.setOpacity(0);
        MaterialPathAnimator.animate(panelTarget1.getElement(), btnSource1.getElement());
    }

    @UiHandler("btnClose2")
    void onCardClose(ClickEvent e) {
        panelTarget2.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTarget2.setOpacity(0);
        MaterialPathAnimator.animate(panelTarget2.getElement(), btnSource2.getElement());
    }

    @UiHandler("btnClose3")
    void onCardClose3(ClickEvent e) {
        panelTarget3.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTarget3.setOpacity(0);
        MaterialPathAnimator.animate(panelTarget3.getElement(), btnSource3.getElement());
    }

    @UiHandler("btnCloseCol1")
    void onCloseCol1(ClickEvent e) {
        panelTargetCol1.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol1.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol1.getElement(), col1.getElement());
    }

    @UiHandler("btnCloseCol2")
    void onCloseCol2(ClickEvent e) {
        panelTargetCol2.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol2.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol2.getElement(), col2.getElement());
    }

    @UiHandler("btnCloseCol3")
    void onCloseCol3(ClickEvent e) {
        panelTargetCol3.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol3.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol3.getElement(), col3.getElement());
    }

    @UiHandler("btnCloseCol4")
    void onCloseCol4(ClickEvent e) {
        panelTargetCol4.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol4.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol4.getElement(), col4.getElement());
    }

    @UiHandler("btnCloseCol5")
    void onCloseCol5(ClickEvent e) {
        panelTargetCol5.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol5.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol5.getElement(), col5.getElement());
    }

    @UiHandler("btnCloseCol6")
    void onCloseCol6(ClickEvent e) {
        panelTargetCol6.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol6.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol6.getElement(), col6.getElement());
    }

    @UiHandler("btnCloseCol7")
    void onCloseCol7(ClickEvent e) {
        panelTargetCol7.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTargetCol7.setOpacity(0);
        MaterialPathAnimator.animate(panelTargetCol7.getElement(), col7.getElement());
    }


}
