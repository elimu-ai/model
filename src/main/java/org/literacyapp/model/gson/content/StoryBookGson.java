package org.literacyapp.model.gson.content;

import org.literacyapp.model.enums.GradeLevel;

public class StoryBookGson extends ContentGson {
    
    private String title;
    
    private GradeLevel gradeLevel;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
