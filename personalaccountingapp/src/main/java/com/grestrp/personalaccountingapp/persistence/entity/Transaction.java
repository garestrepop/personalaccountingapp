package com.grestrp.personalaccountingapp.persistence.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "dbo.TRANSACTION")
public class Transaction {

    // Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BUDGETID")
    private Integer budgetid;

    @Column(name = "TYPEID")
    private Integer typeid;

    @Column(name = "STARTDATE")
    private LocalDateTime startdate;

    @Column(name = "ENDDATE")
    private LocalDateTime enddate;

    @Column(name = "ITEMID")
    private Integer itemid;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "USERID")
    private Integer userid;

    @Column(name = "STATEID")
    private Integer stateid;

    @Column(name = "CREATEAT")
    private LocalDateTime createat;

    @Column(name = "UPDATEAT")
    private LocalDateTime updateat;

    // Relations

    @ManyToOne
    @JoinColumn(name = "ID", insertable = false, updatable = false)
    private Budget budget;

    @ManyToOne
    @JoinColumn(name = "ID", insertable = false, updatable = false)
    private TypeTransaction typetransaction;

    @ManyToOne
    @JoinColumn(name = "ID", insertable = false, updatable = false)
    private Item item;

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

    public Integer getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(Integer budgetid) {
        this.budgetid = budgetid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
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
