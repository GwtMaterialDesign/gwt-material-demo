package gwt.material.design.demo.client.application.components.pushpin;

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
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialPushpin;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;

public class PushPinView extends ViewImpl implements PushPinPresenter.MyView {
    interface Binder extends UiBinder<Widget, PushPinView> {
    }

    @UiField
    MaterialPanel source;

    @Inject
    PushPinView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        ThemeManager.register(source);
        MaterialPushpin.apply(source, 300.0, 64.0);
    }
}
