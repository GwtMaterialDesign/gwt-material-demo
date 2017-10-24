package gwt.material.design.demo.client.application.components.forms;

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
import gwt.material.design.demo.client.application.components.forms.checkbox.CheckBoxModule;
import gwt.material.design.demo.client.application.components.forms.listbox.ListBoxModule;
import gwt.material.design.demo.client.application.components.forms.radiobutton.RadioButtonModule;
import gwt.material.design.demo.client.application.components.forms.range.RangeModule;
import gwt.material.design.demo.client.application.components.forms.switches.SwitchModule;
import gwt.material.design.demo.client.application.components.forms.textfields.TextFieldModule;

public class FormsModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new TextFieldModule());
        install(new ListBoxModule());
        install(new RadioButtonModule());
        install(new CheckBoxModule());
        install(new SwitchModule());
        install(new RangeModule());
    }
}
