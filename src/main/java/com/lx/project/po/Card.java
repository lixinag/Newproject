package com.lx.project.po;

public class Card {
    private String id;

    private String allgoods;

    private String uid;

    private Boolean ispay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAllgoods() {
        return allgoods;
    }

    public void setAllgoods(String allgoods) {
        this.allgoods = allgoods == null ? null : allgoods.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Boolean getIspay() {
        return ispay;
    }

    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
    }
}