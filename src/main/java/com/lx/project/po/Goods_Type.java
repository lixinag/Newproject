package com.lx.project.po;

public class Goods_Type {
    private Long id;

    private Long parentiid;

    private String name;

    private String gid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentiid() {
        return parentiid;
    }

    public void setParentiid(Long parentiid) {
        this.parentiid = parentiid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }
}