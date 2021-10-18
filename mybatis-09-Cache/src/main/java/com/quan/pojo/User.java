package com.quan.pojo;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: 用户类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/18 19:24
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;

    public User() {
    }


    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
