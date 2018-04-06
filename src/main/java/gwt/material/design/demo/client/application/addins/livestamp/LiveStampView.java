package gwt.material.design.demo.client.application.addins.livestamp;

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


import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.livestamp.MaterialLiveStamp;

import javax.inject.Inject;
import java.util.Date;


public class LiveStampView extends ViewImpl implements LiveStampPresenter.MyView {
    interface Binder extends UiBinder<Widget, LiveStampView> {
    }

    @UiField
    MaterialLiveStamp liveStampPast, liveStampFuture;

    @Inject
    LiveStampView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        //liveStampPast.setDate(new Date(115, 2, 1));
       // liveStampFuture.setDate(new Date(125, 2, 1));
    }
}
