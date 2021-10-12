package com.quan.pojo;

/**
 * @ClassName: Teacher
 * @Description: 创建数据库对于的teacher类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/10/14 15:32
 */
public class Teacher {
    private int id;
    private String name;

    public Teacher() {
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
