package ai.elimu.model.gson;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

public class StudentImageFeatureGson extends BaseEntityGson {

    @Getter
    @Setter
    private Calendar timeCreated;

    @Getter
    @Setter
    private String svmVector;

}
