package com.techmanual.chapterfour.throwAdvice;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class HelloSpeakerThrow implements IHelloThrow {
    @Override
    public void printHello(String name) throws Throwable {
        System.out.println("HelloSpeakerThrow.name=" + name);
        throw new Exception("异常系...");
    }
}
