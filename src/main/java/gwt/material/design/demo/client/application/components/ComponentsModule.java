package gwt.material.design.demo.client.application.components;

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


import com.google.gwt.inject.client.AbstractGinModule;
import gwt.material.design.demo.client.application.components.badges.BadgesModule;
import gwt.material.design.demo.client.application.components.breadcrumbs.BreadcrumbsModule;
import gwt.material.design.demo.client.application.components.buttons.ButtonsModule;
import gwt.material.design.demo.client.application.components.cards.CardsModule;
import gwt.material.design.demo.client.application.components.chips.ChipsModule;
import gwt.material.design.demo.client.application.components.collapsible.CollapsibleModule;
import gwt.material.design.demo.client.application.components.collections.CollectionsModule;
import gwt.material.design.demo.client.application.components.dialogs.DialogsModule;
import gwt.material.design.demo.client.application.components.dropdown.DropdownModule;
import gwt.material.design.demo.client.application.components.errors.ErrorsModule;
import gwt.material.design.demo.client.application.components.fabs.FABModule;
import gwt.material.design.demo.client.application.components.footer.FooterModule;
import gwt.material.design.demo.client.application.components.forms.FormsModule;
import gwt.material.design.demo.client.application.components.loader.LoaderModule;
import gwt.material.design.demo.client.application.components.media.MediaModule;
import gwt.material.design.demo.client.application.components.navbar.NavBarModule;
import gwt.material.design.demo.client.application.components.pickers.PickersModule;
import gwt.material.design.demo.client.application.components.pushpin.PushPinModule;
import gwt.material.design.demo.client.application.components.scrollspy.ScrollspyModule;
import gwt.material.design.demo.client.application.components.search.SearchModule;
import gwt.material.design.demo.client.application.components.sidenavs.SideNavsModule;
import gwt.material.design.demo.client.application.components.tabs.TabsModule;

public class ComponentsModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new BadgesModule());
        install(new ButtonsModule());
        install(new BreadcrumbsModule());
        install(new CardsModule());
        install(new ChipsModule());
        install(new CollapsibleModule());
        install(new CollectionsModule());
        install(new DialogsModule());
        install(new DropdownModule());
        install(new ErrorsModule());
        install(new FormsModule());
        install(new FooterModule());
        install(new LoaderModule());
        install(new MediaModule());
        install(new NavBarModule());
        install(new PickersModule());
        install(new ScrollspyModule());
        install(new PushPinModule());
        install(new TabsModule());
        install(new SideNavsModule());
        install(new FABModule());
        install(new SearchModule());
    }
}
