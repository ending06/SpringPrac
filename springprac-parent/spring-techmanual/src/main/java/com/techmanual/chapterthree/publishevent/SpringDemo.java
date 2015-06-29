package com.techmanual.chapterthree.publishevent;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        applicationContext.publishEvent(new SomeEvent(SpringDemo.class));
    }
}
