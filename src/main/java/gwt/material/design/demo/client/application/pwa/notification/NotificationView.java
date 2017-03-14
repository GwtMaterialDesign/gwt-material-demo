package gwt.material.design.demo.client.application.pwa.notification;

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
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.pwa.pushnotifications.PushNotification;
import gwt.material.design.client.pwa.pushnotifications.PushNotificationOptions;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class NotificationView extends ViewImpl implements NotificationPresenter.MyView {
    interface Binder extends UiBinder<Widget, NotificationView> {
    }

    @Inject
    NotificationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btnNotify")
    void onNotify(ClickEvent e) {
        PushNotification.create("Gwt Material Design");
    }

    @UiHandler("btnNotifyOptions")
    void onNotifyOptions(ClickEvent e) {
        PushNotificationOptions options = new PushNotificationOptions();
        options.body = "I love GWT Material";
        options.icon = "https://i.imgur.com/VaBxpGj.png";
        options.link = "https://gwtmaterialdesign.github.io/gwt-material-demo";
        options.timeout = 4000;
        PushNotification.create("Gwt Material Design", options);
    }

    @UiHandler("btnNotifyCallbacks")
    void onNotifyCallbacks(ClickEvent e) {
        PushNotificationOptions options = new PushNotificationOptions();
        options.body = "I love GWT Material";
        options.icon = "https://i.imgur.com/VaBxpGj.png";
        options.link = "https://gwtmaterialdesign.github.io/gwt-material-demo";
        options.timeout = 4000;
        options.onClick = () -> {
            MaterialToast.fireToast("Clicked");
        };
        options.onClose = () -> {
            MaterialToast.fireToast("Closed");
        };
        options.onError = () -> {
            MaterialToast.fireToast("Errored");
        };
        options.onShow = () -> {
            MaterialToast.fireToast("Showed");
        };
        PushNotification.create("Gwt Material Design", options);
    }

    @UiHandler("btnNotifyInteraction")
    void onNotifyInteraction(ClickEvent e) {
        PushNotificationOptions options = new PushNotificationOptions();
        options.body = "I love GWT Material";
        options.icon = "https://i.imgur.com/VaBxpGj.png";
        options.link = "https://gwtmaterialdesign.github.io/gwt-material-demo";
        options.timeout = 4000;
        options.requireInteraction = true;
        PushNotification.create("Gwt Material Design", options);
    }

    @UiHandler("btnCount")
    void onCountNofications(ClickEvent e) {
        MaterialToast.fireToast(PushNotification.count() + " notification(s) opened");
    }

    @UiHandler("btnShow")
    void onShow(ClickEvent e) {
        PushNotification.create("Gwt Material Design");
    }

    @UiHandler("btnClear")
    void onClose(ClickEvent e) {
        PushNotification.clear();
    }
}
