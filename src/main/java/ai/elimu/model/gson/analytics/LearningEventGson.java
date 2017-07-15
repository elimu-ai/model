package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.StudentGson;
import ai.elimu.model.gson.admin.ApplicationGson;

public abstract class LearningEventGson extends DeviceEventGson {

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
