package com.grestrp.personalaccountingapp.persistence.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="[USER]")
public class User {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "MOVILPHONE")
    private String movilphone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "STATEID")
    private Integer stateid;

    @Column(name = "CREATEDAT")
    private LocalDateTime createdat;

    @Column(name = "UPDATEDAT")
    private LocalDateTime updatedat;

    // Relations

    @OneToMany(mappedBy = "user")
    private List<Budget> budget;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transaction;

    @ManyToOne
    @JoinColumn(name = "ID", insertable = false, updatable = false)
    private State state;

    // Methods

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
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMovilphone() {
        return movilphone;
    }

    public void setMovilphone(String movilphone) {
        this.movilphone = movilphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public LocalDateTime getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime updateat) {
        this.updatedat = updatedat;
    }
}
