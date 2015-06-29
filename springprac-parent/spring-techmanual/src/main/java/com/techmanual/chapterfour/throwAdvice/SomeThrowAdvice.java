package com.techmanual.chapterfour.throwAdvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SomeThrowAdvice extends LogInfoBase implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass) {
        logger.info("SomeThrowAdvice that a " + subclass + "Exception was thrown in " + method);
    }
}
