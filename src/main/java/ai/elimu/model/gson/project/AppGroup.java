package ai.elimu.model.gson.project;

import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import java.util.List;

public class AppGroup extends BaseEntityGson {
    
    private List<ApplicationGson> applications;

    public List<ApplicationGson> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationGson> applications) {
        this.applications = applications;
    }
}
