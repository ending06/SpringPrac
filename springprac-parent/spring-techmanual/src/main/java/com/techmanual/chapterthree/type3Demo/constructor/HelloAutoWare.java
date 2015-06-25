package com.techmanual.chapterthree.type3Demo.constructor;

import java.util.Date;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
//-------------------------------------------------------

public class HelloAutoWare {

    private Date date;

    private String printWord;

    public HelloAutoWare(Date date, String printWord) {
        this.date = date;
        this.printWord = printWord;
    }

    public HelloAutoWare(){

    }

    public String getPrintWord() {
        return printWord;
    }

    public void setPrintWord(String printWord) {
        this.printWord = printWord;
    }
}
