package com.techmanual.chapterfour.aroundadvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

@Aspect
public class AroundAdviceAspect extends LogInfoBase {
    @Around("execution(* com.techmanual.chapterfour.base.IHello.*(..))")
    public Object invoke(ProceedingJoinPoint jointPoint) throws Throwable {
        logger.info("AroundAdviceAspect.method starts..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());

        Object retVal = jointPoint.proceed();

        logger.info("AroundAdviceAspect.method ends..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());

        return retVal;
    }
}
