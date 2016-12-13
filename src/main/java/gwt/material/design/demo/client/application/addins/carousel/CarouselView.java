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
import gwt.material.design.addins.client.carousel.js.JsCarouselOptions;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTab;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class CarouselView extends ViewImpl implements CarouselPresenter.MyView {
    interface Binder extends UiBinder<Widget, CarouselView> {
    }

    @UiField
    MaterialButton btnGetCurrentSlide, btnGoTo, btnNext, btnPrev, btnPause, btnPlay, btnAdd, btnRemove;

    @UiField
    MaterialCarousel carousel,  carouselResponsive, onboard, carouselEvents, tabCarousel, carouselDynamic;

    @UiField
    MaterialTab tab;

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

        carouselResponsive.setSlidesToShow(5);
        carouselResponsive.setSlidesToScroll(5);

        // Tablet Settings
        JsCarouselOptions tabletSettings = new JsCarouselOptions();
        tabletSettings.slidesToShow = 2;
        tabletSettings.slidesToScroll = 2;
        carouselResponsive.setTabletSettings(tabletSettings);

        // Mobile Settings
        JsCarouselOptions mobileSettings = new JsCarouselOptions();
        mobileSettings.slidesToShow = 1;
        mobileSettings.slidesToScroll = 1;
        carouselResponsive.setMobileSettings(mobileSettings);

        /** EVENTS **/
        carouselEvents.addAfterChangeHandler(e -> {
            MaterialToast.fireToast("AfterChangeEvent : " + e.getCurrentSlide() + " Current Slide");
        });

        carouselEvents.addBeforeChangeHandler(e -> {
            MaterialToast.fireToast("BeforeChangeEvent : " + e.getCurrentSlide() + "Current Slide " + e.getNextSlide() + " Next Slide") ;
        });

        carouselEvents.addInitHandler(e -> {
            MaterialToast.fireToast("InitEvent");
        });

        carouselEvents.addDestroyHandler(e -> {
            MaterialToast.fireToast("DestroyEvent");
        });

        carouselEvents.addSwipeHandler(e -> {
            MaterialToast.fireToast("SwipeEvent : " + e.getDirection() + " Direction");
        });

        tabCarousel.setTabNavigation(tab);

        btnAdd.addClickHandler(e -> {
            MaterialImage img = new MaterialImage("//i.imgur.com/8XlWy0H.png");
            img.addClickHandler(e1 -> {
                MaterialToast.fireToast("Clicked on Image");
            });
            carouselDynamic.add(img);
        });

        btnRemove.addClickHandler(e -> {
            carouselDynamic.remove(1);
        });
    }

}
