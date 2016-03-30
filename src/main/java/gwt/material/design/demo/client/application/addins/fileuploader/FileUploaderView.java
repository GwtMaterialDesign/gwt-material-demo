package gwt.material.design.demo.client.application.addins.fileuploader;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.base.UploadFile;
import gwt.material.design.addins.client.events.*;
import gwt.material.design.addins.client.ui.MaterialFileUploader;
import gwt.material.design.client.ui.MaterialToast;

import javax.inject.Inject;


public class FileUploaderView extends ViewImpl implements FileUploaderPresenter.MyView {
    interface Binder extends UiBinder<Widget, FileUploaderView> {
    }

    @UiField
    MaterialFileUploader uploader;

    @Inject
    FileUploaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        uploader.addDropHandler(new DropEvent.DropHandler() {
            @Override
            public void onDrop(DropEvent event) {
                MaterialToast.fireToast("Event : Drop");
            }
        });

        uploader.addDragStartHandler(new DragStartEvent.DragStartHandler() {
            @Override
            public void onDragStart(DragStartEvent event) {
                MaterialToast.fireToast("Event : Drag Start");
            }
        });

        uploader.addDragEndHandler(new DragEndEvent.DragEndHandler() {
            @Override
            public void onDragEnd(DragEndEvent event) {
                MaterialToast.fireToast("Event : Drag End");
            }
        });

        uploader.addDragEnterHandler(new DragEnterEvent.DragEnterHandler() {
            @Override
            public void onDragEnter(DragEnterEvent event) {
                MaterialToast.fireToast("Event : Drag Enter");
            }
        });

        uploader.addDragOverHandler(new DragOverEvent.DragOverHandler() {
            @Override
            public void onDragOver(DragOverEvent event) {
                MaterialToast.fireToast("Event : Drag Over");
            }
        });

        uploader.addDragLeaveHandler(new DragLeaveEvent.DragLeaveHandler() {
            @Override
            public void onDragLeave(DragLeaveEvent event) {
                MaterialToast.fireToast("Event : Drag Leave");
            }
        });

        uploader.addAddedFileHandler(new AddedFileEvent.AddedFileHandler<UploadFile>() {
            @Override
            public void onAddedFile(AddedFileEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Added File (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addRemovedFileHandler(new RemovedFileEvent.RemovedFileHandler<UploadFile>() {
            @Override
            public void onRemovedFile(RemovedFileEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Removed File (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addErrorHandler(new ErrorEvent.ErrorHandler<UploadFile>() {
            @Override
            public void onError(ErrorEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Error (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addSendingHandler(new SendingEvent.SendingHandler<UploadFile>() {
            @Override
            public void onSending(SendingEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Sending (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addSuccessHandler(new SuccessEvent.SuccessHandler<UploadFile>() {
            @Override
            public void onSuccess(SuccessEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Success (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addCompleteHandler(new CompleteEvent.CompleteHandler<UploadFile>() {
            @Override
            public void onComplete(CompleteEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Complete (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addCancelHandler(new CanceledEvent.CanceledHandler<UploadFile>() {
            @Override
            public void onCanceled(CanceledEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Cancel (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addMaxFilesExceededHandler(new MaxFilesExceededEvent.MaxFilesExceededHandler<UploadFile>() {
            @Override
            public void onMaxFilesExceeded(MaxFilesExceededEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Max Files Exceeded (" + event.getTarget().getName() + ")");
            }
        });

        uploader.addMaxFilesReachHandler(new MaxFilesReachedEvent.MaxFilesReachedHandler<UploadFile>() {
            @Override
            public void onMaxFilesReached(MaxFilesReachedEvent<UploadFile> event) {
                MaterialToast.fireToast("Event : Max Files Reached (" + event.getTarget().getName() + ")");
            }
        });
    }
}
