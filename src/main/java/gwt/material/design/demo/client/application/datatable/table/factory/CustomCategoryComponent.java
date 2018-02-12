package gwt.material.design.demo.client.application.datatable.table.factory;

import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.ui.MaterialBadge;
import gwt.material.design.client.ui.table.TableHeader;
import gwt.material.design.client.ui.table.TableSubHeader;

public class CustomCategoryComponent extends CategoryComponent {

    public CustomCategoryComponent(String name) {
        super(name);
    }

    public CustomCategoryComponent(String name, boolean openByDefault) {
        super(name, true);
    }

    @Override
    protected void render(TableSubHeader subheader) {
        super.render(subheader);

        subheader.getNameTh().setPaddingLeft(20);

        // Here you can define any element attach to the Category Component SubHeader
        TableHeader newHeader = new TableHeader();
        newHeader.setPaddingLeft(40);
        newHeader.add(new MaterialBadge("$1,000"));
        subheader.add(newHeader);
    }
}
