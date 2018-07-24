package gwt.material.design.demo.client.application.incubator;

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


import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwt.material.design.demo.client.application.incubator.alert.AlertModule;
import gwt.material.design.demo.client.application.incubator.async.AsyncModule;
import gwt.material.design.demo.client.application.incubator.google.addresslookup.AddressLookupModule;
import gwt.material.design.demo.client.application.incubator.infinitescroll.InfiniteScrollModule;
import gwt.material.design.demo.client.application.incubator.language.LanguageSelectorModule;
import gwt.material.design.demo.client.application.incubator.loadingstate.LoadingStateModule;
import gwt.material.design.demo.client.application.incubator.progress.ProgressLineBarModule;
import gwt.material.design.demo.client.application.incubator.recaptcha.RecaptchaModule;
import gwt.material.design.demo.client.application.incubator.search.InlineSearchModule;
import gwt.material.design.demo.client.application.incubator.timer.TimerModule;
import gwt.material.design.demo.client.application.incubator.toggle.ToggleModule;

public class IncubatorModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new AlertModule());
        install(new AsyncModule());
        install(new LanguageSelectorModule());
        install(new LoadingStateModule());
        install(new ProgressLineBarModule());
        install(new RecaptchaModule());
        install(new InlineSearchModule());
        install(new TimerModule());
        install(new ToggleModule());
        install(new AddressLookupModule());
        install(new InfiniteScrollModule());
    }
}
