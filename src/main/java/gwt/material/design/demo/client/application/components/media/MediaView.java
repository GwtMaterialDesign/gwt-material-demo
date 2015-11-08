package gwt.material.design.demo.client.application.components.media;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialSlider;

import javax.inject.Inject;

public class MediaView extends ViewImpl implements MediaPresenter.MyView {
    interface Binder extends UiBinder<Widget, MediaView> {
    }

    @UiField MaterialSlider slider;

    @Inject
    MediaView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("fullscreenBtn")
    protected void fullscreenBtnClick(ClickEvent e) {
        slider.setFullScreen(true);
        slider.reinitialize();
    }
}
