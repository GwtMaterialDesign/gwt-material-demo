package gwt.material.design.demo.client.application.incubator.loadingstate;

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


import com.google.gwt.core.client.Scheduler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSwitch;
import gwt.material.design.demo.client.application.incubator.language.LanguageSelectorPresenter;
import gwt.material.design.incubator.client.alert.Alert;
import gwt.material.design.incubator.client.loadingstate.AppLoadingState;
import gwt.material.design.incubator.client.loadingstate.constants.State;

public class LoadingStateView extends ViewImpl implements LoadingStatePresenter.MyView {
    public interface Binder extends UiBinder<Widget, LoadingStateView> {
    }

    @UiField
    MaterialPanel target;

    @UiField
    AppLoadingState appLoadingState;

    @UiField
    MaterialSwitch errorSuccess;

    @Inject
    LoadingStateView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        appLoadingState.setTarget(target);
        appLoadingState.addSuccessHandler(event -> appLoadingState.reset(target));
        appLoadingState.addErrorHandler(event -> appLoadingState.reset(target));
    }

    @UiHandler("login")
    void login(ClickEvent e) {
        appLoadingState.setState(State.LOADING, "Loggin in", "Please wait while logging in your account.");
        Scheduler.get().scheduleFixedDelay(() -> {
            if (errorSuccess.getValue()) {
                appLoadingState.setState(State.SUCCESS, "Successfully logged in", "You are now redirected to homepage.");
            } else {
                appLoadingState.setState(State.ERROR, "Failed logging in", "Please check your login credentials.");
            }
            return false;
        }, 2000);
    }
}
