package com.techmanual.chapterthree.type3Demo.constructor;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
// -------------------------------------------------------

public class HelloBean {

    private String name;

    private String helloWord;

    // 建议有无参的构造函数
    public HelloBean() {

    }

    public HelloBean(String name, String helloWord) {
        this.name = name;
        this.helloWord = helloWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelloWord() {
        return helloWord;
    }

    public void setHelloWord(String helloWord) {
        this.helloWord = helloWord;
    }
}
