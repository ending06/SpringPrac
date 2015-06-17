package com.techmanual.chapterone;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/17<p>
//-------------------------------------------------------

public class Business {
    private DeviceWriter deviceWriter;

    public void saveToWrite(DeviceWriter deviceWriter){
        try{
            if(deviceWriter==null){
                throw new Exception("类加载失败");
            }
            deviceWriter.saveToDevice();
        }catch (Exception e){
            System.out.println("exception:"+e);
        }
    }

    public DeviceWriter getDeviceWriter() {
        return deviceWriter;
    }

    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }
}
