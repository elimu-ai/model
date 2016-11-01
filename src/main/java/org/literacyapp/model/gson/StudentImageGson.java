package org.literacyapp.model.gson;

import java.util.Calendar;

public class StudentImageGson extends BaseEntityGson {
    
    private DeviceGson device;
    
    private String imageFileUrl;
    
    private Calendar timeCollected;
    
    private StudentImageFeatureGson studentImageFeature;

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

    public Calendar getTimeCollected() {
        return timeCollected;
    }

    public void setTimeCollected(Calendar timeCollected) {
        this.timeCollected = timeCollected;
    }

    public StudentImageFeatureGson getStudentImageFeature() {
        return studentImageFeature;
    }

    public void setStudentImageFeature(StudentImageFeatureGson studentImageFeature) {
        this.studentImageFeature = studentImageFeature;
    }
}
