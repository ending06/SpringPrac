package com.techmanual.chapterfour.beforeadvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class LogBeforeAdvice extends LogInfoBase implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("logBeforeAdvice.before...method="+method);
    }
}
