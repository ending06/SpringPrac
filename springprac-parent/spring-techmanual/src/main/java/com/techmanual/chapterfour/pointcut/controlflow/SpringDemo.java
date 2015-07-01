package com.techmanual.chapterfour.pointcut.controlflow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        // bean 加载
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfour-service.xml");
        //编译失败？？？！！！
        ControlFlowPointCut controlFlowPointCut = (ControlFlowPointCut) applicationContext
                .getBean("controlFlowPointCut");
        if(args.length > 0 && "run".equals(args[0])) {
            controlFlowPointCut.helloEveryBody();
        }
        else {
            controlFlowPointCut.hello();
        }
    }
}
