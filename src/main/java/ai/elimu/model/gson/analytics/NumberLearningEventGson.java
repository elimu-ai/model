package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.NumberGson;
import lombok.Getter;
import lombok.Setter;

public class NumberLearningEventGson extends LearningEventGson {

    @Getter
    @Setter
    private NumberGson number;
    
    // TODO: activityType?

}
