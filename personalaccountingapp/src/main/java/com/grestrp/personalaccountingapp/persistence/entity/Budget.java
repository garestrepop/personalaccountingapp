package com.grestrp.personalaccountingapp.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="[BUDGET]")
public class Budget {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STARTDATE")
    private LocalDateTime startdate;

    @Column(name = "ENDDATE")
    private LocalDateTime enddate;

    @Column(name = "USERID")
    private Integer userid;

    @Column(name = "STATEID")
    private Integer stateid;

    @Column(name = "CREATEDAT")
    private LocalDateTime createdat;

    @Column(name = "UPADATEDAT")
    private LocalDateTime updatedat;

    // Relations

    @OneToMany(mappedBy = "budget")
    private List<Transaction> transaction;

    @ManyToOne
    @JoinColumn(name = "ID", insertable = false, updatable = false)
    private User user;

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

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public void setUpdatedat(LocalDateTime updatedat) {
        this.updatedat = updatedat;
    }
}
