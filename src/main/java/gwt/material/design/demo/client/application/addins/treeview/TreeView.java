package gwt.material.design.demo.client.application.addins.treeview;

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
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.overlay.MaterialOverlay;
import gwt.material.design.addins.client.pathanimator.MaterialPathAnimator;
import gwt.material.design.addins.client.tree.MaterialTree;
import gwt.material.design.addins.client.tree.MaterialTreeItem;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.ThemeManager;

import javax.inject.Inject;


public class TreeView extends ViewImpl implements TreeViewPresenter.MyView {
    interface Binder extends UiBinder<Widget, TreeView> {
    }

    @UiField
    MaterialTree docTree;

    @UiField
    MaterialOverlay addOverlay;

    @UiField
    MaterialTextBox txtName;

    @UiField
    MaterialIcon btnAdd, btnDelete;

    @UiField
    MaterialPanel titlePanel;

    @Inject
    TreeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        ThemeManager.register(titlePanel);
        docTree.addCloseHandler(new CloseHandler<MaterialTreeItem>() {
            @Override
            public void onClose(CloseEvent<MaterialTreeItem> event) {
                MaterialToast.fireToast("Closed : " + event.getTarget().getText());
            }
        });

        docTree.addOpenHandler(new OpenHandler<MaterialTreeItem>() {
            @Override
            public void onOpen(OpenEvent<MaterialTreeItem> event) {
                MaterialToast.fireToast("Opened : " + event.getTarget().getText());
            }
        });

        docTree.addSelectionHandler(new SelectionHandler<MaterialTreeItem>() {
            @Override
            public void onSelection(SelectionEvent<MaterialTreeItem> event) {
                btnAdd.setVisible(true);
                btnDelete.setVisible(true);
                MaterialToast.fireToast("Selected : " + event.getSelectedItem().getText());
            }
        });
    }

    @UiHandler("btnCollapse")
    void onCollapseTree(ClickEvent e) {
        docTree.collapse();
    }

    @UiHandler("btnExpand")
    void onExpandTree(ClickEvent e) {
        docTree.expand();
    }

    @UiHandler("btnAdd")
    void onAddDialog(ClickEvent e) {
        MaterialPathAnimator.animate(btnAdd.getElement(), addOverlay.getElement());
    }

    @UiHandler("btnDelete")
    void onDeleteDialog(ClickEvent e) {
        docTree.getSelectedItem().removeFromTree();
        MaterialPathAnimator.reverseAnimate(btnAdd.getElement(), addOverlay.getElement());
    }

    @UiHandler("btnDeselectItem")
    void onDeselectItem(ClickEvent e) {
        if (docTree.getSelectedItem() == null) {
            MaterialToast.fireToast("You must select an item first.");
        } else {
            MaterialToast.fireToast("Item " + docTree.getSelectedItem().getText() + " was deselected.");
            docTree.deselectSelectedItem();
        }
    }

    @UiHandler("btnFinish")
    void onFinishDialog(ClickEvent e) {
        MaterialTreeItem item = new MaterialTreeItem();
        item.setText(txtName.getText());
        item.setIconType(IconType.FOLDER);
        item.setIconColor(Color.BLUE);
        docTree.getSelectedItem().addItem(item);
        MaterialPathAnimator.reverseAnimate(btnAdd.getElement(), addOverlay.getElement());
    }

    @UiHandler("btnCancel")
    void onCancelDialog(ClickEvent e) {
        MaterialPathAnimator.reverseAnimate(btnAdd.getElement(), addOverlay.getElement());
    }
}
