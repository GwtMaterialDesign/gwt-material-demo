package gwt.material.design.demo.client.gin;

import com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import gwt.material.design.demo.client.application.ApplicationModule;
import gwt.material.design.demo.client.place.NameTokens;

/**
 * See more on setting up the PlaceManager on <a
 * href="// See more on: https://github.com/ArcBees/GWTP/wiki/PlaceManager">DefaultModule's > DefaultPlaceManager</a>
 */
public class ClientModule extends AbstractPresenterModule
{
    @Override
    protected void configure()
    {
        install(new DefaultModule());
        install(new RpcDispatchAsyncModule.Builder().build());
        install(new ApplicationModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.about);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.about);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.about);
    }
}
