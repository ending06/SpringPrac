package com.techmanual.chapterthree.collection;

import com.techmanual.chapterthree.instantiation.IMusicBox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/25<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        CollectionDemo collectionDemo = (CollectionDemo) applicationContext.getBean("collectionDemo");
        System.out.println("result=" +collectionDemo);
    }
}
