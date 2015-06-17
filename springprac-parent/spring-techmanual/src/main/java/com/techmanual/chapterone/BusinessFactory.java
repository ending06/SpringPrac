package com.techmanual.chapterone;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/17<p>
// -------------------------------------------------------

import java.io.FileInputStream;
import java.util.Properties;

public class BusinessFactory {
    public BusinessFactory() throws Exception {
        properties = new Properties();
        properties
                .load(new FileInputStream(
                        "D:\\work\\Pay_Git\\springPrac\\springPrac\\springprac-parent\\spring-techmanual\\src\\main\\resources\\techmanual-config\\chapterone_config.properties"));

        String businessString = properties.getProperty("business.class");
        String aDeviceString = properties.getProperty("writer.class");
        business = (Business) Class.forName(businessString).newInstance();
        deviceWriter = (DeviceWriter) Class.forName(aDeviceString).newInstance();
        business.saveToWrite(deviceWriter);
    }

    public static BusinessFactory getInstance() throws Exception {
        if (factory == null) {
            factory = new BusinessFactory();
        }
        return factory;
    }

    // ===============================private methods======================//
    private static BusinessFactory factory;

    private Properties properties;
    private Business business;
    private DeviceWriter deviceWriter;

    public Business getBusiness() {
        return business;
    }

    public DeviceWriter getDeviceWriter() {
        return deviceWriter;
    }
}
