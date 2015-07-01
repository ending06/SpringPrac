package com.techmanual.chapterfour.throwAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfour-service.xml");

        // beforeAdvice3
        IHelloThrow helloThrow = (IHelloThrow) applicationContext.getBean("helloproxy_throwAdvice");
        try {
            helloThrow.printHello("justin!!");
        } catch (Throwable throwable) {
            System.out.println("main function:" + throwable);
        }
        // 执行结果：
        /*
         * 16:31:00.764 [main] INFO c.t.c.throwAdvice.SomeThrowAdvice - SomeThrowAdvice that a java.lang.Exception:
         * 异常系...Exception was thrown in public abstract void
         * com.techmanual.chapterfour.throwAdvice.IHelloThrow.printHello(java.lang.String) throws java.lang.Throwable
         *
         *
         * main function:java.lang.Exception: 异常系...
         */
    }
}
