package com.czxt.bean;

import java.io.Serializable;

/**
 * 商家实体类
 */
public class gly implements Serializable {
    private int gid;//管理员id
    private String gname;//管理员名称
    private String password;//管理员密码
    private String address;//管理员地址

    /**
     * 无参构造方法
     */
    public gly(){}

    /**
     * 构造方法
     * @param gid
     * @param gname
     * @param password
     * @param address
     */
    public gly(int gid, String gname, String password, String address) {
        this.gid = gid;
        this.gname = gname;
        this.password = password;
        this.address = address;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setSname(String gname) {
        this.gname = gname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

