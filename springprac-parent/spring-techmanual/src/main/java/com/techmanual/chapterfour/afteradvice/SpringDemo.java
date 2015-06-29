package com.techmanual.chapterfour.afteradvice;

import com.techmanual.chapterfour.base.IHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
//-------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service-four.xml");

        IHello iHelloProxy = (IHello)applicationContext.getBean("helloProxy_logAfter");
        iHelloProxy.hello("justin");
    }
}
