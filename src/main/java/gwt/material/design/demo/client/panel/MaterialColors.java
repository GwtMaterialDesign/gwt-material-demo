package gwt.material.design.demo.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialColors extends Composite {

  private static MaterialColorsUiBinder uiBinder = GWT.create(MaterialColorsUiBinder.class);

  interface MaterialColorsUiBinder extends UiBinder<Widget, MaterialColors> {
  }

  public MaterialColors() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}
