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


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class GettingStartedPresenter extends Presenter<GettingStartedPresenter.MyView, GettingStartedPresenter.MyProxy> implements GettingStartedUiHandlers {
    interface MyView extends View, HasUiHandlers<GettingStartedUiHandlers> {
        void loadAllVersions();
    }

    @NameToken(NameTokens.gettingstarted)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<GettingStartedPresenter> {
    }

    @Inject
    GettingStartedPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);

        getView().setUiHandlers(this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        loadAllVersions();
        SetPageTitleEvent.fire("Getting Started",
            "Learn how to easily start using GWT Material Design in your app.", "", "", this);
    }

    public void loadAllVersions() {
        getView().loadAllVersions();
    }
}
