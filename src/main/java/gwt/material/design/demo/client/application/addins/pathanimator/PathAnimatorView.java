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
import gwt.material.design.client.ui.MaterialPanel;

import javax.inject.Inject;


public class PathAnimatorView extends ViewImpl implements PathAnimatorPresenter.MyView {
    interface Binder extends UiBinder<Widget, PathAnimatorView> {
    }

    @UiField
    MaterialButton btnSource;

    @UiField
    MaterialPanel panelTarget;

    @Inject
    PathAnimatorView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }


    @UiHandler("btnSource")
    void onSource(ClickEvent e){
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                panelTarget.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
                panelTarget.setOpacity(1);
            }
        };
        MaterialPathAnimator.animate(btnSource.getElement(), panelTarget.getElement(), callback);
    }

    @UiHandler("btnClose")
    void onClose(ClickEvent e){
        panelTarget.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);
        panelTarget.setOpacity(0);
        MaterialPathAnimator.animate(panelTarget.getElement(), btnSource.getElement());
    }
}
