package gwt.material.design.demo.client.application;

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
import gwt.material.design.demo.client.application.about.AboutModule;
import gwt.material.design.demo.client.application.addins.AddinsModule;
import gwt.material.design.demo.client.application.animations.AnimationsModule;
import gwt.material.design.demo.client.application.apps.AppsModule;
import gwt.material.design.demo.client.application.charts.ChartsModule;
import gwt.material.design.demo.client.application.components.ComponentsModule;
import gwt.material.design.demo.client.application.datatable.DataTableModule;
import gwt.material.design.demo.client.application.gettingstarted.GettingStartedModule;
import gwt.material.design.demo.client.application.incubator.IncubatorModule;
import gwt.material.design.demo.client.application.menu.MenuModule;
import gwt.material.design.demo.client.application.pwa.PwaModule;
import gwt.material.design.demo.client.application.roadmap.RoadMapModule;
import gwt.material.design.demo.client.application.showcase.ShowcaseModule;
import gwt.material.design.demo.client.application.style.StyleModule;
import gwt.material.design.demo.client.application.templates.TemplatesModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class,
                ApplicationView.class, ApplicationPresenter.MyProxy.class);

        install(new MenuModule());
        install(new AppsModule());
        install(new RoadMapModule());
        install(new TemplatesModule());
        install(new PwaModule());
        install(new ShowcaseModule());
        install(new GettingStartedModule());
        install(new AddinsModule());
        install(new AboutModule());
        install(new AnimationsModule());
        install(new ComponentsModule());
        install(new StyleModule());
        install(new ChartsModule());
        install(new DataTableModule());
        install(new IncubatorModule());
    }
}
