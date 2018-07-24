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
import gwt.material.design.client.pwa.PwaManager;
import gwt.material.design.client.pwa.push.js.Notification;
import gwt.material.design.client.pwa.push.js.NotificationOptions;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class NotificationView extends ViewImpl implements NotificationPresenter.MyView {
    interface Binder extends UiBinder<Widget, NotificationView> {
    }

    @Inject
    NotificationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("requestPermission")
    void requestPermission(ClickEvent e) {
        if (isSupported()) {
            Notification.requestPermission(status -> MaterialToast.fireToast("Status: " + status));
        }
    }

    @UiHandler("notify")
    void notify(ClickEvent e) {
        if (isSupported()) {
            if (Notification.getPermission().equals("granted")) {
                NotificationOptions options = new NotificationOptions();
                options.body = "I love GMD";
                options.icon = "https://user.oc-static.com/upload/2017/05/03/14938342186053_01-duration-and-easing.png";
                // Will show the Notification provided by NotificationOptions
                Notification notification = new Notification("GMD Says", options);
                // Listen to any Notification events
                notification.setOnclick(param1 -> MaterialToast.fireToast("Clicked"));
                notification.setOnclose(param1 -> MaterialToast.fireToast("Closed"));
                notification.setOnerror(param1 -> MaterialToast.fireToast("Error"));
                notification.setOnshow(param1 -> MaterialToast.fireToast("Shown"));
            } else {
                MaterialToast.fireToast("Permission Denied. Update it thru the browser setting");
            }
        }
    }

    protected boolean isSupported() {
        boolean supported = PwaManager.isPwaSupported();
        if (!supported) {
            MaterialToast.fireToast("Push Notification is not supported");
        }
        return supported;
    }
}
