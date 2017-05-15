package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class LearningEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;

    public ApplicationGson getApplication() {
        return application;
    }

    public void setApplication(ApplicationGson application) {
        this.application = application;
    }

    public StudentGson getStudent() {
        return student;
    }

    public void setStudent(StudentGson student) {
        this.student = student;
    }
}
