package com.techmanual.chapterfour.dynamicproxy;

import com.techmanual.chapterfour.base.LogInfoBase;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class LogHandler extends LogInfoBase implements InvocationHandler {

    private Object delegateObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            logger.info("methods starts..." + method);
            result = method.invoke(delegateObject, args);
            logger.info("methods end..." + method);
            return result;
        } catch (Exception e) {
            logger.error("invoke expetion:", e);
            return result;
        }
    }

    public Object bind(Object delegateObject) {
        this.delegateObject = delegateObject;
        return Proxy.newProxyInstance(delegateObject.getClass().getClassLoader(), delegateObject.getClass()
                .getInterfaces(), this);
    }
}
