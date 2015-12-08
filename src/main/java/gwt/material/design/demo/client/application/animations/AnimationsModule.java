package gwt.material.design.demo.client.application.animations;

import com.google.gwt.inject.client.AbstractGinModule;
import gwt.material.design.demo.client.application.animations.core.CoreAnimationsModule;
import gwt.material.design.demo.client.application.animations.meaningful.MeaningfulAnimationsModule;

/**
 * Created by Mark Kevin on 11/30/2015.
 */
public class AnimationsModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new CoreAnimationsModule());
        install(new MeaningfulAnimationsModule());
    }
}