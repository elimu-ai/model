package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.StudentGson;
import ai.elimu.model.gson.admin.ApplicationGson;

public class AuthenticationEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private boolean isFallback;

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

    public boolean isIsFallback() {
        return isFallback;
    }

    public void setIsFallback(boolean isFallback) {
        this.isFallback = isFallback;
    }
}
