package com.techmanual.chapterfour.pointcut.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfour-service.xml");

        // 原有职能
        ISome some = (ISome) applicationContext.getBean("Isome");
        some.doSome();

        // 通过类型强转，原有对象附加的职能
        ((OtherSome) some).doOther();
    }
}
