package com.techmanual.chapterfour.beforeadvice;

import com.techmanual.chapterfour.base.LogInfoBase;

import org.aspectj.lang.JoinPoint;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class LogBeforeAdvice2 extends LogInfoBase {

    public void before(JoinPoint jointPoint) {
        logger.info("method starts..." + jointPoint.getSignature().getDeclaringTypeName() + "."
                + jointPoint.getSignature().getName());
    }
}
