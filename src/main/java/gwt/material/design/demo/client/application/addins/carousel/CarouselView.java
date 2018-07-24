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


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.carousel.MaterialCarousel;
import gwt.material.design.addins.client.carousel.js.JsCarouselOptions;
import gwt.material.design.client.ui.*;

import javax.inject.Inject;


public class CarouselView extends ViewImpl implements CarouselPresenter.MyView {

    interface Binder extends UiBinder<Widget, CarouselView> {
    }

    @UiField
    MaterialButton btnGetCurrentSlide, btnGoTo, btnNext, btnPrev, btnPause, btnPlay, btnAdd, btnRemove;

    @UiField
    MaterialCarousel singleItemCarousel, multipleItemCarousel, variableWidthCarousel, adaptiveHeightCarousel, autoplayCarousel,
            displayControlCarousel, imageTypeCarousel, fadeCarousel, methodsCarousel, carouselResponsiveCarousel, onboardCarousel, eventsCarousel, tabsCarousel, dynamicCarousel;

    @UiField
    MaterialTab tab;

    @UiField
    MaterialRow container;

    @Inject
    CarouselView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        btnGetCurrentSlide.addClickHandler(e -> {
            MaterialToast.fireToast(methodsCarousel.getCurrentSlideIndex() + " Current Slide Index");
        });

        btnGoTo.addClickHandler(e -> methodsCarousel.goToSlide(1));

        btnNext.addClickHandler(e -> methodsCarousel.next());

        btnPrev.addClickHandler(e -> methodsCarousel.previous());

        btnPause.addClickHandler(e -> methodsCarousel.pause());

        btnPlay.addClickHandler(e -> methodsCarousel.play());

        carouselResponsiveCarousel.setSlidesToShow(5);
        carouselResponsiveCarousel.setSlidesToScroll(5);

        // Tablet Settings
        JsCarouselOptions tabletSettings = JsCarouselOptions.create();
        tabletSettings.slidesToShow = 2;
        tabletSettings.slidesToScroll = 2;
        carouselResponsiveCarousel.setTabletSettings(tabletSettings);

        // Mobile Settings
        JsCarouselOptions mobileSettings = JsCarouselOptions.create();
        mobileSettings.slidesToShow = 1;
        mobileSettings.slidesToScroll = 1;
        carouselResponsiveCarousel.setMobileSettings(mobileSettings);

        /** EVENTS **/
        eventsCarousel.addAfterChangeHandler(e -> {
            MaterialToast.fireToast("AfterChangeEvent : " + e.getCurrentSlide() + " Current Slide");
        });

        eventsCarousel.addBeforeChangeHandler(e -> {
            MaterialToast.fireToast("BeforeChangeEvent : " + e.getCurrentSlide() + "Current Slide " + e.getNextSlide() + " Next Slide");
        });

        eventsCarousel.addInitHandler(e -> {
            MaterialToast.fireToast("InitEvent");
        });

        eventsCarousel.addDestroyHandler(e -> {
            MaterialToast.fireToast("DestroyEvent");
        });

        eventsCarousel.addSwipeHandler(e -> {
            MaterialToast.fireToast("SwipeEvent : " + e.getDirection() + " Direction");
        });

        tabsCarousel.setTabNavigation(tab);

        btnAdd.addClickHandler(e -> {
            MaterialImage img = new MaterialImage("//i.imgur.com/8XlWy0H.png");
            img.addClickHandler(e1 -> {
                MaterialToast.fireToast("Clicked on Image");
            });
            dynamicCarousel.add(img);
        });

        btnRemove.addClickHandler(e -> {
            dynamicCarousel.remove(1);
        });
    }

    @UiHandler("displayOnboard")
    void displayOnboard(ClickEvent e) {
        onboardCarousel.goToSlide(0);
        onboardCarousel.setVisible(true);
    }

    @UiHandler("hideOnboard")
    void hideOnboard(ClickEvent e) {
        onboardCarousel.setVisible(false);
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        methodsCarousel.removeFromParent();
        container.add(methodsCarousel);
    }

    @Override
    public void reloadCarousels() {
        singleItemCarousel.reload();
        multipleItemCarousel.reload();
        variableWidthCarousel.reload();
        adaptiveHeightCarousel.reload();
        autoplayCarousel.reload();
        displayControlCarousel.reload();
        imageTypeCarousel.reload();
        fadeCarousel.reload();
        methodsCarousel.reload();
        carouselResponsiveCarousel.reload();
        onboardCarousel.reload();
        eventsCarousel.reload();
        tabsCarousel.reload();
        dynamicCarousel.reload();

    }
}
