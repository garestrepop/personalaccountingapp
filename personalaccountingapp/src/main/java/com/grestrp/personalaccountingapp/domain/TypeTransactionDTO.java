package com.grestrp.personalaccountingapp.domain;

public class TypeTransactionDTO {

    // Attributes

    private Integer typeTransactionId;
    private String name;

    // Methods

    public Integer getId() {
        return typeTransactionId;
    }

    public void setId(Integer typeTransactionId) {
        this.typeTransactionId = typeTransactionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
