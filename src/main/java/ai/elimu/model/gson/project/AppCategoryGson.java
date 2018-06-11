package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import java.util.List;

public class AppCategoryGson extends BaseEntityGson {
    
    private String name;
    
    private String backgroundColor;
    
    private List<AppGroupGson> appGroups;

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

    public List<AppGroupGson> getAppGroups() {
        return appGroups;
    }

    public void setAppGroups(List<AppGroupGson> appGroups) {
        this.appGroups = appGroups;
    }
}
