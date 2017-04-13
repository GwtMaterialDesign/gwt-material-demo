package gwt.material.design.demo.client.event;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


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
    private final String link;
    private final String specification;

    public SetPageTitleEvent(String title, String description, String link, String specification) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.specification = specification;
    }

    public static void fire(String title, String description, String link, String specification, HasHandlers source) {
        source.fireEvent(new SetPageTitleEvent(title, description, link, specification));
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getSpecification() {
        return specification;
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