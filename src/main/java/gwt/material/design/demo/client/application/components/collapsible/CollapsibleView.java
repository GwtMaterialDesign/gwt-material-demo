package gwt.material.design.demo.client.application.components.collapsible;

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
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;

public class CollapsibleView extends ViewImpl implements CollapsiblePresenter.MyView {
    interface Binder extends UiBinder<Widget, CollapsibleView> {
    }

    @UiField
    MaterialCollapsible colaps, expandable;

    @UiField
    MaterialCollapsibleItem secondItem;

    @UiField
    MaterialCollapsibleItem item;

    @Inject
    CollapsibleView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        colaps.addCollapseHandler(event -> {
            MaterialToast.fireToast("CollapseEvent fired: " + getCollaseText(event.getTarget()));
        });

        expandable.addCollapseHandler(event -> {
            MaterialToast.fireToast("CollapseEvent fired: " + getCollaseText(event.getTarget()));
        });

        colaps.addExpandHandler(event -> {
            MaterialToast.fireToast("ExpandEvent fired: " + getCollaseText(event.getTarget()));
        });

        expandable.addExpandHandler(event -> {
            MaterialToast.fireToast("ExpandEvent fired: " + getCollaseText(event.getTarget()));
        });
    }

    protected String getCollaseText(MaterialCollapsibleItem target) {
        MaterialCollapsibleHeader header = target.getHeader();
        if (header.getChildren().size() != 0) {
            if (header.getChildren().get(0) instanceof MaterialLink) {
                return ((MaterialLink) header.getChildren().get(0)).getText();
            }
        }
        return "No text";
    }

    @UiHandler("expand")
    void expand(ClickEvent e) {
        secondItem.expand();
    }

    @UiHandler("setActive")
    void setActive(ClickEvent e) {
        item.setActive(true);
    }

    @UiHandler("setActiveExpandable")
    void setActiveExpandable(ClickEvent e) {
        expandable.setActive(1);
    }

    @UiHandler("open")
    void onOpen(ClickEvent e) {
        colaps.open(2);
    }

    @UiHandler("close")
    void onClose(ClickEvent e) {
        colaps.close(2);
    }
}
