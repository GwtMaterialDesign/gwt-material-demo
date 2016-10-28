package gwt.material.design.demo.client.application.menu;

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

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.event.SetPageTitleEvent.SetPageTitleHandler;

public class MenuPresenter extends PresenterWidget<MenuPresenter.MyView> implements MenuUiHandlers,
    SetPageTitleHandler {

    interface MyView extends View, HasUiHandlers<MenuUiHandlers> {
        void setPageTitle(String title, String description, String link);
    }

    @Inject
    MenuPresenter(EventBus eventBus, MyView view) {
        super(eventBus, view);

        getView().setUiHandlers(this);
    }

    @Override
    protected void onBind() {
        super.onBind();

        addRegisteredHandler(SetPageTitleEvent.TYPE, this);
    }

    @Override
    public void onSetPageTitle(SetPageTitleEvent event) {
        getView().setPageTitle(event.getTitle(), event.getDescription(), event.getLink());
    }
}