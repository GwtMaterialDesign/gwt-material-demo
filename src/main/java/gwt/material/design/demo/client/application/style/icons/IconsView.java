package gwt.material.design.demo.client.application.style.icons;

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


import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;

import javax.inject.Inject;

public class IconsView extends ViewImpl implements IconsPresenter.MyView {
    interface Binder extends UiBinder<Widget, IconsView> {
    }

    @UiField
    MaterialRow iconsRow;

    @Inject
    IconsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        getAllIcons();
    }

    protected void getAllIcons() {
        for (IconType i : IconType.values()) {
            MaterialColumn column = new MaterialColumn(4, 3, 2);
            column.setTextAlign(TextAlign.CENTER);
            column.setPadding(40);
            MaterialIcon icon = new MaterialIcon();
            icon.setIconSize(IconSize.MEDIUM);
            icon.setIconType(i);

            MaterialLabel label = new MaterialLabel();
            label.setFontSize("0.8em");
            label.setText(i.name().toUpperCase());

            column.add(icon);
            column.add(label);
            iconsRow.add(column);
        }
    }
}
