package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;

public class AppCategoryGson extends BaseEntityGson {
    
    private String name;
    
    private String backgroundColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
