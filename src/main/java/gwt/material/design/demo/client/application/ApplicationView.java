package gwt.material.design.demo.client.application;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.ui.MaterialWaterfall;
import gwt.material.design.client.base.SearchObject;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.client.ui.html.Header;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField Header header;
    @UiField MaterialNavBar navBar, navBarSearch;
    @UiField MaterialNavBrand navBrand;
    @UiField MaterialSideNav sideNav;
    @UiField HTMLPanel main;
    @UiField MaterialWaterfall waterfall;
    @UiField MaterialPanel panel;
    @UiField MaterialLabel title, description;
    @UiField MaterialAnchorButton btnStarted;
    @UiField MaterialSearch txtSearch;

    private List<SearchObject> listSearches = new ArrayList<>();

    @Inject
    ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(ApplicationPresenter.SLOT_MainContent, main);

        // saerch close event
        txtSearch.addCloseHandler(new CloseHandler<String>() {
            @Override
            public void onClose(CloseEvent<String> event) {
                navBar.setVisible(true);
                navBarSearch.setVisible(false);
            }
        });

        Runnable callback = new Runnable() {
            @Override
            public void run() {
                for(Widget w : waterfall){
                    w.getElement().getStyle().setOpacity(1);
                }
            }
        };

        waterfall.setCallbacks(callback, callback);

        initSearches();
    }

    private void initSearches() {
        // About
        listSearches.add(new SearchObject(IconType.INFO_OUTLINE, "About", "#!about"));

        // Getting Started
        listSearches.add(new SearchObject(IconType.CLOUD_DOWNLOAD, "Getting Started", "#!gettingstarted"));

        // Components
        listSearches.add(new SearchObject(IconType.POLYMER, "Badges", "#!badges"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Buttons", "#!buttons"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Cards", "#!cards"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Chips", "#!chips"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Collapsible", "#!collapsible"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Collections", "#!collections"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Datagrid", "#!datagrid"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Date Picker", "#!pickers"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Dialogs", "#!dialogs"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Dropdown", "#!dropdown"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Errors", "#!errors"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Forms", "#!forms"));
        listSearches.add(new SearchObject(IconType.POLYMER, "FAB", "#fabs"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Footer", "#!footer"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Loaders", "#!loader"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Media", "#!media"));
        listSearches.add(new SearchObject(IconType.POLYMER, "NavBar", "#!navbar"));
        listSearches.add(new SearchObject(IconType.POLYMER, "PushPin", "#!pushpin"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Search", "#search"));
        listSearches.add(new SearchObject(IconType.POLYMER, "SideNavs", "#!sidenavs"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Scrollspy", "#!scrollspy"));
        listSearches.add(new SearchObject(IconType.POLYMER, "Tabs", "#!tabs"));

        // Animations
        listSearches.add(new SearchObject(IconType.PLAY_CIRCLE_OUTLINE, "Core Animations", "#coreAnimations"));
        listSearches.add(new SearchObject(IconType.PLAY_CIRCLE_OUTLINE, "Meaningful", "#meaningful"));

        // Addins
        listSearches.add(new SearchObject(IconType.EXTENSION, "Autocomplete", "#!autocomplete"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Bubble", "#bubble"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Breadcrumb", "#breadcrumb"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Camera", "#camera"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "CutOut", "#cutouts"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Drag and Drop", "#dnd"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "IconMorph", "#iconMorph"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Masonry", "#masonry"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "MenuBar", "#menubar"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "PathAnimator", "#pathAnimator"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "ScrollFire", "#scrollfire"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Subheader", "#subheaders"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Steppers", "#steppers"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Swipeable", "#swipeable"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Time Picker", "#timepickers"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Tree View", "#tree"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Waterfall", "#waterfall"));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Window", "#window"));

        // Style And Layout
        listSearches.add(new SearchObject(IconType.STYLE, "Colors", "#!colors"));
        listSearches.add(new SearchObject(IconType.STYLE, "Grid", "#!grid"));
        listSearches.add(new SearchObject(IconType.STYLE, "Helper", "#!helper"));
        listSearches.add(new SearchObject(IconType.STYLE, "Icons", "#!icons"));
        listSearches.add(new SearchObject(IconType.STYLE, "Shadow", "#!shadow"));
        listSearches.add(new SearchObject(IconType.STYLE, "Theming", "#!themes"));

        // Roadmap
        listSearches.add(new SearchObject(IconType.TIMELINE, "Roadmap", "#roadmap"));

        // Showcase
        listSearches.add(new SearchObject(IconType.WEB, "Showcase", "#!showcase"));

        // Template
        listSearches.add(new SearchObject(IconType.DASHBOARD, "Template", "#!templates"));

        // Charts
        listSearches.add(new SearchObject(IconType.INSERT_CHART, "Charts", "#!charts"));

        txtSearch.setListSearches(listSearches);

        // Sets up the search no result event
        /*txtSearch.addSearchNoResultHandler(new SearchNoResultEvent.SearchNoResultHandler() {
            @Override
            public void onSearchNoResult(SearchNoResultEvent event) {
                MaterialToast.fireToast("No Search Result");
            }
        });*/
    }

    @Override
    public void setPageTitle(String title, String description) {
        this.title.setText(title);
        this.description.setText(description);
        sideNav.hide(sideNav.getElement());
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.title, 1000);
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.description, 1000);
    }

    @UiHandler("imgGPlus")
    void onGPlus(ClickEvent e){
        Window.open("https://plus.google.com/communities/108005250093449814286", "", "_blank");
    }

    @UiHandler("btnSearch")
    void onSearch(ClickEvent e){
        navBarSearch.setVisible(true);
        navBar.setVisible(false);
    }
}
