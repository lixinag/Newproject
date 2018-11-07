package com.lx.project.po;

import java.util.Date;

public class Seller {
    private String id;

    private String name;

    private String pwd;

    private Date createtime;

    private Date changepwdtime;

    private Date lastlogintime;

    private String realname;

    private Long phonenum;

    private Boolean status;

    private Boolean isteam;

    private Long idcard;

    private Long bandcard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChangepwdtime() {
        return changepwdtime;
    }

    public void setChangepwdtime(Date changepwdtime) {
        this.changepwdtime = changepwdtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsteam() {
        return isteam;
    }

    public void setIsteam(Boolean isteam) {
        this.isteam = isteam;
    }

    public Long getIdcard() {
        return idcard;
    }

    public void setIdcard(Long idcard) {
        this.idcard = idcard;
    }

    public Long getBandcard() {
        return bandcard;
    }

    public void setBandcard(Long bandcard) {
        this.bandcard = bandcard;
    }
}