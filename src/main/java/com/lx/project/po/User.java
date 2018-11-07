package com.lx.project.po;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private String password;

    private String realname;

    private String telephone;

    private String email;

    private Boolean isexist;

    private Date createtime;

    private Date changepwdtime;

    private Date lastLogin;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsexist() {
        return isexist;
    }

    public void setIsexist(Boolean isexist) {
        this.isexist = isexist;
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

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}