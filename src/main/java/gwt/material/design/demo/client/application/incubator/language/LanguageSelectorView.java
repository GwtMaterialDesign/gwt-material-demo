package gwt.material.design.demo.client.application.incubator.language;

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


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.language.Language;
import gwt.material.design.incubator.client.language.LanguageSelector;

import java.util.ArrayList;
import java.util.List;

public class LanguageSelectorView extends ViewImpl implements LanguageSelectorPresenter.MyView {
    public interface Binder extends UiBinder<Widget, LanguageSelectorView> {
    }

    @UiField
    LanguageSelector languageSelector;

    static List<Language> getLanguages() {
        List<Language> languages = new ArrayList<>();
        Language en = new Language("English", "en", "//i.imgur.com/hh6QPCC.png");
        Language fr = new Language("French", "fr", "//i.imgur.com/r8JPSqC.png");
        Language da = new Language("Danish", "da", "//i.imgur.com/JDnEQy5.png");
        Language de = new Language("German", "de", "//i.imgur.com/QGcvgzR.png");
        languages.add(en);
        languages.add(fr);
        languages.add(da);
        languages.add(de);
        return languages;
    }

    @Inject
    LanguageSelectorView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        languageSelector.setLanguages(getLanguages());
    }

    @UiHandler("languageSelector")
    void selection(ValueChangeEvent<Language> e) {
        MaterialToast.fireToast("Selected " + e.getValue().getValue());
    }
}
