package com.techmanual.chapterthree.type3Demo.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");

        HelloBean hello = (HelloBean) applicationContext.getBean("helloBean");
        System.out.println("name=" + hello.getName() + ";helloword=" + hello.getHelloWord());
        // 期望值：name=test1;helloword=printHelloWord

        HelloAutoWare helloAutoWare = (HelloAutoWare)applicationContext.getBean("helloAutoWare");
        System.out.printf(""+helloAutoWare.getPrintWord());

    }
}
