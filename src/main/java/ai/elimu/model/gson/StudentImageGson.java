package ai.elimu.model.gson;

import java.util.Calendar;

public class StudentImageGson extends BaseEntityGson {
    
    private Calendar timeCollected;
    
    private String imageFileUrl;
    
    private StudentImageFeatureGson studentImageFeature;

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
}
