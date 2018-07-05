package gwt.material.design.demo.client.application.addins.circularprogress;

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
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.circularprogress.MaterialCircularProgress;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;

public class CircularProgressView extends ViewImpl implements CircularProgressPresenter.MyView {
    interface Binder extends UiBinder<Widget, CircularProgressView> {
    }

    @UiField
    MaterialCircularProgress circLabel, circLabel2, circLabel3, circContinuos, circStartAngle, circStartAngle2, circEvents, circValues, circResponsive;

    private int i = 1;

    @Inject
    CircularProgressView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        buildCircularDynamic(circLabel);
        buildCircularDynamic(circLabel2);
        buildCircularDynamic(circLabel3);
        buildCircularDynamic(circResponsive);

        circStartAngle.setStartAngle(Math.PI / 2);
        circStartAngle2.setStartAngle(Math.PI / 2);

        circEvents.addStartHandler(event -> MaterialToast.fireToast("Started"));
        circEvents.addCompleteHandler(event -> MaterialToast.fireToast("Completed"));
        buildCircularDynamic(circEvents);


        buildCircularContinuos();
    }

    protected void buildCircularContinuos() {
        Timer timer = new Timer() {
            @Override
            public void run() {
                double total = (i * 100) / 5;
                circContinuos.setValue(total / 100, true);
                if (i >= 5) {
                    MaterialToast.fireToast("Finished");
                    cancel();
                }
                i++;
            }
        };
        timer.scheduleRepeating(1000);
    }

    protected void buildCircularDynamic(MaterialCircularProgress progress) {
        progress.addProgressHandler(event -> {
            int percent = (int) (event.getProgress() * 100.0);
            progress.setText(percent + "%");
        });
    }

    @UiHandler("btnSet50")
    void onSet50(ClickEvent e) {
        circValues.setValue(0.5);
    }

    @UiHandler("btnGetValue")
    void onGetValue(ClickEvent e) {
        MaterialToast.fireToast("Value: " + circValues.getValue());
    }
}
