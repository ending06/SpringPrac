package com.techmanual.chapterfour.afteradvice;

import com.techmanual.chapterfour.base.LogInfoBase;
import org.aspectj.lang.JoinPoint;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class LogAspect extends LogInfoBase {
    public void before(JoinPoint jointPoint) {
        logger.info("LogAspect.method starts..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint jointPoint) {
        logger.info("LogAspect.method ends..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());
    }
}
