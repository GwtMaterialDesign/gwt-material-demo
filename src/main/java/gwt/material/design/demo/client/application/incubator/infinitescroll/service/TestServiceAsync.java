package gwt.material.design.demo.client.application.incubator.infinitescroll.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import gwt.material.design.demo.client.application.datatable.table.People;

public interface TestServiceAsync {
    void getPeople(int startIndex, int viewSize, AsyncCallback<People> async);
}