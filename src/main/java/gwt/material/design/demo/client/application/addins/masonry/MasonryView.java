package gwt.material.design.demo.client.application.addins.masonry;

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


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.masonry.MaterialMasonry;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.addins.autocomplete.base.User;
import gwt.material.design.demo.client.application.addins.masonry.cards.UserCard;
import gwt.material.design.demo.client.application.dto.DataHelper;

import javax.inject.Inject;


public class MasonryView extends ViewImpl implements MasonryPresenter.MyView {
    interface Binder extends UiBinder<Widget, MasonryView> {
    }

    @UiField
    MaterialMasonry dynamicMasonry;

    @Inject
    MasonryView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        buildDynamicMasonry();
    }

    private void buildDynamicMasonry() {
        for (User user : DataHelper.getAllUsers()) {
            dynamicMasonry.add(new UserCard(user, dynamicMasonry));
        }
        dynamicMasonry.reload();
    }

    @UiHandler("btnAddItem")
    void onAddItem(ClickEvent e) {
        dynamicMasonry.add(new UserCard(DataHelper.getAllUsers().get(0), dynamicMasonry));
        MaterialToast.fireToast("Size: " + (dynamicMasonry.getChildrenList().size() - 1));
    }

    @UiHandler("btnClearAll")
    void clearAll(ClickEvent e) {
        dynamicMasonry.clear();
    }

    @UiHandler("btnInsertTo")
    void inserTo(ClickEvent e) {
        UserCard userCard = new UserCard(DataHelper.getAllUsers().get(0), dynamicMasonry);
        dynamicMasonry.insert(userCard, 2);
    }

    @UiHandler("btnRemoveLast")
    void removeLast(ClickEvent e) {
        if (dynamicMasonry.getChildren().size() > 0) {
            dynamicMasonry.remove(dynamicMasonry.getChildren().size() - 1);
        }
    }
}
