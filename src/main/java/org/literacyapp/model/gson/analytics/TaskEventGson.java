package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.enums.content.TaskType;
import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class TaskEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private TaskType taskType;

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

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
