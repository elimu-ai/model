package org.literacyapp.model.gson;

import java.util.Calendar;
import java.util.List;
import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class StudentImageGson {

    private Long id;
    
    private DeviceGson device;
    
    private String imageFileUrl;
    
    private Calendar timeCreated;
    
    private StudentImageFeatureGson studentImageFeature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeviceGson getDevice() {
        return device;
    }

    public void setDevice(DeviceGson device) {
        this.device = device;
    }

    public String getImageFileUrl() {
        return imageFileUrl;
    }

    public void setImageFileUrl(String imageFileUrl) {
        this.imageFileUrl = imageFileUrl;
    }

    public Calendar getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Calendar timeCreated) {
        this.timeCreated = timeCreated;
    }

    public StudentImageFeatureGson getStudentImageFeature() {
        return studentImageFeature;
    }

    public void setStudentImageFeature(StudentImageFeatureGson studentImageFeature) {
        this.studentImageFeature = studentImageFeature;
    }
}
