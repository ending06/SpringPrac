package com.techmanual.chapterfour.pointcut.controlflow;

import com.techmanual.chapterfour.pointcut.namematch.NameMatch;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// 我们对一个方法进行切入通知，但只有这个方法在一个特定方法中被调用的时候执行通知
// -------------------------------------------------------

public class ControlFlowPointCut implements ApplicationContextAware {

    private NameMatch nameMatchProxy;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        nameMatchProxy = (NameMatch) applicationContext.getBean("controlFlowPointCutProxy");
    }

    public void helloEveryBody() {
        nameMatchProxy.printAgeMatch(12);
        nameMatchProxy.printNameMatch("control Flow TEST!");
    }

    public void hello() {
        System.out.println("print helloinfo");
    }
}
