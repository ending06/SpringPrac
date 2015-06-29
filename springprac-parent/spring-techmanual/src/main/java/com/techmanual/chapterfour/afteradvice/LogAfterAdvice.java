package com.techmanual.chapterfour.afteradvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class LogAfterAdvice extends LogInfoBase implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
      logger.info("methods end!!",method);
    }
}
