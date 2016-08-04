package gwt.material.design.demo.client.ui.base;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.demo.client.application.dto.Links;

import java.util.List;

/**
 * Created by Mark Kevin on 8/4/2016.
 */
public interface HasScrollspy {

    public void buildScrollSpy(List<Links> links, MaterialWidget panel);

}
