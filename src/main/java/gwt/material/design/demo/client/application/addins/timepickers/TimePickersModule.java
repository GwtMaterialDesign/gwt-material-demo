package gwt.material.design.demo.client.application.addins.timepickers;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TimePickersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TimePickersPresenter.class, TimePickersPresenter.MyView.class, TimePickersView.class, TimePickersPresenter.MyProxy.class);
    }
}
