package org.literacyapp.model.gson.analytics;

import java.util.Calendar;
import org.literacyapp.model.gson.DeviceGson;

public abstract class DeviceEventGson {

    private DeviceGson device;
    
    private Calendar time;

    public DeviceGson getDevice() {
        return device;
    }

    public void setDevice(DeviceGson device) {
        this.device = device;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}
