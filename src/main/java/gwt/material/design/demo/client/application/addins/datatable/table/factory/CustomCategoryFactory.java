package gwt.material.design.demo.client.application.addins.datatable.table.factory;

import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.data.component.CategoryComponent.OrphanCategoryComponent;
import gwt.material.design.client.data.factory.CategoryComponentFactory;
import gwt.material.design.demo.client.application.addins.datatable.table.StandardTable;

public class CustomCategoryFactory extends CategoryComponentFactory {

    @Override
    public CategoryComponent generate(String categoryName) {
        CategoryComponent category = super.generate(categoryName);

        if(!(category instanceof OrphanCategoryComponent)) {
            category = new StandardTable.CustomCategoryComponent(categoryName);
        }
        return category;
    }
}
