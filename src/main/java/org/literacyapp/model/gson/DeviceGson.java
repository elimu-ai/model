package org.literacyapp.model.gson;

import java.util.Calendar;
import java.util.Set;

public class DeviceGson {
    
    private Long id;
    
    private String deviceId;
    
    private String deviceManufacturer;
    
    private String deviceModel;
    
    private String deviceSerial;
    
    private Calendar timeRegistered;
    
    private Integer osVersion;
    
    private String locale;
    
    private Boolean rooted;
    
    private Set<DeviceGson> devicesNearby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean isRooted() {
        return rooted;
    }

    public void setRooted(Boolean rooted) {
        this.rooted = rooted;
    }

    public Set<DeviceGson> getDevicesNearby() {
        return devicesNearby;
    }

    public void setDevicesNearby(Set<DeviceGson> devicesNearby) {
        this.devicesNearby = devicesNearby;
    }
}
