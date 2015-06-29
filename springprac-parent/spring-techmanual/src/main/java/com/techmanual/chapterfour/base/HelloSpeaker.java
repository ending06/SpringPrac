package com.techmanual.chapterfour.base;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class HelloSpeaker implements IHello {
    @Override
    public void hello(String name) {
        System.out.println("helloSpeaker.."+name);
    }
}
