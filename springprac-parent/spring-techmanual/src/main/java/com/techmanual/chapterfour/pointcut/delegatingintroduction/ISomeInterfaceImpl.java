package com.techmanual.chapterfour.pointcut.delegatingintroduction;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public class ISomeInterfaceImpl implements ISomeInterface {
    private String some;

    @Override
    public void setSome(String some) {
        this.some = some;
    }

    @Override
    public String getSome() {
        return some;
    }

}
