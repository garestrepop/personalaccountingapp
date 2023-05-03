package com.grestrp.personalaccountingapp.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="dbo.TYPETRANSACTION")
public class TypeTransaction {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    // Relations

    @OneToMany(mappedBy = "typetransaction")
    private List<Transaction> transaction;

    //Methods

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
