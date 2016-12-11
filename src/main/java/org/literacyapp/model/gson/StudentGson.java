package org.literacyapp.model.gson;

import java.util.Calendar;
import java.util.List;

public class StudentGson extends BaseEntityGson {
    
    private String uniqueId; // "<deviceId>_<Long>"
    
    private Calendar timeCreated; // Time created on Device
    
    private List<DeviceGson> devices;
    
    private StudentImageGson avatar;
    
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    
    public Calendar getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Calendar timeCreated) {
        this.timeCreated = timeCreated;
    }
    
    public StudentImageGson getAvatar() {
        return avatar;
    }

    public void setAvatar(StudentImageGson avatar) {
        this.avatar = avatar;
    }

    public List<DeviceGson> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceGson> devices) {
        this.devices = devices;
    }
}
