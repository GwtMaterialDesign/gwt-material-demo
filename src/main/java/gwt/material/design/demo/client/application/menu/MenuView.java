package gwt.material.design.demo.client.application.menu;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.base.SearchObject;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.events.SideNavPushEvent;
import gwt.material.design.client.events.SideNavPushEvent.SideNavPushHandler;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.demo.client.ThemeManager;
import gwt.material.design.demo.client.place.NameTokens;
import gwt.material.design.themes.amber.ThemeAmber;
import gwt.material.design.themes.blue.ThemeBlue;
import gwt.material.design.themes.brown.ThemeBrown;
import gwt.material.design.themes.client.ThemeLoader;
import gwt.material.design.themes.green.ThemeGreen;
import gwt.material.design.themes.grey.ThemeGrey;
import gwt.material.design.themes.orange.ThemeOrange;
import gwt.material.design.themes.pink.ThemePink;
import gwt.material.design.themes.purple.ThemePurple;
import gwt.material.design.themes.red.ThemeRed;
import gwt.material.design.themes.yellow.ThemeYellow;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

class MenuView extends ViewWithUiHandlers<MenuUiHandlers> implements MenuPresenter.MyView {
    private String link;

    interface Binder extends UiBinder<Widget, MenuView> {
    }

    private List<SearchObject> listSearches = new ArrayList<>();

    @UiField MaterialHeader header;
    @UiField MaterialNavBar navBar, navBarSearch;
    @UiField MaterialSideNav sideNav;
    @UiField MaterialPanel panel, titlePanel;
    @UiField MaterialLabel title, description;
    @UiField MaterialSearch txtSearch;
    @UiField MaterialComboBox<ThemeLoader.ThemeBundle> comboThemes;
    @UiField MaterialChip chipXml, chipJava;

    @Inject
    MenuView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        chipJava.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        chipJava.addClickHandler(clickEvent -> {
            String java = "https://github.com/GwtMaterialDesign/gwt-material-demo/tree/master/src/main/java/gwt/material/design/demo/client/application/" + link + ".java";
            Window.open(java, "_blank", "");
        });

        chipXml.getElement().getStyle().setCursor(Style.Cursor.POINTER);
        chipXml.addClickHandler(clickEvent -> {
            String xml = "https://github.com/GwtMaterialDesign/gwt-material-demo/tree/master/src/main/java/gwt/material/design/demo/client/application/" + link + ".ui.xml";
            Window.open(xml, "_blank", "");
        });
        ThemeManager.register(chipXml, ThemeManager.DARKER_SHADE);
        ThemeManager.register(chipXml.getLetterMixin().getSpan(), ThemeManager.LIGHTER_SHADE);
        ThemeManager.register(chipJava, ThemeManager.DARKER_SHADE);
        ThemeManager.register(chipJava.getLetterMixin().getSpan(), ThemeManager.LIGHTER_SHADE);
        sideNav.addHandler(new SideNavPushHandler() {
            @Override
            public void onPush(SideNavPushEvent event) {
                int duration = event.getDuration();
                int width = event.getWidth();

                Style style = navBar.getElement().getStyle();
                style.setProperty("transition", duration + "ms");
                style.setProperty("mozTransition", duration + "ms");
                style.setProperty("webkitTransition", duration + "ms");

                navBar.getElement().getStyle().setProperty("width", "calc(100% - "+width+"px)");
                navBarSearch.getElement().getStyle().setProperty("width", "calc(100% - "+width+"px)");
            }
        }, SideNavPushEvent.TYPE);

        // search close event
        txtSearch.addCloseHandler(event -> {
            navBar.setVisible(true);
            navBarSearch.setVisible(false);
        });

