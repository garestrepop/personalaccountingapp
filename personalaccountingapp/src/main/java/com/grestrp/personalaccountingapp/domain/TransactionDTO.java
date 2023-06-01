package com.grestrp.personalaccountingapp.domain;

import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import com.grestrp.personalaccountingapp.persistence.entity.Item;
import com.grestrp.personalaccountingapp.persistence.entity.TypeTransaction;
import com.grestrp.personalaccountingapp.persistence.entity.User;

import java.time.LocalDateTime;

public class TransactionDTO {

    // Attributes

    private Integer transactionId;
    private Integer budgetid;
    private Integer typeid;
    private LocalDateTime startdate;
    private LocalDateTime enddate;
    private Integer itemid;
    private Double valor;
    private Integer userid;
    private Integer stateid;
    private LocalDateTime createdat;
    private LocalDateTime updatedat;

    private Budget budget;
    private TypeTransaction typetransaction;
    private Item item;
    private User user;

    // Methods

    public Integer getId() {
        return transactionId;
    }

    public void setId(Integer transactionId) {
        this.transactionId = transactionId;
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

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public TypeTransaction getTypetransaction() {
        return typetransaction;
    }

    public void setTypetransaction(TypeTransaction typetransaction) {
        this.typetransaction = typetransaction;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
