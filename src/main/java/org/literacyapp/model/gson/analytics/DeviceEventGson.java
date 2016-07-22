package org.literacyapp.model.gson.analytics;

import java.util.Calendar;
import org.literacyapp.model.gson.DeviceGson;

public class DeviceEventGson {

    private DeviceGson device;
    
    private Calendar calendar;

    public DeviceGson getDevice() {
        return device;
    }

    public void setDevice(DeviceGson device) {
        this.device = device;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
