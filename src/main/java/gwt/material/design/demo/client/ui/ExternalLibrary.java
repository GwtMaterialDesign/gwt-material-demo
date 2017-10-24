package gwt.material.design.demo.client.ui;

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

import com.google.gwt.dom.client.Document;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLink;

public class ExternalLibrary extends MaterialWidget {

    private MaterialAnchorButton externalLink = new MaterialAnchorButton();

    public ExternalLibrary() {
        super(Document.get().createDivElement(), "external-library");
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        externalLink.setIconType(IconType.LANGUAGE);
        add(externalLink);
    }

    public void setText(String text) {
        externalLink.setText(text);
    }

    public void setLink(String link) {
        externalLink.setHref(link);
        externalLink.setTarget("_blank");
    }
}
