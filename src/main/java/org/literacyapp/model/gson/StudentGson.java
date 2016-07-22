package org.literacyapp.model.gson;

import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class StudentGson {

    private Long id;
    
    private Locale locale;
    
    private Set<DeviceGson> devices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Set<DeviceGson> getDevices() {
        return devices;
    }

    public void setDevices(Set<DeviceGson> devices) {
        this.devices = devices;
    }
}
