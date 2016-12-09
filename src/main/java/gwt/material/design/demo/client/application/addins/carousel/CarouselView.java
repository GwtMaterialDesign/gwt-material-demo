package gwt.material.design.demo.client.application.addins.carousel;

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
import gwt.material.design.addins.client.carousel.MaterialCarousel;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class CarouselView extends ViewImpl implements CarouselPresenter.MyView {
    interface Binder extends UiBinder<Widget, CarouselView> {
    }

    @UiField
    MaterialButton btnGetCurrentSlide, btnGoTo, btnNext, btnPrev, btnPause, btnPlay;

    @UiField
    MaterialCarousel carousel, onboard;

    @Inject
    CarouselView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        btnGetCurrentSlide.addClickHandler(e -> {
            MaterialToast.fireToast(carousel.getCurrentSlideIndex() + " Current Slide Index");
        });

        btnGoTo.addClickHandler(e -> carousel.goToSlide(1));

        btnNext.addClickHandler(e -> carousel.next());

        btnPrev.addClickHandler(e -> carousel.previous());

        btnPause.addClickHandler(e -> carousel.pause());

        btnPlay.addClickHandler(e -> carousel.play());
    }

}
