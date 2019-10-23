package com.lvqz.dubbo.domain;

import java.io.Serializable;

/**
 * @author: lvqz
 * @date: 2019/10/22
 * @time: 17:24
 */
public class Teacher implements Serializable {

    private int id;
    private String name;

    public Teacher(){

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
