package gwt.material.design.demo.client.application.addins.fileuploader;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class FileUploaderModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(FileUploaderPresenter.class, FileUploaderPresenter.MyView.class, FileUploaderView.class, FileUploaderPresenter.MyProxy.class);
    }
}
