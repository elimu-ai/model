package org.literacyapp.model.gson;

import java.util.Set;

public class StudentGson extends BaseEntityGson {
    
    private String avatarFileUrl;
    
    private Set<DeviceGson> devices;
    
    public String getAvatarFileUrl() {
        return avatarFileUrl;
    }

    public void setAvatarFileUrl(String avatarFileUrl) {
        this.avatarFileUrl = avatarFileUrl;
    }

    public Set<DeviceGson> getDevices() {
        return devices;
    }

    public void setDevices(Set<DeviceGson> devices) {
        this.devices = devices;
    }
}
