package gwt.material.design.demo.client.panel;

import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialTopNav;
import gwt.material.design.demo.client.resources.IMaterialConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDemo extends Composite {

	private static MaterialDemoUiBinder uiBinder = GWT.create(MaterialDemoUiBinder.class);

	interface MaterialDemoUiBinder extends UiBinder<Widget, MaterialDemo> {
	}
	
	@UiField HTMLPanel contentPanel;
	@UiField MaterialHome materialHome;
	@UiField MaterialButtonPanel materialButtons;
	@UiField MaterialForms materialForms;
	@UiField MaterialDialogs materialDialogs;
	@UiField MaterialLoaders materialLoaders;
	@UiField MaterialMedia materialMedia;
	@UiField MaterialGettingStarted materialGettingStarted;
	@UiField MaterialCard materialCards;
	@UiField MaterialStyle materialStyle;
	@UiField MaterialNavigations materialNavigations;
	@UiField MaterialCollapsibles materialCollapsibles;
	@UiField MaterialDropDowns materialDropDowns;
	@UiField MaterialFooterPanel materialFooters; 
	@UiField MaterialTabsPanel materialTabs;
	@UiField MaterialCollectionPanel materialCollections;
	@UiField MaterialBadges materialBadges;
	@UiField MaterialGrid materialGrid;
	
	@UiField MaterialNavBar navBar;
	@UiField MaterialTopNav topNav;
	
	public MaterialDemo() {
		initWidget(uiBinder.createAndBindUi(this));
		changeNav(materialHome,"GWT Material", "A  Material Design look and feel for GWT Apps plus Phonegap.");
	}

	@Override
	protected void onAttach() {
		super.onAttach();
	}
	
	@UiHandler("btnChat")
	void onChat(ClickEvent e){
		Window.open(IMaterialConstants.LINK_GITTER_CHAT, "", "");
	}
	
	@UiHandler("btnDownloadPhonegap")
	void onDownloadPhonegap(ClickEvent e){
		Window.open(IMaterialConstants.DOWNLOAD_PHONEGAP_APK, "_blank", "");
	}
	
	@UiHandler("btnGettingStarted")
	void onGettingStarted(ClickEvent e){
		changeNav(materialGettingStarted,"Getting Started", "Learn how to easily start using GWT Material Design in your app.");
	}
	
	@UiHandler("btnAbout")
	void onAbout(ClickEvent e){
		changeNav(materialHome,"GWT Material", "A  Material Design look and feel for GWT Apps plus Phonegap.");
	}

	
	@UiHandler("btnButtons")
	void onButtons(ClickEvent e){
		changeNav(materialButtons,"Buttons", "There are 3 main button types described in material design. The raised button is a standard button that signify actions and seek to give depth to a mostly flat page. The floating circular action button is meant for very important functions. Flat buttons are usually used within elements that already have depth like cards or modals.");
	}
	
	@UiHandler("btnForms")
	void onForms(ClickEvent e){
		changeNav(materialForms, "Forms", "Forms are the standard way to receive user inputted data. The transitions and smoothness of these elements are very important because of the inherent user interaction associated with forms.");
	}
	
	@UiHandler("btnDialogs")
	void onDialogs(ClickEvent e){
		changeNav(materialDialogs, "Dialogs", "Dialogs are content that are not original visible on a page but show up with extra information if needed. The transitions should make the appearance of the dialog make sense and not jarring to the user.");
	}
	
	@UiHandler("btnLoaders")
	void onLoaders(ClickEvent e){
		changeNav(materialLoaders, "Loaders", "If you have content that will take a long time to load, you should give the user feedback. For this reason we provide a number activity + progress indicators.");
	}
	
	@UiHandler("btnMedia")
	void onMedia(ClickEvent e){
		changeNav(materialMedia, "Media", "Media components include things that have to do with large media objects like Images, Video, Audio, etc.");
	}
	
	@UiHandler("btnCards")
	void onCards(ClickEvent e){
		changeNav(materialCards, "Cards", "Cards are a convenient means of displaying content composed of different types of objects. They are also well-suited for presenting similar objects whose size or supported actions can vary considerably, like photos with captions of variable length.");
	}
	
	@UiHandler("btnNavigations")
	void onNavigations(ClickEvent e){
		changeNav(materialNavigations, "NavBar", "The navbar is fully contained by an HTML5 Nav tag. Inside a recommended container div, there are 2 main parts of the navbar. A logo or brand link, and the navigations links. You can align these links to the left or right.");
	}
	
	@UiHandler("btnCollapsibles")
	void onCollapsibles(ClickEvent e){
		changeNav(materialCollapsibles, "Collapsibles", "Collapsibles are accordion elements that expand when clicked on. They allow you to hide content that is not immediately relevant to the user.");
	}

	@UiHandler("btnMaterialDropDowns")
	void onDropdown(ClickEvent e){
		changeNav(materialDropDowns, "Dropdown", "You can add dropdown easily by specifying it's item content and add a UiHandler on it to implement any event.");
	}
	
	@UiHandler("btnMaterialFooter")
	void onFooter(ClickEvent e){
		changeNav(materialFooters, "Footer", "Footers are a great way to organize a lot of site navigation and information at the end of a page. This is where the user will look once hes finished scrolling through the current page or is looking for additional information about your website.");
	}
	
	@UiHandler("btnMaterialTabs")
	void onTabs(ClickEvent e){
		changeNav(materialTabs, "Tabs", "The tabs structure consists of an unordered list of tabs that have hashes corresponding to tab ids. Then when you click on each tab, only the container with the corresponding tab id will become visible.");
	}
	
	@UiHandler("btnCollections")
	void onCollections(ClickEvent e){
		changeNav(materialCollections, "Collections", "Collections allow you to group list objects together.");
	}
	
	@UiHandler("btnBadges")
	void onBadges(ClickEvent e){
		changeNav(materialBadges, "Badges", "Badges can notify you that there are new or unread messages or notifications. Add the new class to the badge to give it the background.");
	}
	
	@UiHandler("btnGrid")
	void onGrid(ClickEvent e){
		changeNav(materialGrid, "Grid", "We are using a standard 12 column fluid responsive grid system.The grid helps you layout your page in an ordered, easy fashion");
	}
	
	private void changeNav(Composite content, String title, String description){
		navBar.hide();
		Window.scrollTo(0, 0);
		contentPanel.clear();
		contentPanel.add(content);
		topNav.setTitle(title);
		topNav.setDescription(description);
	}
	
}
