package com.techmanual.chapterfour.staticproxy;

import com.techmanual.chapterfour.base.IHello;
import com.techmanual.chapterfour.base.LogInfoBase;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class HelloProxy extends LogInfoBase {

    private IHello helloObject;

    public HelloProxy(IHello helloObject) {
        this.helloObject = helloObject;
    }

    public void hello(String name) {
        logger.info("print hello start...");
        helloObject.hello(name);
        logger.info("print hello end...");
    }

}
