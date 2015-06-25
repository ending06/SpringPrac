package com.techmanual.chapterthree.collection;

import com.google.common.base.Objects;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/25<p>
// -------------------------------------------------------

public class School {

    private String schoolName;

    private int schoolCount;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolCount() {
        return schoolCount;
    }

    public void setSchoolCount(int schoolCount) {
        this.schoolCount = schoolCount;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("schoolName", schoolName).add("schoolCount", schoolCount).toString();
    }
}
