package gwt.material.design.demo.client.application.dto;

import java.io.Serializable;

/**
 * Object to define the apps submitted by users
 */
public class Apps implements Serializable{

    private String name;
    private String owner;
    private String ownerImage;
    private String link;
    private String image;
    private String color;

    public Apps() {
    }

    public Apps(String name, String owner, String ownerImage, String link, String image, String color) {
        this.name = name;
        this.owner = owner;
        this.ownerImage = ownerImage;
        this.link = link;
        this.image = image;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerImage() {
        return ownerImage;
    }

    public void setOwnerImage(String ownerImage) {
        this.ownerImage = ownerImage;
    }
}
