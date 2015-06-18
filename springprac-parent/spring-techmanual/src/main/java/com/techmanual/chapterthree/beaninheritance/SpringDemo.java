package com.techmanual.chapterthree.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
        System.out.println("name=" + someBean.getName() + ";age=" + someBean.getAge());
        // 预期结果：name=change;age=18
    }
}
