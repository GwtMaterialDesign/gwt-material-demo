package gwt.material.design.demo.client.application.gettingstarted.version;

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


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialCollapsibleItem;
import gwt.material.design.client.ui.MaterialLabel;
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
	MaterialAnchorButton btnCore, btnAddins, btnThemes, btnTable, btnJQuery;

	public VersionCollapsibleItem(Version version, int index) {
		initWidget(uiBinder.createAndBindUi(this));
		lblVersion.setText(version.getVersion());
		lblDate.setText(version.getDate());
		btnCore.setBackgroundColor(version.getColor());
		btnAddins.setBackgroundColor(version.getColor());
		btnThemes.setBackgroundColor(version.getColor());
		btnTable.setBackgroundColor(version.getColor());
		btnJQuery.setBackgroundColor(version.getColor());
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
		if(version.getLinkJQuery() == null) {
			btnJQuery.setEnabled(false);
		}else{
			btnJQuery.setHref(version.getLinkJQuery());
			btnJQuery.setTarget("_blank");
		}
		if(version.getLinkTable() == null) {
			btnTable.setEnabled(false);
		}else{
			btnTable.setHref(version.getLinkTable());
			btnTable.setTarget("_blank");
		}
		if(index % 2 == 0){
			colapsItem.setBackgroundColor(Color.GREY_LIGHTEN_4);
		}
	}
}
