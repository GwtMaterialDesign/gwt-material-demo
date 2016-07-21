package gwt.material.design.demo.client.application.dto;

import java.io.Serializable;

/**
 * State object
 * @author kevzlou7979
 */
public class State implements Serializable {

    private String name;

    public State(String name) {
        this.name = name;
    }

    public State() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
