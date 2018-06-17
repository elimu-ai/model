package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;

public class AppGroupGson extends BaseEntityGson {
    
    private AppCategoryGson appCategory;

    public AppCategoryGson getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(AppCategoryGson appCategory) {
        this.appCategory = appCategory;
    }
}
