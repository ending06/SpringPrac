package com.techmanual.chaptertwo;

import com.techmanual.chapterone.Business;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/17<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        // bean 加载
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
        String testValue = helloSpring.getHelloword();
        System.out.println("testValue="+testValue);

        Business business = (Business)applicationContext.getBean("business");
        business.saveToWrite();
    }
}
