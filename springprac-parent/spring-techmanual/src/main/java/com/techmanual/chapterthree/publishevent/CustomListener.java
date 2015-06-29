package com.techmanual.chapterthree.publishevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// publishEvent定时发布心跳事件，让应用程序的客户端知道应用程序还活着
// -------------------------------------------------------

public class CustomListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof SomeEvent) {
            System.out.println(event.getSource());
        }
    }
}
