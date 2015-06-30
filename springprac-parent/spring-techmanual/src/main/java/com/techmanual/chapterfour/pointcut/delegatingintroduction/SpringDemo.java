package com.techmanual.chapterfour.pointcut.delegatingintroduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-service-four.xml");
        ISomeInterface iSomeInterface = (ISomeInterface) applicationContext.getBean("delegatingIntroductionProxy");
        iSomeInterface.setSome("commonName");
        System.out.println("正常测试==============：" + iSomeInterface.getSome());

        try {
            // 对象被锁定
            ((ILockable) iSomeInterface).lock();

            // 无法执行set方法，丢出异常
            iSomeInterface.setSome("对象锁定");

            System.out.println("锁定对象测试==============：" + iSomeInterface.getSome());

        } catch (Exception e) {
            System.out.println("锁定对象测试==============：锁定对象，再次使用set方法异常，异常原因：" + e);
        }
        // Object is unlocked.
        ((ILockable) iSomeInterface).unlock();
        // It's ok to use setter again.
        iSomeInterface.setSome("锁释放");
        System.out.println("释放锁定对象测试==============："+iSomeInterface.getSome());
    }
}
