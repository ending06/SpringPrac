package com.techmanual.chapterfour.staticproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
//-------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        // bean 加载
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        HelloProxy helloProxy= (HelloProxy)applicationContext.getBean("helloProxy");
        helloProxy.hello("test");
    }
}
