package org.literacyapp.model.json.analytics;

import org.literacyapp.model.enums.content.TaskType;
import org.literacyapp.model.json.StudentJson;
import org.literacyapp.model.json.admin.ApplicationJson;

public class TaskEventJson {

    private StudentJson student;
    
    private ApplicationJson application;
    
    private TaskType taskType;

    public StudentJson getStudent() {
        return student;
    }

    public void setStudent(StudentJson student) {
        this.student = student;
    }

    public ApplicationJson getApplication() {
        return application;
    }

    public void setApplication(ApplicationJson application) {
        this.application = application;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
