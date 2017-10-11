/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.demo.client.application.dto;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTitle;

/**
 * Created by kevzl on 4/13/2017.
 */
public class DemoImagePanel extends MaterialRow {

    private MaterialTitle title = new MaterialTitle("Some Title", "Description");
    private MaterialImage image = new MaterialImage("");
    private MaterialAnchorButton source = new MaterialAnchorButton("Source");
    private MaterialAnchorButton demo = new MaterialAnchorButton("Demo");

    public DemoImagePanel(DemoImageDTO dto) {
        super();
        add(title);
        add(source);
        add(demo);
        add(image);
        addStyleName("code");
        setPatternItem(dto);
    }

    public void setPatternItem(DemoImageDTO dto) {
        title.setTitle(dto.getTitle());
        title.setDescription(dto.getDescription());
        image.setMarginTop(20);
        image.setUrl(dto.getUrl());
        source.setHref(dto.getSource());
        source.setBackgroundColor(Color.WHITE);
        source.setTextColor(Color.BLACK);
        source.setMarginRight(20);
        source.setTarget("_blank");
        demo.setHref(dto.getDemo());
        demo.setTarget("_blank");
    }

}
