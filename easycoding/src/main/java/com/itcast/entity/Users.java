package com.itcast.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-02-24 18:43:22
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 291708694485002598L;
    /**
    * 主键
    */
    private String id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 联系电话
    */
    private String phone;
    /**
    * 状态 0禁用 1启动
    */
    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}