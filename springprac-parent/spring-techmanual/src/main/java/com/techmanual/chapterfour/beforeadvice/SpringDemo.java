package com.techmanual.chapterfour.beforeadvice;

import com.techmanual.chapterfour.base.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service-four.xml");

        //beforeAdvice
        IHello helloProxy =
                (IHello) applicationContext.getBean("helloBeforeAdvice");
        helloProxy.hello("Justin");
        System.out.printf("beforeAdvice end!!\n");

        //beforeAdvice2
        IHello helloSpeaker =
                (IHello) applicationContext.getBean("helloSpeaker");
        helloSpeaker.hello("Justin");
        System.out.printf("beforeAdvice2 end!!\n");

        //beforeAdvice3
        IHello helloSpeaker3 =
                (IHello) applicationContext.getBean("helloSpeaker");
        helloSpeaker3.hello("Justin");
    }
}
