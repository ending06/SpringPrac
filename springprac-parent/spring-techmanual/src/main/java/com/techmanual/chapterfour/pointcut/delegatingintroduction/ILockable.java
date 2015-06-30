package com.techmanual.chapterfour.pointcut.delegatingintroduction;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public interface ILockable {
    public void lock();

    public void unlock();

    public boolean isLocked();
}
