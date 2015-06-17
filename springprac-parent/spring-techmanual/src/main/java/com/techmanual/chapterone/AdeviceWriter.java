package com.techmanual.chapterone;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/17<p>
// -------------------------------------------------------

import com.sun.org.apache.xpath.internal.SourceTree;

public class AdeviceWriter implements DeviceWriter {
    @Override
    public void saveToDevice() {
        System.out.println(" a device~~");
    }
}
