package gwt.material.design.demo.client.application.addins.autocomplete;

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
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.demo.client.application.addins.autocomplete.base.User;
import gwt.material.design.demo.client.application.addins.autocomplete.base.UserOracle;
import gwt.material.design.demo.client.application.addins.autocomplete.base.UserSuggestion;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class AutoCompleteView extends ViewImpl implements AutoCompletePresenter.MyView {
    interface Binder extends UiBinder<Widget, AutoCompleteView> {
    }

    @UiField
    MaterialAutoComplete acList, acListType, acListLimit, acModal;

    @UiField
    MaterialModal modal;

    @Inject
    AutoCompleteView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        UserOracle oracle = new UserOracle();
        oracle.addContacts(getAllUsers());
        acList.setSuggestions(oracle);
        acList.addSelectionHandler(new SelectionHandler<SuggestOracle.Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<SuggestOracle.Suggestion> event) {
                MaterialToast.fireToast(event.getSelectedItem().getDisplayString() + " Selected");
            }
        });
        acList.addValueChangeHandler(new ValueChangeHandler<List<? extends SuggestOracle.Suggestion>>() {
            @Override
            public void onValueChange(ValueChangeEvent<List<? extends SuggestOracle.Suggestion>> event) {
                for(SuggestOracle.Suggestion user : event.getValue()){
                    MaterialToast.fireToast("Value : " + user.getDisplayString());
                }
            }
        });
        acListType.setSuggestions(oracle);
        acListLimit.setSuggestions(oracle);
        acModal.setSuggestions(oracle);
    }


    @UiHandler("btnClear")
    void onClear(ClickEvent e) {
        acList.clear();
    }

    @UiHandler("btnGetAll")
    void onGetAll(ClickEvent e) {
        for(User user : getSelectedUsers()){
            MaterialToast.fireToast(user.getName());
        }
    }

    public List<User> getSelectedUsers() {
        List<? extends SuggestOracle.Suggestion> values = acList.getValue();
        List<User> users = new ArrayList<>(values.size());
        for(SuggestOracle.Suggestion value : values){
            if(value instanceof UserSuggestion){
                UserSuggestion us = (UserSuggestion) value;
                User user = us.getUser();
                users.add(user);
            }
        }
        return users;
    }

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg", User.Position.DEVELOPER, true, "Luis Hoppe", "luis@mail.com", "123123123", "718-555-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/yassiryahya/128.jpg", User.Position.DEVELOPER, true, "Irwin Mueller", "irwin@mail.com", "123123123", "718-432-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/lebinoclard/128.jpg", User.Position.DEVELOPER, true, "Levin Card", "levin@mail.com", "123123123", "432-555-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/lmjabreu/128.jpg", User.Position.DEVELOPER, false, "Dr. Cassie Keeling", "cassie@mail.com", "123123123", "432-555-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/ariil/128.jpg", User.Position.DEVELOPER, false, "Dr. Madelynn Schamberger", "madelyn@mail.com", "123123123", "543-555-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/devankoshal/128.jpg", User.Position.MARKETING, false, "Dominique Schmidt", "dom@mail.com", "123123123", "718-657-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/karthipanraj/128.jpg", User.Position.CTO, false, "Rowland Heller", "rowland@mail.com", "123123123", "718-765-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/GavicoInd/128.jpg", User.Position.CEO, false, "Quincy Schimmel", "quincy@mail.com", "123123123", "46-555-876", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/roybarberuk/128.jpg", User.Position.MARKETING, false, "Tierra VonRueden", "tierra@mail.com", "123123123", "654-56-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/kimcool/128.jpg", User.Position.MARKETING, false, "Travis Larson", "travis@mail.com", "123123123", "465-456-7654", "Makati City, Philippines", "Gwt Material"));
        list.add(new User("https://s3.amazonaws.com/uifaces/faces/twitter/tonymillion/128.jpg", User.Position.MARKETING, false, "Clint Heller", "clint@mail.com", "123123123", "645-555-65", "Makati City, Philippines", "Gwt Material"));
        return list;
    }

    @UiHandler("btnOpenModal")
    void onOpenModal(ClickEvent e) {
        modal.openModal();
    }

    @UiHandler("btnClose")
    void onClose(ClickEvent e) {
        modal.closeModal();
    }
}
