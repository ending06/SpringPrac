package com.techmanual.chapterfour.pointcut.delegatingintroduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public class LockIntroduction extends DelegatingIntroductionInterceptor implements ILockable {

    private boolean locked;

    // 当对象通过locked变量将其设置为true时，将锁定对象，此时如果有其他对象打算执行set方法则会抛出异常，通知调用者该对象已经被锁定
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (isLocked() && methodInvocation.getMethod().getName().indexOf("set") == 0) {
            throw new AopConfigException("对象被锁定，无法执行set方法");
        }
        return super.invoke(methodInvocation);
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}
