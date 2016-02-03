package gwt.material.design.demo.client.application.addins.treeview;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TreeViewModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TreeViewPresenter.class, TreeViewPresenter.MyView.class, TreeView.class, TreeViewPresenter.MyProxy.class);
    }
}
