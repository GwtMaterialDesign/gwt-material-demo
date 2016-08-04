package gwt.material.design.demo.client.ui;

import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.addins.client.scrollfire.MaterialScrollfire;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.HideOn;
import gwt.material.design.client.ui.*;
import gwt.material.design.demo.client.application.dto.Links;
import gwt.material.design.demo.client.ui.base.HasScrollspy;

import java.util.List;

import static gwt.material.design.jquery.client.api.JQuery.$;

/**
 * Created by Mark Kevin on 8/4/2016.
 */
public class NavigatedView extends ViewImpl implements HasScrollspy {

    MaterialScrollspy scrollspy = new MaterialScrollspy();
    MaterialWidget panel;

    @Override
    public void buildScrollSpy(List<Links> links, MaterialWidget panel) {
        this.panel = panel;
        for(Links link : links) {
            MaterialLink spy = new MaterialLink();
            spy.setText(link.getTitle());
            spy.setHref(link.getLink());
            scrollspy.add(spy);
        }
        scrollspy.setHideOn(HideOn.HIDE_ON_MED_DOWN);
        scrollspy.setTop(0);
        panel.add(scrollspy);
    }

    @Override
    protected void onAttach() {
        super.onAttach();
        MaterialPushpin.apply(scrollspy, scrollspy.getOffsetHeight() + 64, (int) Float.parseFloat(String.valueOf($("footer").offset().top)) - panel.getOffsetHeight(), 372);
    }
}
