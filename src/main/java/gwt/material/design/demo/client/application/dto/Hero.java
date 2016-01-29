package gwt.material.design.demo.client.application.dto;

import com.google.gwt.resources.client.ImageResource;
import gwt.material.design.client.base.SearchObject;


/**
 * Created by Mark Kevin on 1/29/2016.
 */
public class Hero extends SearchObject {

    private String name;
    private String description;
    private int power;

    public Hero() {}

    public Hero(ImageResource imgProfile, String name, String description, int power) {
        super(imgProfile, name);
        this.name = name;
        this.description = description;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
