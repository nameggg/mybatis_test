package com.packages.entity;

import lombok.*;


public class User {
    private String uid;
    private String uname;
    private String password;

    public User(String uid, String uname, String password) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
    }

    public User() {

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
