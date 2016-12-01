package org.literacyapp.model.gson.analytics;

import java.util.List;
import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.StudentImageGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class StudentImageCollectionEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private List<StudentImageGson> studentImages;
    
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

    public List<StudentImageGson> getStudentImages() {
        return studentImages;
    }

    public void setStudentImages(List<StudentImageGson> studentImages) {
        this.studentImages = studentImages;
    }

    public boolean isSvmTrainingExecuted() {
        return svmTrainingExecuted;
    }

    public void setSvmTrainingExecuted(boolean svmTrainingExecuted) {
        this.svmTrainingExecuted = svmTrainingExecuted;
    }
}
