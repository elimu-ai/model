package org.literacyapp.model.json;

import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class StudentJson {

    private Long id;
    
    private Locale locale;
    
    private Set<DeviceJson> devices;

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

    public Set<DeviceJson> getDevices() {
        return devices;
    }

    public void setDevices(Set<DeviceJson> devices) {
        this.devices = devices;
    }
}
