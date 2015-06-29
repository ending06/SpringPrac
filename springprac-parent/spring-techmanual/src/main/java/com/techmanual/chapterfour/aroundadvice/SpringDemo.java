package com.techmanual.chapterfour.aroundadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmanual.chapterfour.base.IHello;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service-four.xml");

        //beforeAdvice
        IHello helloProxy =
                (IHello) applicationContext.getBean("iHello");
        helloProxy.hello("Justin");

    }
}
