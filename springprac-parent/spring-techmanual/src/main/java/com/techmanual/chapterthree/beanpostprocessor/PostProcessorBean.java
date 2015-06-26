package com.techmanual.chapterthree.beanpostprocessor;

import com.google.common.base.Objects;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public class PostProcessorBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", name).toString();
    }
}
