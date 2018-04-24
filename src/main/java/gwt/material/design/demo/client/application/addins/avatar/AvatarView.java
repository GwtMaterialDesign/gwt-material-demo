package gwt.material.design.demo.client.application.addins.avatar;

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
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.avatar.MaterialAvatar;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialTextBox;

import javax.inject.Inject;


public class AvatarView extends ViewImpl implements AvatarPresenter.MyView {
    interface Binder extends UiBinder<Widget, AvatarView> {
    }

    public static class AvatarDimension {
        private int width;
        private int height;

        public AvatarDimension(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getWidth() {
            return width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }
    }

    @UiField
    MaterialTextBox txtAvatarName;

    @UiField
    MaterialComboBox<AvatarDimension> dimensions;

    @UiField
    MaterialAvatar avatar;

    @UiField
    MaterialCheckBox autoReload;

    @Inject
    AvatarView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        dimensions.addItem("50 x 50 px", new AvatarDimension(100, 100));
        dimensions.addItem("100 x 100 px", new AvatarDimension(200, 200));
        dimensions.addItem("150 x 150 px", new AvatarDimension(300, 300));
        dimensions.addItem("200 x 200 px", new AvatarDimension(400, 400));

        dimensions.addValueChangeHandler(valueChangeEvent -> {
            AvatarDimension dimension = valueChangeEvent.getValue().get(0);
            avatar.setDimension(dimension.getWidth(), dimension.getHeight());
        });
    }

    @UiHandler("txtAvatarName")
    void onUpdateAvatar(KeyUpEvent e) {
        avatar.setValue(txtAvatarName.getText(), false, autoReload.getValue());
    }

    @UiHandler("reload")
    void onReload(ClickEvent e) {
        avatar.reload();
    }
}
