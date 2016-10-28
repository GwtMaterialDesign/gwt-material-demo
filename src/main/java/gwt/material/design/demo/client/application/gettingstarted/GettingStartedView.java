package gwt.material.design.demo.client.application.gettingstarted;

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


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialCollapsible;
import gwt.material.design.demo.client.application.dto.DataHelper;
import gwt.material.design.demo.client.application.dto.Version;
import gwt.material.design.demo.client.application.gettingstarted.version.VersionCollapsibleItem;
import gwt.material.design.demo.client.resources.MaterialConstants;

import javax.inject.Inject;

public class GettingStartedView extends ViewWithUiHandlers<GettingStartedUiHandlers> implements GettingStartedPresenter.MyView {

    interface Binder extends UiBinder<Widget, GettingStartedView> {
    }

    private final MaterialConstants constants;

    @UiField
    MaterialCollapsible versionColaps;

    @Inject
    GettingStartedView(Binder uiBinder, MaterialConstants constants) {
        initWidget(uiBinder.createAndBindUi(this));
        this.constants = constants;
    }

    @UiHandler("btnDemoStarter")
    void onDemoStarter(ClickEvent e) {
        Window.open(constants.demoStarterUrl(), "_blank", "");
    }

    @UiHandler("btnSourceStarter")
    void onSourceStarter(ClickEvent e) {
        Window.open(constants.sourceStarterUrl(), "_blank", "");
    }
    @Override
    public void loadAllVersions() {
        versionColaps.clear();
        int i = 0;
        for(Version version : DataHelper.getAllVersions()){
            versionColaps.add(new VersionCollapsibleItem(version, i));
            i++;
        }
    }
}
