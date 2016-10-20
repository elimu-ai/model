package org.literacyapp.model.gson;

import java.util.Calendar;
import java.util.List;
import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class StudentImageFeatureGson {

    private Long id;
    
    private StudentGson student;
    
    private Calendar timeCreated;
    
    private List<Float> svmVector;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
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

    public List<Float> getSvmVector() {
        return svmVector;
    }

    public void setSvmVector(List<Float> svmVector) {
        this.svmVector = svmVector;
    }
}
