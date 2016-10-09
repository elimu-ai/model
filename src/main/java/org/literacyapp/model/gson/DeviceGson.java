package org.literacyapp.model.gson;

import java.util.Calendar;
import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class DeviceGson {
    
    private String deviceId;
    
    private String deviceManufacturer;
    
    private String deviceModel;
    
    private String deviceSerial;
    
    private Calendar timeRegistered;
    
    private Integer osVersion;
    
    private Locale locale;
    
    private Set<DeviceGson> devicesNearby;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    
    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public Calendar getTimeRegistered() {
        return timeRegistered;
    }

    public void setTimeRegistered(Calendar timeRegistered) {
        this.timeRegistered = timeRegistered;
    }

    public Integer getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(Integer osVersion) {
        this.osVersion = osVersion;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Set<DeviceGson> getDevicesNearby() {
        return devicesNearby;
    }

    public void setDevicesNearby(Set<DeviceGson> devicesNearby) {
        this.devicesNearby = devicesNearby;
    }
}
