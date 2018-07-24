package gwt.material.design.demo.client.application.addins.richeditor;

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


import com.google.gwt.event.dom.client.*;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.richeditor.MaterialRichEditor;
import gwt.material.design.addins.client.richeditor.base.constants.ToolbarButton;
import gwt.material.design.addins.client.richeditor.events.PasteEvent;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.dto.DataHelper;


public class RichEditorView extends ViewImpl implements RichEditorPresenter.MyView {
    interface Binder extends UiBinder<Widget, RichEditorView> {
    }

    @UiField
    MaterialRichEditor richEditor, airmodeRichEditor, optionRichEditor, clearRichEditor, eventRichEditor;

    @UiField
    MaterialDialog dialog;

    @UiField
    MaterialTextBox txtHTML;

    @Inject
    RichEditorView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        richEditor.setHTML(DataHelper.getRichEditorHTML());
        airmodeRichEditor.setHTML(DataHelper.getRichEditorHTML());
        optionRichEditor.setStyleOptions(ToolbarButton.STYLE, ToolbarButton.BOLD, ToolbarButton.ITALIC);
        optionRichEditor.setParaOptions(ToolbarButton.LEFT, ToolbarButton.RIGHT, ToolbarButton.JUSTIFY);
        optionRichEditor.setMiscOptions(ToolbarButton.CODE_VIEW, ToolbarButton.FULLSCREEN);
        // Without undo options
        optionRichEditor.setUndoOptions();
        optionRichEditor.setHTML("<div style=\"text-align: left;\"> <span style=\"font-size: 37px; font-weight: bold;\"> Options </span> </div> <div style=\"text-align: left;\"> <ul> <li> <span style=\"line-height: 1.5;\"> optionRichEditor.setStyleOptions(ToolbarButton. <span style=\"font-weight: bold;\"> STYLE </span> , ToolbarButton. <span style=\"font-weight: bold;\"> BOLD </span> , ToolbarButton. <span style=\"font-weight: bold;\"> ITALIC </span> ); </span> <br> </li> <li> optionRichEditor.setParaOptions(ToolbarButton. <span style=\"font-weight: bold;\"> LEFT </span> ,&nbsp;ToolbarButton. <span style=\"font-weight: bold;\"> RIGHT </span> , ToolbarButton. <span style=\"font-weight: bold;\"> JUSTIFY </span> ); </li> <li> optionRichEditor.setMiscOptions(ToolbarButton. <span style=\"font-weight: bold;\"> CODE_VIEW </span> , ToolbarButton. <span style=\"font-weight: bold;\"> FULLSCREEN </span> ); </li> <li> optionRichEditor.setUndoOptions(); </li> </ul> </div>");
        clearRichEditor.setHTML("<h2>I Love </h2>");
    }

    @UiHandler("closeDialog")
    void closeDialog(ClickEvent e) {
        dialog.close();
    }

    @UiHandler("openDialog")
    void openDialog(ClickEvent e) {
        dialog.open();
    }

    @UiHandler("btnClear")
    void onClear(ClickEvent e) {
        clearRichEditor.clear();
    }

    @UiHandler("btnInsertText")
    void onInsertText(ClickEvent e) {
        clearRichEditor.insertText("Material Design");
    }

    @UiHandler("getValue")
    void onGetValue(ClickEvent e) {
        String value = clearRichEditor.getValue();
        if (value.isEmpty()) {
            value = "Empty";
        }
        MaterialToast.fireToast(value);
    }

    @UiHandler("btnSetHTML")
    void onSetHTML(ClickEvent e) {
        richEditor.setHTML(txtHTML.getText());
    }

    @UiHandler("btnGetHTML")
    void onGetHTML(ClickEvent e) {
        MaterialToast.fireToast(richEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onValueChange(ValueChangeEvent<String> e) {
        MaterialToast.fireToast("Value Change Event : " + eventRichEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onFocus(FocusEvent e) {
        MaterialToast.fireToast("Focus Event : " + eventRichEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onBlur(BlurEvent event) {
        MaterialToast.fireToast("Blur Event : " + eventRichEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onKeyUp(KeyUpEvent e) {
        MaterialToast.fireToast("Key Up : " + eventRichEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onKeyDown(KeyDownEvent e) {
        MaterialToast.fireToast("Key Down : " + eventRichEditor.getHTML());
    }

    @UiHandler("eventRichEditor")
    void onPaste(PasteEvent e) {
        MaterialToast.fireToast("Paste : " + eventRichEditor.getHTML());
    }
}
