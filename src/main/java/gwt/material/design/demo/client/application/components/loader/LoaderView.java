package gwt.material.design.demo.client.application.components.loader;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.ProgressType;
import gwt.material.design.client.ui.MaterialCollapsibleItem;
import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialNavBar;

import javax.inject.Inject;

public class LoaderView extends ViewImpl implements LoaderPresenter.MyView {
    interface Binder extends UiBinder<Widget, LoaderView> {
    }

    @UiField
    MaterialNavBar navBar;

    @UiField
    MaterialCollapsibleItem collapseItemOne, collapseItemTwo, collapseItemThree;

    @Inject
    LoaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnShowLoader")
    void onShowLoader(ClickEvent e) {
        MaterialLoader.showLoading(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showLoading(false);
            }
        };
        t.schedule(3000);
    }

    @UiHandler("btnShowProgress")
    void onShowProgress(ClickEvent e) {
        MaterialLoader.showProgress(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showProgress(false);
            }
        };
        t.schedule(3000);
    }

    @UiHandler("btnShowNavBarProgress")
    void onShowNavBarProgress(ClickEvent e) {
        navBar.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                navBar.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemOne")
    void onShowCollapseProgress(ClickEvent e){
        collapseItemOne.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemOne.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemTwo")
    void onShowCollapseTwoProgress(ClickEvent e){
        collapseItemTwo.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemTwo.hideProgress();
            }
        };
        t.schedule(3000);
    }

    @UiHandler("collapseItemThree")
    void onShowCollapseThreeProgress(ClickEvent e){
        collapseItemThree.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                collapseItemThree.hideProgress();
            }
        };
        t.schedule(3000);
    }

}
