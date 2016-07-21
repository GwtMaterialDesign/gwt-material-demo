package gwt.material.design.demo.client.application.dto;

import java.io.Serializable;

/**
 * Created by Mark Kevin on 7/6/2016.
 */
public class Repository implements Serializable {

    private String name;
    private int stargazers;
    private int forks;

    public Repository() {}

    public Repository(String name, int stargazers, int forks) {
        this.name = name;
        this.stargazers = stargazers;
        this.forks = forks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStargazers() {
        return stargazers;
    }

    public void setStargazers(int stargazers) {
        this.stargazers = stargazers;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }
}
