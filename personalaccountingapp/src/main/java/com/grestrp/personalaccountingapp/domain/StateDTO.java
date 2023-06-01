package com.grestrp.personalaccountingapp.domain;

public class StateDTO {

    // Attributes

    private Integer stateId;
    private String Name;

    // Methods

    public Integer getId() {
        return stateId;
    }

    public void setId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
