package com.techmanual.chapterfour.base;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// AOP将一个业务流程分为几部分，例如：权限检查，打日志等，每个部分单独处理
// 然后将其组装成完成的业务流程
// -------------------------------------------------------

public interface IHello {
    public void hello(String name);
}
