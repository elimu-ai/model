package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class AppCategoryGson extends BaseEntityGson {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<AppGroupGson> appGroups;

}
