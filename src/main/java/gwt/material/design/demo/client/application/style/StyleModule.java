package gwt.material.design.demo.client.application.style;

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
import gwt.material.design.demo.client.application.style.blueprint.BluePrintModule;
import gwt.material.design.demo.client.application.style.colors.ColorsModule;
import gwt.material.design.demo.client.application.style.grid.GridModule;
import gwt.material.design.demo.client.application.style.helper.HelperModule;
import gwt.material.design.demo.client.application.style.icons.IconsModule;
import gwt.material.design.demo.client.application.style.shadow.ShadowModule;
import gwt.material.design.demo.client.application.style.themes.ThemesModule;

public class StyleModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new ColorsModule());
        install(new GridModule());
        install(new HelperModule());
        install(new IconsModule());
        install(new ShadowModule());
        install(new ThemesModule());
        install(new BluePrintModule());
    }
}
