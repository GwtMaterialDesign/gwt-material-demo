package gwt.material.design.demo.client.application;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.SafeHtmlHeader;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialWaterfall;
import gwt.material.design.client.constants.HideOn;
import gwt.material.design.client.constants.ShowOn;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.client.ui.html.Header;

import javax.inject.Inject;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField Header header;
    @UiField MaterialNavBar navBar;
    @UiField MaterialNavBrand navBrand;
    @UiField MaterialSideNav sideNav;
    @UiField HTMLPanel main;
    @UiField MaterialWaterfall waterfall;
    @UiField MaterialPanel panel;
    @UiField MaterialLabel title, description;
    @UiField MaterialAnchorButton btnStarted;

    @Inject
    ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(ApplicationPresenter.SLOT_MainContent, main);

        Runnable openCallback = new Runnable() {
            @Override
            public void run() {
                waterfall.add(btnStarted);
                navBrand.setText("");
                btnStarted.setMarginTop(4);
                btnStarted.removeStyleName(HideOn.HIDE_ON_SMALL.getCssName());
                btnStarted.setFloat(Style.Float.NONE);
                panel.setVisibility(Style.Visibility.VISIBLE);
            }
        };

        Runnable closeCallback = new Runnable() {
            @Override
            public void run() {
                navBar.add(btnStarted);
                btnStarted.setMarginTop(4);
                btnStarted.setHideOn(HideOn.HIDE_ON_SMALL);
                btnStarted.setFloat(Style.Float.RIGHT);
                navBrand.setText("GWT Material / " + title.getText());
                panel.setVisibility(Style.Visibility.HIDDEN);
            }
        };
        waterfall.setCallbacks(openCallback, closeCallback);
    }

    @Override
    public void setPageTitle(String title, String description) {
        this.title.setText(title);
        this.description.setText(description);
        sideNav.hide(sideNav.getElement());
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.title, 1000);
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.description, 1000);
        MaterialAnimator.animate(Transition.FADEINUP, main, 1000);
    }

    @UiHandler("imgGPlus")
    void onGPlus(ClickEvent e){
        Window.open("https://plus.google.com/communities/108005250093449814286", "", "_blank");
    }
}
