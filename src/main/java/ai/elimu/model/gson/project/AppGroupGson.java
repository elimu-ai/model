package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import java.util.List;

public class AppGroupGson extends BaseEntityGson {
    
    private AppCategoryGson appCategory;
    
    private List<ApplicationGson> applications;
    
    public AppCategoryGson getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(AppCategoryGson appCategory) {
        this.appCategory = appCategory;
    }

    public List<ApplicationGson> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationGson> applications) {
        this.applications = applications;
    }
}
