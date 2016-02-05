package gwt.material.design.demo.client.application.gettingstarted.version;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialCollapsibleItem;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.dto.Version;

public class VersionCollapsibleItem extends Composite {

	private static VersionCollapsibleItemUiBinder uiBinder = GWT.create(VersionCollapsibleItemUiBinder.class);
	private final Version version;

	interface VersionCollapsibleItemUiBinder extends UiBinder<Widget, VersionCollapsibleItem> {
	}

	@UiField
	MaterialLabel lblVersion, lblDate;

	@UiField
	MaterialCollapsibleItem colapsItem;

	@UiField
	MaterialAnchorButton btnCore, btnAddins, btnThemes;

	public VersionCollapsibleItem(Version version, int index) {
		initWidget(uiBinder.createAndBindUi(this));
		lblVersion.setText(version.getVersion());
		lblDate.setText(version.getDate());

		btnCore.setBackgroundColor(version.getColor());
		btnAddins.setBackgroundColor(version.getColor());
		btnThemes.setBackgroundColor(version.getColor());
		this.version = version;
		if(version.getLinkCore() == null){
			btnCore.setEnabled(false);
		}else{
			btnCore.setHref(version.getLinkCore());
			btnCore.setTarget("_blank");
		}
		if(version.getLinkAddins() == null){
			btnAddins.setEnabled(false);
		}else{
			btnAddins.setHref(version.getLinkAddins());
			btnAddins.setTarget("_blank");
		}
		if(version.getLinkThemes() == null){
			btnThemes.setEnabled(false);
		}else{
			btnThemes.setHref(version.getLinkThemes());
			btnThemes.setTarget("_blank");
		}
		if(index % 2 == 0){
			colapsItem.setBackgroundColor("grey lighten-4");
		}
	}
}
