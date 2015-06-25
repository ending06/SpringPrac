package com.techmanual.chapterthree.collection;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/25<p>
// -------------------------------------------------------

import com.google.common.base.Objects;

public class SomeObject {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("age", age).add("name", name).toString();
    }
}
