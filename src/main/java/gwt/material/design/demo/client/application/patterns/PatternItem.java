package gwt.material.design.demo.client.application.patterns;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTitle;

/**
 * Created by kevzl on 4/13/2017.
 */
public class PatternItem extends MaterialRow {

    private MaterialTitle title = new MaterialTitle("Some Title", "Description");
    private MaterialImage image = new MaterialImage("");
    private MaterialAnchorButton resizer = new MaterialAnchorButton("Resizer");
    private MaterialAnchorButton demo = new MaterialAnchorButton("Demo");

    public PatternItem(PatternDto dto) {
        super();
        build();
        setPatternItem(dto);
    }

    @Override
    protected void build() {
        super.build();
        add(title);
        add(resizer);
        add(demo);
        add(image);
        addStyleName("code");
    }

    public void setPatternItem(PatternDto dto) {
        title.setTitle(dto.getTitle());
        title.setDescription(dto.getDescription());
        image.setUrl(dto.getUrl());
        resizer.setHref(dto.getResizer());
        resizer.setBackgroundColor(Color.WHITE);
        resizer.setTextColor(Color.BLACK);
        resizer.setMarginRight(20);
        resizer.setTarget("_blank");
        demo.setHref(dto.getDemo());
        demo.setTarget("_blank");
    }

}
