package gwt.material.design.demo.client.application.animations;

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
import gwt.material.design.demo.client.application.animations.core.CoreAnimationsModule;
import gwt.material.design.demo.client.application.animations.meaningful.MeaningfulAnimationsModule;

/**
 * Created by Mark Kevin on 11/30/2015.
 */
public class AnimationsModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new CoreAnimationsModule());
        install(new MeaningfulAnimationsModule());
    }
}