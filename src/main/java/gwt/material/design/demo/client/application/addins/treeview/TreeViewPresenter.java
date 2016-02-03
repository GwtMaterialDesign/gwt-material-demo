package gwt.material.design.demo.client.application.addins.treeview;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.demo.client.application.ApplicationPresenter;
import gwt.material.design.demo.client.event.SetPageTitleEvent;
import gwt.material.design.demo.client.place.NameTokens;

public class TreeViewPresenter extends Presenter<TreeViewPresenter.MyView, TreeViewPresenter.MyProxy> {
    interface MyView extends View {
    }

    @NameToken(NameTokens.tree)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<TreeViewPresenter> {
    }

    public static final NestedSlot SLOT_TIMEPICKERS = new NestedSlot();

    @Inject
    TreeViewPresenter(
        EventBus eventBus,
        MyView view,
        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MainContent);

    }

    @Override
    protected void onReveal() {
        super.onReveal();
        SetPageTitleEvent.fire("Material Tree", "MaterialTree is a component that wraps all the tree items that provide lists of event handlers like open/close and selection event.", this);
    }

}
