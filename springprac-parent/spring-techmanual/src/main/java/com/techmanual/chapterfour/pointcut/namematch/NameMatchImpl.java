package com.techmanual.chapterfour.pointcut.namematch;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class NameMatchImpl implements NameMatch {
    @Override
    public void printNameMatch(String name) {
        System.out.println("printName.name=" + name);
    }

    @Override
    public void printAgeMatch(int age) {
        System.out.println("printAge.age=" + age);
    }
}
