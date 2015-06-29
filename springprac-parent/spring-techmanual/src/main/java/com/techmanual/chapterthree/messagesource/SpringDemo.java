package com.techmanual.chapterthree.messagesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Locale;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
//-------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        // bean 加载
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");

        Object[] arguments = new Object[]{"test用户", Calendar.getInstance().getTime()};
        System.out.println("userLogin"+applicationContext.getMessage("userLogin",arguments, Locale.US));
        System.out.println("userLogin"+applicationContext.getMessage("userLogin",arguments, Locale.TAIWAN));

    }
}
