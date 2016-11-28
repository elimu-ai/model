package org.literacyapp.model.gson.analytics;

import java.util.Set;
import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.StudentImageGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class StudentImageCollectionEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private Set<StudentImageGson> studentImages;

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

    public Set<StudentImageGson> getStudentImages() {
        return studentImages;
    }

    public void setStudentImages(Set<StudentImageGson> studentImages) {
        this.studentImages = studentImages;
    }
}
