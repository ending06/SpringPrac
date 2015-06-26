package com.techmanual.chapterthree.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        PostProcessorBean postProcessorBean = (PostProcessorBean)applicationContext.getBean("postProcessorBean");
        // run result = "result==TEST"
        System.out.println("result=="+postProcessorBean.getName());
    }
}
