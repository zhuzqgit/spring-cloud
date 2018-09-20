package com.xx.zhuzq.eurekaclient.bean;

import java.io.Serializable;

/**
 * @author zhuzq
 * @date 2018/8/15 10:43:50
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = -201743737802016568L;

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "Admin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
