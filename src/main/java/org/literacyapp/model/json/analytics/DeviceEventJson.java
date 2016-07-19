package org.literacyapp.model.json.analytics;

import java.util.Calendar;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;
import org.literacyapp.model.json.DeviceJson;

public class DeviceEventJson {

    @NotNull
    @ToOne
    private DeviceJson device;
    
    @NotNull
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
