package com.techmanual.chapterfour.dynamicproxy;

import com.techmanual.chapterfour.base.HelloSpeaker;
import com.techmanual.chapterfour.base.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");

        LogHandler logHandler = new LogHandler();

        // 加载服务对象
        IHello helloProxy = (IHello) logHandler.bind(new HelloSpeaker());
        helloProxy.hello("test");
    }
}
