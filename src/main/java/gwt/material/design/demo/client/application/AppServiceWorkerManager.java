package gwt.material.design.demo.client.application;

import gwt.material.design.client.pwa.serviceworker.DefaultServiceWorkerManager;
import gwt.material.design.client.ui.MaterialToast;

public class AppServiceWorkerManager extends DefaultServiceWorkerManager {

    public AppServiceWorkerManager(String resource) {
        super(resource);
    }

    @Override
    protected void onOnline() {
        super.onOnline();
        MaterialToast.fireToast("You are online");
    }

    @Override
    protected void onOffline() {
        super.onOffline();
        MaterialToast.fireToast("You are offline");
    }
}
