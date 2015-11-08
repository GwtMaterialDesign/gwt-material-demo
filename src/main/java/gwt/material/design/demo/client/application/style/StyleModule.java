package gwt.material.design.demo.client.application.style;

import com.google.gwt.inject.client.AbstractGinModule;
import gwt.material.design.demo.client.application.style.colors.ColorsModule;
import gwt.material.design.demo.client.application.style.grid.GridModule;
import gwt.material.design.demo.client.application.style.helper.HelperModule;
import gwt.material.design.demo.client.application.style.icons.IconsModule;
import gwt.material.design.demo.client.application.style.shadow.ShadowModule;
import gwt.material.design.demo.client.application.style.themes.ThemesModule;

public class StyleModule extends AbstractGinModule {

    @Override
    protected void configure() {
        install(new ColorsModule());
        install(new GridModule());
        install(new HelperModule());
        install(new IconsModule());
        install(new ShadowModule());
        install(new ThemesModule());
    }
}
