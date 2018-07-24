package gwt.material.design.demo.client.application.components.buttons;

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
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class ButtonsPresenter extends Presenter<ButtonsPresenter.MyView, ButtonsPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.buttons)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<ButtonsPresenter> {
    }

    @Inject
    ButtonsPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Buttons", "There are 3 main button types described in material design. The raised button" +
            " is a standard button that signify actions and seek to give depth to a mostly flat page. The floating" +
            " circular action button is meant for very important functions. Flat buttons are usually used within" +
            " elements that already have depth like cards or dialogs.", "components/buttons/ButtonsView", "https://material.io/guidelines/components/buttons.html", this);
    }
}
