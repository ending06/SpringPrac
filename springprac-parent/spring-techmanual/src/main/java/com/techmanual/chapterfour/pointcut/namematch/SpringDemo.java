package com.techmanual.chapterfour.pointcut.namematch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// 过滤要拦截的方法，可以使用正则匹配的方式
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfour-service.xml");

        // nameMatch
        NameMatch nameMatch = (NameMatch) applicationContext.getBean("nameMatchProxy");
        // 当执行printAgeMatch方法时，会执行advice<property name="mappedName" value="*AgeMatch"/>
        nameMatch.printAgeMatch(10);
        nameMatch.printNameMatch("nameMatch TEST");

        // regexMatch
        NameMatch nameMatchRegex = (NameMatch) applicationContext.getBean("regexMatchProxy");
        nameMatchRegex.printAgeMatch(11);
        nameMatchRegex.printNameMatch("regexMatch TEST");
    }
}
