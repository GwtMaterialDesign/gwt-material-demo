package gwt.material.design.demo.client.application.addins.autocomplete.base;

import java.io.Serializable;

public class User implements Serializable {

    public enum Position {
        CEO("CEO"),
        CTO("CTO"),
        DEVELOPER("Developer"),
        MARKETING("Marketing");

        private final String value;

        Position(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private String picture;

    private String name;
    private String email;
    private String password;

    private String address;
    private String contactNo;

    private String company;
    private boolean starred;

    private Position position;

    public User() {}

    public User(String picture, Position position, boolean starred, String name, String email, String password, String contactNo, String address, String company) {
        this.picture = picture;
        this.position = position;
        this.starred = starred;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}