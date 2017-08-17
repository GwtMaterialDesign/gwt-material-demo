package gwt.material.design.demo.selenium.test.constants;

public interface Elements {

    String SEARCH_FIELD = "header nav .nav-wrapper .input-field";
    String SEARCH_NAV = "header nav:nth-child(2)";
    String SEARCH_INPUT = "header nav .nav-wrapper .input-field input[type=search]";
    String SEARCH_RESULT = ".search-result";
    String SEARCH_OPEN_ICON = "header nav .nav-wrapper a:nth-child(3)";
    String SEARCH_CLOSE_ICON = "nav .input-field > i";

    String SIDENAV_LEFT_ICON = "nav a[data-activates='sideBar']";
    String SIDENAV_RIGHT_ICON = "nav a[data-activates='rightSideBar']";
    String SIDENAV_LEFT = "ul#sideBar";
    String SIDENAV_RIGHT = "ul#rightSideBar";
    String SIDENAV_RIGHT_MENU = "ul#rightSideBar li:nth-child(2)";
    String SIDENAV_COMPONENTS_LINK = "ul#sideBar ul.collapsible > li:nth-child(1)";
    String MAIN = "main";

    String APP_TITLE = "main > div > div > span.material-label:nth-child(1)";
    String SHOWCASE_SECTION = ".code";
}
