package gwt.material.design.demo.client.application.components.media;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialSlider;

import javax.inject.Inject;

public class MediaView extends ViewImpl implements MediaPresenter.MyView {
    interface Binder extends UiBinder<Widget, MediaView> {
    }

    @UiField MaterialSlider slider;
    @UiField MaterialButton fullscreenBtn;

    @Inject
    MediaView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("fullscreenBtn")
    protected void fullscreenBtnClick(ClickEvent e) {
        setFullscreen(fullscreenBtn.getText().equals("Fullscreen Slider"));
    }

    private void setFullscreen(boolean fullscreen) {
        slider.setFullscreen(fullscreen);

        if(fullscreen) {
            slider.getElement().getStyle().setPosition(Style.Position.FIXED);
            slider.getElement().getStyle().setZIndex(9998);
            slider.setHeight("100%");

            fullscreenBtn.getElement().getStyle().setPosition(Style.Position.FIXED);
            fullscreenBtn.getElement().getStyle().setZIndex(9999);
            fullscreenBtn.getElement().getStyle().setBottom(0, Style.Unit.PX);
            fullscreenBtn.getElement().getStyle().setLeft(0, Style.Unit.PX);
            fullscreenBtn.setIconType(IconType.FULLSCREEN_EXIT);
            fullscreenBtn.setText("Close Fullscreen");
        } else {
            slider.getElement().getStyle().clearPosition();
            slider.getElement().getStyle().clearZIndex();
            slider.getElement().getStyle().clearHeight();

            fullscreenBtn.getElement().getStyle().clearPosition();
            fullscreenBtn.getElement().getStyle().clearZIndex();
            fullscreenBtn.getElement().getStyle().clearBottom();
            fullscreenBtn.getElement().getStyle().clearLeft();
            fullscreenBtn.setIconType(IconType.FULLSCREEN);
            fullscreenBtn.setText("Fullscreen Slider");
        }
    }
}
