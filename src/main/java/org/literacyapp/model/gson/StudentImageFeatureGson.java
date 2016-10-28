package org.literacyapp.model.gson;

import java.util.Calendar;

public class StudentImageFeatureGson extends BaseEntityGson {
    
    private StudentGson student;
    
    private Calendar timeCreated;
    
    private String svmVector;
    
    public StudentGson getStudent() {
        return student;
    }

    public void setStudent(StudentGson student) {
        this.student = student;
    }

    public Calendar getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Calendar timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getSvmVector() {
        return svmVector;
    }

    public void setSvmVector(String svmVector) {
        this.svmVector = svmVector;
    }
}
