package com.techmanual.chapterthree.instantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service.xml");
        IMusicBox iMusicBox = (IMusicBox) applicationContext.getBean("music");
        iMusicBox.play();

    }
}
