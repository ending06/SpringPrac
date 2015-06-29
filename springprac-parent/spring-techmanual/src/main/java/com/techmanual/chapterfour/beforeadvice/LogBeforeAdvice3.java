package com.techmanual.chapterfour.beforeadvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------
@Aspect
public class LogBeforeAdvice3 extends LogInfoBase {
    @Before("execution(* com.techmanual.chapterfour.base.IHello.*(..))")
    public void before(JoinPoint jointPoint) {
        logger.info("method starts..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());
    }
}
