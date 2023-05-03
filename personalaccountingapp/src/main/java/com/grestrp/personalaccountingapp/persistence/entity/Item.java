package com.grestrp.personalaccountingapp.persistence.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "dbo.ITEM")
public class Item {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "STATEID")
    private String stateid;

    @Column(name = "CREATEAT")
    private LocalDateTime createat;

    @Column(name = "UPDATEAT")
    private LocalDateTime updateat;

    // Relations

    @OneToMany(mappedBy = "item")
    private List<Transaction> transaction;

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

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
    }

    public LocalDateTime getCreateat() {
        return createat;
    }

    public void setCreateat(LocalDateTime createat) {
        this.createat = createat;
    }

    public LocalDateTime getUpdateat() {
        return updateat;
    }

    public void setUpdateat(LocalDateTime updateat) {
        this.updateat = updateat;
    }
}
