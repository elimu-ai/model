package org.literacyapp.model.gson;

import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class StudentGson {

    private Long id;
    
    private String avatarFileUrl;
    
    private Set<DeviceGson> devices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
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
