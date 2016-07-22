package org.literacyapp.model.gson.analytics;

import java.util.Calendar;
import org.literacyapp.model.gson.DeviceJson;

public class DeviceEventJson {

    private DeviceJson device;
    
    private Calendar calendar;

    public DeviceJson getDevice() {
        return device;
    }

    public void setDevice(DeviceJson device) {
        this.device = device;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