        // search open event
        txtSearch.addOpenHandler(openEvent -> {
            navBarSearch.setVisible(true);
            navBar.setVisible(false);
        });
        initThemes();
        initSearches();
    }

    private void initSearches() {
        // About
        listSearches.add(new SearchObject(IconType.INFO_OUTLINE, "About", "#" + NameTokens.about));

        // Getting Started
        listSearches.add(new SearchObject(IconType.CLOUD_DOWNLOAD, "Getting Started", "#" + NameTokens.gettingstarted));

        // Components
        listSearches.add(new SearchObject(IconType.POLYMER, "Badges", "#" + NameTokens.badges));
        listSearches.add(new SearchObject(IconType.POLYMER, "Buttons", "#" + NameTokens.buttons));
        listSearches.add(new SearchObject(IconType.POLYMER, "Cards", "#" + NameTokens.cards));
        listSearches.add(new SearchObject(IconType.POLYMER, "Chips", "#" + NameTokens.chips));
        listSearches.add(new SearchObject(IconType.POLYMER, "Collapsible", "#" + NameTokens.collapsible));
        listSearches.add(new SearchObject(IconType.POLYMER, "Collections", "#" + NameTokens.collections));
        listSearches.add(new SearchObject(IconType.POLYMER, "Date Picker", "#" + NameTokens.pickers));
        listSearches.add(new SearchObject(IconType.POLYMER, "Dialogs", "#" + NameTokens.dialogs));
        listSearches.add(new SearchObject(IconType.POLYMER, "Dropdown", "#" + NameTokens.dropdown));
        listSearches.add(new SearchObject(IconType.POLYMER, "Errors", "#" + NameTokens.errors));
        listSearches.add(new SearchObject(IconType.POLYMER, "Forms", "#" + NameTokens.forms));
        listSearches.add(new SearchObject(IconType.POLYMER, "FAB", "#" + NameTokens.fabs));
        listSearches.add(new SearchObject(IconType.POLYMER, "Footer", "#" + NameTokens.footer));
        listSearches.add(new SearchObject(IconType.POLYMER, "Loaders", "#" + NameTokens.loader));
        listSearches.add(new SearchObject(IconType.POLYMER, "Media", "#" + NameTokens.media));
        listSearches.add(new SearchObject(IconType.POLYMER, "NavBar", "#" + NameTokens.navbar));
        listSearches.add(new SearchObject(IconType.POLYMER, "PushPin", "#" + NameTokens.pushPin));
        listSearches.add(new SearchObject(IconType.POLYMER, "Search", "#" + NameTokens.search));
        listSearches.add(new SearchObject(IconType.POLYMER, "SideNavs", "#" + NameTokens.sidenavs));
        listSearches.add(new SearchObject(IconType.POLYMER, "Scrollspy", "#" + NameTokens.scrollspy));
        listSearches.add(new SearchObject(IconType.POLYMER, "Tabs", "#" + NameTokens.tabs));

        // Animations
        listSearches.add(new SearchObject(IconType.PLAY_CIRCLE_OUTLINE, "Core Animations", "#" + NameTokens.coreAnimations));
        listSearches.add(new SearchObject(IconType.PLAY_CIRCLE_OUTLINE, "Meaningful", "#" + NameTokens.meaningful));

        // Addins
        listSearches.add(new SearchObject(IconType.EXTENSION, "Autocomplete", "#" + NameTokens.autocomplete));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Avatar", "#" + NameTokens.avatar));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Bubble", "#" + NameTokens.bubble));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Breadcrumb", "#" + NameTokens.breadcrumbs));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Camera", "#" + NameTokens.camera));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Carousel", "#" + NameTokens.carousel));
        listSearches.add(new SearchObject(IconType.EXTENSION, "ComboBox", "#" + NameTokens.combobox));
        listSearches.add(new SearchObject(IconType.EXTENSION, "CutOut", "#" + NameTokens.cutouts));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Data Table", "#" + NameTokens.datatable));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Doc Viewer", "#" + NameTokens.docviewer));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Drag and Drop", "#" + NameTokens.dnd));
        listSearches.add(new SearchObject(IconType.EXTENSION, "File Uploader", "#" + NameTokens.fileuploader));
        listSearches.add(new SearchObject(IconType.EXTENSION, "IconMorph", "#" + NameTokens.iconMorph));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Masonry", "#" + NameTokens.masonry));
        listSearches.add(new SearchObject(IconType.EXTENSION, "MenuBar", "#" + NameTokens.menubar));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Overlay", "#" + NameTokens.overlay));
        listSearches.add(new SearchObject(IconType.EXTENSION, "PathAnimator", "#" + NameTokens.pathAnimator));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Rating", "#" + NameTokens.rating));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Rich Editor", "#" + NameTokens.richeditor));
        listSearches.add(new SearchObject(IconType.EXTENSION, "ScrollFire", "#" + NameTokens.scrollfire));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Split Panel", "#" + NameTokens.splitpanel));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Subheader", "#" + NameTokens.subheaders));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Steppers", "#" + NameTokens.steppers));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Swipeable", "#" + NameTokens.swipeable));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Time Picker", "#" + NameTokens.timepickers));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Tree View", "#" + NameTokens.tree));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Waterfall", "#" + NameTokens.waterfall));
        listSearches.add(new SearchObject(IconType.EXTENSION, "Window", "#" + NameTokens.window));

        // Style And Layout
        listSearches.add(new SearchObject(IconType.STYLE, "Colors", "#" + NameTokens.colors));
        listSearches.add(new SearchObject(IconType.STYLE, "Grid", "#" + NameTokens.grid));
        listSearches.add(new SearchObject(IconType.STYLE, "Helper", "#" + NameTokens.helper));
        listSearches.add(new SearchObject(IconType.STYLE, "Icons", "#" + NameTokens.icons));
        listSearches.add(new SearchObject(IconType.STYLE, "Shadow", "#" + NameTokens.shadow));
        listSearches.add(new SearchObject(IconType.STYLE, "Theming", "#" + NameTokens.themes));

        // Roadmap
        listSearches.add(new SearchObject(IconType.TIMELINE, "Roadmap", "#" + NameTokens.roadmap));

        // Showcase
        listSearches.add(new SearchObject(IconType.WEB, "Showcase", "#" + NameTokens.showcase));

        // Apps
        listSearches.add(new SearchObject(IconType.WEB, "Apps", "#" + NameTokens.apps));

        // Template
        listSearches.add(new SearchObject(IconType.DASHBOARD, "Template", "#" + NameTokens.templates));

        // Charts
        listSearches.add(new SearchObject(IconType.INSERT_CHART, "Charts", "#" + NameTokens.charts));

        txtSearch.setListSearches(listSearches);

    }

    protected void initThemes() {
        ThemeManager.initialize();
        ThemeManager.register(navBar, ThemeManager.DARKER_SHADE);
        ThemeManager.register(titlePanel);
        buildThemeList();
        comboThemes.setValue(ThemeManager.getBundle());
        comboThemes.addValueChangeHandler(event -> {
            ThemeManager.loadTheme(event.getValue());
        });
    }

    protected void buildThemeList() {
        comboThemes.addItem("Amber", ThemeAmber.INSTANCE);
        comboThemes.addItem("Blue", ThemeBlue.INSTANCE);
        comboThemes.addItem("Brown", ThemeBrown.INSTANCE);
        comboThemes.addItem("Green", ThemeGreen.INSTANCE);
        comboThemes.addItem("Grey", ThemeGrey.INSTANCE);
        comboThemes.addItem("Orange", ThemeOrange.INSTANCE);
        comboThemes.addItem("Pink", ThemePink.INSTANCE);
        comboThemes.addItem("Purple", ThemePurple.INSTANCE);
        comboThemes.addItem("Red", ThemeRed.INSTANCE);
        comboThemes.addItem("Yellow", ThemeYellow.INSTANCE);
    }

    @Override
    public void setPageTitle(String title, String description, String link) {
        this.title.setText(title);
        this.description.setText(description);
        this.link = link;

        if (link.isEmpty()) {
            chipJava.setVisible(false);
            chipXml.setVisible(false);
        } else {
            chipJava.setVisible(true);
            chipXml.setVisible(true);
        }

        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.title, 1000);
        MaterialAnimator.animate(Transition.BOUNCEINLEFT, this.description, 1000);
    }

    @UiHandler("btnSearch")
    void onSearch(ClickEvent e){
        txtSearch.open();
    }
}