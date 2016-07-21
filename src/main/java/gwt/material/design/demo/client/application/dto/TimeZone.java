package gwt.material.design.demo.client.application.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides specific timezone for each state.
 * @author kevzlou7979
 */
public class TimeZone implements Serializable {

    private String name;
    private List<State> states = new ArrayList<>();

    public TimeZone() {}

    public TimeZone(String name, List<State> states) {
        this.name = name;
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public void addCountry(State state) {
        states.add(state);
    }
}
