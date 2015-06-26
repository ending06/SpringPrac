package com.techmanual.chapterthree.lookupmethod.injection;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public abstract class MessageManager {
    public void display() {
        Message message = createMessage();
        System.out.println("message = " + message);
    }

    protected abstract Message createMessage();
}
