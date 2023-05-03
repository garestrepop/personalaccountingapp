package com.grestrp.personalaccountingapp.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dbo.STATE")
public class State {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String Name;

    // Relations

    @OneToMany(mappedBy = "state")
    private List<Transaction> transaction;

    @OneToMany(mappedBy = "state")
    private List<User> user;

    @OneToMany(mappedBy = "state")
    private List<Budget> budget;

    // Methods

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
