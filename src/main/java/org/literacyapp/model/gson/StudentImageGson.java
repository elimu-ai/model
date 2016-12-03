package org.literacyapp.model.gson;

import java.util.Calendar;
import org.literacyapp.model.gson.analytics.StudentImageCollectionEventGson;

public class StudentImageGson extends BaseEntityGson {
    
    private DeviceGson device;
    
    private Calendar timeCollected;
    
    private String imageFileUrl;
    
    private StudentImageFeatureGson studentImageFeature;
    
    private StudentImageCollectionEventGson studentImageCollectionEvent;

    public DeviceGson getDevice() {
        return device;
    }

    public void setDevice(DeviceGson device) {
        this.device = device;
    }

    public Calendar getTimeCollected() {
        return timeCollected;
    }

    public void setTimeCollected(Calendar timeCollected) {
        this.timeCollected = timeCollected;
    }

    public String getImageFileUrl() {
        return imageFileUrl;
    }

    public void setImageFileUrl(String imageFileUrl) {
        this.imageFileUrl = imageFileUrl;
    }

    public StudentImageFeatureGson getStudentImageFeature() {
        return studentImageFeature;
    }

    public void setStudentImageFeature(StudentImageFeatureGson studentImageFeature) {
        this.studentImageFeature = studentImageFeature;
    }
    
    public StudentImageCollectionEventGson getStudentImageCollectionEvent() {
        return studentImageCollectionEvent;
    }

    public void setStudentImageCollectionEvent(StudentImageCollectionEventGson studentImageCollectionEvent) {
        this.studentImageCollectionEvent = studentImageCollectionEvent;
    }
}
