package com.techmanual.chapterfour.pointcut.introduction;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class ISomeImpl implements ISome {
    @Override
    public void doSome() {
        System.out.println("原对象职责");
    }
}
