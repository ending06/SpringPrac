package com.techmanual.chapterfour.pointcut.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// 在不修改类的情况下，增加一些额外的方法到对象上,增加了目标对象的职责
// -------------------------------------------------------

public class OtherIntroduction implements IntroductionInterceptor, OtherSome {
    // 是否实现自otherSome接口
    @Override
    public boolean implementsInterface(Class<?> intf) {
        return intf.isAssignableFrom(OtherSome.class);
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 如果执行的方法来自othersome接口的定义
        if (implementsInterface(invocation.getMethod().getDeclaringClass())) {
            // 执行时额外加入的行为
            return invocation.getMethod().invoke(this, invocation.getArguments());
        } else {
            return invocation.proceed();
        }
    }

    @Override
    public void doOther() {
        System.out.println("增加的职责");
    }
}
