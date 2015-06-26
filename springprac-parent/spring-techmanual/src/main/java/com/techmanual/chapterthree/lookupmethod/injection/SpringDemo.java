package com.techmanual.chapterthree.lookupmethod.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public class SpringDemo {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");

        MessageManager messageManager = (MessageManager) applicationContext.getBean("messageManager");

        try {
            messageManager.display();
            Thread.sleep(1000);
            messageManager.display();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
