package gwt.material.design.demo.client.application.addins;

import com.google.gwt.inject.client.AbstractGinModule;
import gwt.material.design.demo.client.application.addins.autocomplete.AutoCompleteModule;
import gwt.material.design.demo.client.application.addins.bubble.BubbleModule;
import gwt.material.design.demo.client.application.addins.camera.CameraModule;
import gwt.material.design.demo.client.application.addins.cutouts.CutOutsModule;
import gwt.material.design.demo.client.application.addins.dnd.DndModule;
import gwt.material.design.demo.client.application.addins.iconmorph.IconMorphModule;
import gwt.material.design.demo.client.application.addins.masonry.MasonryModule;
import gwt.material.design.demo.client.application.addins.menubar.MenuBarModule;
import gwt.material.design.demo.client.application.addins.pathanimator.PathAnimatorModule;
import gwt.material.design.demo.client.application.addins.scrollfire.ScrollFireModule;
import gwt.material.design.demo.client.application.addins.steppers.SteppersModule;
import gwt.material.design.demo.client.application.addins.subheaders.SubHeadersModule;
import gwt.material.design.demo.client.application.addins.swipeable.SwipeableModule;
import gwt.material.design.demo.client.application.addins.timepickers.TimePickersModule;
import gwt.material.design.demo.client.application.addins.treeview.TreeViewModule;
import gwt.material.design.demo.client.application.addins.waterfall.WaterfallModule;
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
    }
}