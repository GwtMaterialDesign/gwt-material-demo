package gwt.material.design.demo.client.application.components.footer;

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
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.ContentPushEvent;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class FooterPresenter extends Presenter<FooterPresenter.MyView, FooterPresenter.MyProxy>
        implements ContentPushEvent.ContentPushHandler{

    interface MyView extends View {
        void resetFooter();
    }

    @NameToken(NameTokens.footer)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<FooterPresenter> {

    }

    @Inject
    FooterPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        addRegisteredHandler(ContentPushEvent.TYPE, this);
    }

    @Override
    protected void onReveal() {
        super.onReveal();

        SetPageTitleEvent.fire("Footer", "Footers are a great way to organize a lot of site navigation and " +
            "information at the end of a page. This is where the user will look once hes finished scrolling " +
            "through the current page or is looking for additional information about your website.", "components/footer/FooterView", "", this);
    }

    @Override
    public void onContentPush(ContentPushEvent event) {
        getView().resetFooter();
    }
}
