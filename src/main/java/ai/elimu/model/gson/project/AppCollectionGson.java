package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class AppCollectionGson extends BaseEntityGson {

    @Getter
    @Setter
    private List<AppCategoryGson> appCategories;

}
