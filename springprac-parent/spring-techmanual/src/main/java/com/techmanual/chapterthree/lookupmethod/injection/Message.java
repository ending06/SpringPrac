package com.techmanual.chapterthree.lookupmethod.injection;

import com.google.common.base.Objects;

import java.util.Date;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public class Message {
    private String sysMessage;

    public Message(String sysMessage) {
        this.sysMessage = sysMessage;
    }

    public Message() {
        sysMessage = "系统资讯" + new Date().toString();
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("sysMessage", sysMessage).toString();
    }
}
