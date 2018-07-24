package gwt.material.design.demo.client.application.incubator.recaptcha;

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


import com.google.gwt.core.client.Callback;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.api.ApiRegistry;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.google.recaptcha.ReCaptcha;
import gwt.material.design.incubator.client.google.recaptcha.api.RecaptchaApi;

public class RecaptchaView extends ViewImpl implements RecaptchaPresenter.MyView {
    public interface Binder extends UiBinder<Widget, RecaptchaView> {
    }

    @UiField
    ReCaptcha recaptcha;

    @Inject
    RecaptchaView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        // Load the Api
        RecaptchaApi recaptchaApi = new RecaptchaApi("6LeZSRIUAAAAAE3JdZpdi6shhA87ZUG4U2ICsGlJ");
        ApiRegistry.register(recaptchaApi, new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception reason) {
                MaterialToast.fireToast(reason.getMessage());
            }

            @Override
            public void onSuccess(Void result) {
                recaptcha.load(recaptchaApi);
            }
        });
    }
}
