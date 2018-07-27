package gwt.material.design.demo.client.application.incubator.async;

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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialSwitch;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.async.AbstractAsyncButton;
import gwt.material.design.incubator.client.async.AsyncButton;
import gwt.material.design.incubator.client.async.AsyncIcon;

public class AsyncView extends ViewImpl implements AsyncPresenter.MyView {
    public interface Binder extends UiBinder<Widget, AsyncView> {
    }

    @UiField
    AsyncButton button, custom, disableButton, flatButton, outlinedButton, floating, floating2, floating3;

    @UiField
    AsyncIcon icon, iconMedium, iconLarge;

    @UiField
    MaterialSwitch errorSuccess;

    @Inject
    AsyncView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        addClickHandler(button, disableButton, flatButton, outlinedButton, icon, iconMedium, iconLarge, floating, floating2, floating3);
        
        // For customization
        custom.addSuccessHandler(event -> {
            custom.setBackgroundColor(Color.GREEN);
            custom.setTextColor(Color.WHITE);
        });

        custom.addErrorHandler(event -> {
            custom.setBackgroundColor(Color.RED);
            custom.setTextColor(Color.WHITE);
        });

        custom.addLoadingHandler(event -> {
            custom.setBackgroundColor(Color.BLUE);
            custom.setTextColor(Color.WHITE);
        });

        custom.addClickHandler(event -> {
            custom.loading("Loading your data...");
            Scheduler.get().scheduleFixedDelay(() -> {
                if (errorSuccess.getValue()) {
                    custom.success("Successfully Loaded");
                } else {
                    custom.error("Failed to load");
                }
                return false;
            }, 3000);
        });
    }

    protected void addClickHandler(AbstractAsyncButton... buttons) {
        for (AbstractAsyncButton button : buttons) {
            button.addLoadingHandler(event -> {
                MaterialToast.fireToast("Loading Event Fired");
            });

            button.addSuccessHandler(event -> {
                MaterialToast.fireToast("Success Event Fired");
            });

            button.addErrorHandler(event -> {
                MaterialToast.fireToast("Errored Event Fired");
            });
            button.addClickHandler(event -> {
                button.loading("Loading your data...");
                Scheduler.get().scheduleFixedDelay(() -> {
                    if (errorSuccess.getValue()) {
                        button.success("Successfully Loaded");
                    } else {
                        button.error("Failed to load");
                    }
                    return false;
                }, 3000);
            });
        }
    }
}
