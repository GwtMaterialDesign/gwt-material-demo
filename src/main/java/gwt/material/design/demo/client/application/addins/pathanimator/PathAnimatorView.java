package gwt.material.design.demo.client.application.addins.pathanimator;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialPathAnimator;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;

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
    MaterialPanel panelTarget1, panelTarget2;

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
}
