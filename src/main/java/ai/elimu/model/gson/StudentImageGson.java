package ai.elimu.model.gson;

import java.util.Calendar;
import ai.elimu.model.gson.analytics.StudentImageCollectionEventGson;
import lombok.Getter;
import lombok.Setter;

public class StudentImageGson extends BaseEntityGson {

    @Getter
    @Setter
    private Calendar timeCollected;

    @Getter
    @Setter
    private String imageFileUrl;

    @Getter
    @Setter
    private StudentImageFeatureGson studentImageFeature;

    @Getter
    @Setter
    private StudentImageCollectionEventGson studentImageCollectionEvent;

}
