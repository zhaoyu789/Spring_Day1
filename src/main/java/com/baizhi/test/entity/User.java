package com.baizhi.test.entity;

import java.util.*;

public class User {
    private String username;
    private String password;
    private Integer age;
    private Double height;
    private String[] ss;
    private List<String> ll;
    private Set<String> ee;
    private Map<String,String> pp;
    private Properties properties;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setSs(String[] ss) {
        this.ss = ss;
    }

    public void setLl(List<String> ll) {
        this.ll = ll;
    }

    public void setEe(Set<String> ee) {
        this.ee = ee;
    }

    public void setPp(Map<String, String> pp) {
        this.pp = pp;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


}
