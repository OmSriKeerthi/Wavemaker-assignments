package com.model;

import java.io.Serializable;

public class LocationModel extends  User implements Serializable {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
