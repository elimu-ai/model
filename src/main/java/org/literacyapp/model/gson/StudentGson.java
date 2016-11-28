package org.literacyapp.model.gson;

import java.util.List;

public class StudentGson extends BaseEntityGson {
    
    private StudentImageGson avatar;
    
    private List<DeviceGson> devices;

    public List<DeviceGson> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceGson> devices) {
        this.devices = devices;
    }

    public StudentImageGson getAvatar() {
        return avatar;
    }

    public void setAvatar(StudentImageGson avatar) {
        this.avatar = avatar;
    }
}
