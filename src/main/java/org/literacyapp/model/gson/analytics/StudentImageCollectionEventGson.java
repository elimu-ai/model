package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class StudentImageCollectionEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private boolean svmTrainingExecuted;

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

    public boolean isSvmTrainingExecuted() {
        return svmTrainingExecuted;
    }

    public void setSvmTrainingExecuted(boolean svmTrainingExecuted) {
        this.svmTrainingExecuted = svmTrainingExecuted;
    }
}
