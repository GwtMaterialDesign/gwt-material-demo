package gwt.material.design.demo.client.ui;

import com.google.gwt.dom.client.Document;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLink;

public class ExternalLibrary extends MaterialWidget {

    private MaterialAnchorButton externalLink = new MaterialAnchorButton();

    public ExternalLibrary() {
        super(Document.get().createDivElement(), "external-library");
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        externalLink.setIconType(IconType.LANGUAGE);
        add(externalLink);
    }

    public void setText(String text) {
        externalLink.setText(text);
    }

    public void setLink(String link) {
        externalLink.setHref(link);
        externalLink.setTarget("_blank");
    }
}
