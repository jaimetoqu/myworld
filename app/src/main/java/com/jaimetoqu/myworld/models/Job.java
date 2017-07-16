package com.jaimetoqu.myworld.models;

/**
 * Created by jaime on 7/15/17.
 */

public class Job {

    String title, description;
    int id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
