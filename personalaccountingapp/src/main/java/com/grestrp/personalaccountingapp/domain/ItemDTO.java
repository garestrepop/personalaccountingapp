package com.grestrp.personalaccountingapp.domain;

import java.time.LocalDateTime;

public class ItemDTO {
    // Attributes
    private int itemId;
    private String name;
    private String stateid;
    private LocalDateTime createdat;
    private LocalDateTime updatedat;

    // Methods

    public Integer getId() {
        return itemId;
    }

    public void setId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
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
