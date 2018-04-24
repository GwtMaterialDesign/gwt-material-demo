package gwt.material.design.demo.client.application.showcase;

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
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialSplashScreen;
import gwt.material.design.client.ui.MaterialWeather;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;

public class ShowcaseView extends ViewImpl implements ShowcasePresenter.MyView {
    interface Binder extends UiBinder<Widget, ShowcaseView> {
    }

    @UiField
    MaterialSplashScreen splash;

    @Inject
    ShowcaseView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnSplashScreen")
    void onSplashscreen(ClickEvent e){
        splash.show();
        Timer t = new Timer() {
            @Override
            public void run() {
              splash.hide();
            }
        };
        t.schedule(3000);
    }
}
