package ai.elimu.model.gson.analytics;

import java.util.Calendar;
import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.DeviceGson;

public abstract class DeviceEventGson extends BaseEntityGson {

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
