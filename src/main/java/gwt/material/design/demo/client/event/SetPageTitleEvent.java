package gwt.material.design.demo.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class SetPageTitleEvent extends GwtEvent<SetPageTitleEvent.SetPageTitleHandler> {

    public interface SetPageTitleHandler extends EventHandler {
        void onSetPageTitle(SetPageTitleEvent event);
    }

    public static final Type<SetPageTitleHandler> TYPE = new Type<>();

    private final String title;
    private final String description;

    public SetPageTitleEvent(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static void fire(String title, String description, HasHandlers source) {
        source.fireEvent(new SetPageTitleEvent(title, description));
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Type<SetPageTitleHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(SetPageTitleHandler handler) {
        handler.onSetPageTitle(this);
    }
}