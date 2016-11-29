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


import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Timer;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.scrollfire.MaterialScrollfire;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.HideOn;
import gwt.material.design.client.ui.*;
import gwt.material.design.demo.client.application.dto.Links;
import gwt.material.design.demo.client.ui.base.HasScrollspy;

import java.util.List;

import static gwt.material.design.jquery.client.api.JQuery.$;

public class NavigatedView extends ViewImpl implements HasScrollspy {

    protected MaterialScrollspy scrollspy = new MaterialScrollspy();
    MaterialWidget panel;

    @Override
    public void buildScrollSpy(List<Links> links, MaterialWidget panel) {
        this.panel = panel;
        for(Links link : links) {
            MaterialLink spy = new MaterialLink();
            spy.setText(link.getTitle());
            spy.setHref(link.getLink());
            scrollspy.add(spy);
        }
        panel.setMarginTop(40);
        scrollspy.setHideOn(HideOn.HIDE_ON_MED_DOWN);
        scrollspy.setTop(0);
        panel.add(scrollspy);
        scrollspy.addAttachHandler(attachEvent -> {
            MaterialPushpin.apply(scrollspy, 300.0, 10000.0, 64.0);
        });
    }

}
