package gwt.material.design.demo.client.application.addins;

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


import com.google.gwt.inject.client.AbstractGinModule;
import gwt.material.design.demo.client.application.addins.autocomplete.AutoCompleteModule;
import gwt.material.design.demo.client.application.addins.avatar.AvatarModule;
import gwt.material.design.demo.client.application.addins.bubble.BubbleModule;
import gwt.material.design.demo.client.application.addins.camera.CameraModule;
import gwt.material.design.demo.client.application.addins.carousel.CarouselModule;
import gwt.material.design.demo.client.application.addins.circularprogress.CircularProgressModule;
import gwt.material.design.demo.client.application.addins.combobox.ComboBoxModule;
import gwt.material.design.demo.client.application.addins.countup.CountUpModule;
import gwt.material.design.demo.client.application.addins.cropper.ImageCropperModule;
import gwt.material.design.demo.client.application.addins.cutouts.CutOutsModule;
import gwt.material.design.demo.client.application.addins.dnd.DndModule;
import gwt.material.design.demo.client.application.addins.docviewer.DocViewerModule;
import gwt.material.design.demo.client.application.addins.emptystates.EmptyStatesModule;
import gwt.material.design.demo.client.application.addins.fileuploader.FileUploaderModule;
import gwt.material.design.demo.client.application.addins.iconmorph.IconMorphModule;
import gwt.material.design.demo.client.application.addins.inputmask.InputMaskModule;
import gwt.material.design.demo.client.application.addins.livestamp.LiveStampModule;
import gwt.material.design.demo.client.application.addins.masonry.MasonryModule;
import gwt.material.design.demo.client.application.addins.menubar.MenuBarModule;
import gwt.material.design.demo.client.application.addins.overlay.OverlayModule;
import gwt.material.design.demo.client.application.addins.pathanimator.PathAnimatorModule;
import gwt.material.design.demo.client.application.addins.rating.RatingModule;
import gwt.material.design.demo.client.application.addins.richeditor.RichEditorModule;
import gwt.material.design.demo.client.application.addins.scrollfire.ScrollFireModule;
import gwt.material.design.demo.client.application.addins.signature.SignaturePadModule;
import gwt.material.design.demo.client.application.addins.splitpanel.SplitPanelModule;
import gwt.material.design.demo.client.application.addins.steppers.SteppersModule;
import gwt.material.design.demo.client.application.addins.subheaders.SubHeadersModule;
import gwt.material.design.demo.client.application.addins.swipeable.SwipeableModule;
import gwt.material.design.demo.client.application.addins.timepickers.TimePickersModule;
import gwt.material.design.demo.client.application.addins.treeview.TreeViewModule;
import gwt.material.design.demo.client.application.addins.waterfall.WaterfallModule;
import gwt.material.design.demo.client.application.addins.webp.WebpImageModule;
import gwt.material.design.demo.client.application.addins.window.WindowModule;

/**
 * Created by Mark Kevin on 11/30/2015.
 */
public class AddinsModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new SubHeadersModule());
        install(new CutOutsModule());
        install(new TimePickersModule());
        install(new SteppersModule());
        install(new PathAnimatorModule());
        install(new IconMorphModule());
        install(new WaterfallModule());
        install(new ScrollFireModule());
        install(new AutoCompleteModule());
        install(new BubbleModule());
        install(new TreeViewModule());
        install(new WindowModule());
        install(new MenuBarModule());
        install(new DndModule());
        install(new SwipeableModule());
        install(new MasonryModule());
        install(new CameraModule());
        install(new DocViewerModule());
        install(new SplitPanelModule());
        install(new FileUploaderModule());
        install(new RichEditorModule());
        install(new AvatarModule());
        install(new RatingModule());
        install(new ComboBoxModule());
        install(new OverlayModule());
        install(new EmptyStatesModule());
        install(new CarouselModule());
        install(new CircularProgressModule());
        install(new CountUpModule());
        install(new LiveStampModule());
        install(new InputMaskModule());
        install(new ImageCropperModule());
        install(new SignaturePadModule());
        install(new WebpImageModule());
    }
}