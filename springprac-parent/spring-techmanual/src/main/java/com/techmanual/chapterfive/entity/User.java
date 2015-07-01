package com.techmanual.chapterfive.entity;

import com.google.common.base.Objects;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public class User {
    private Integer id;

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("id", id).add("name", name).add("age", age).toString();
    }
}
