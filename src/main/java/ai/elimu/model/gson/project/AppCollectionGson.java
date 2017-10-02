package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import java.util.List;

public class AppCollectionGson extends BaseEntityGson {
    
    private List<AppCategoryGson> appCategories;

    public List<AppCategoryGson> getAppCategories() {
        return appCategories;
    }

    public void setAppCategories(List<AppCategoryGson> appCategories) {
        this.appCategories = appCategories;
    }
}
