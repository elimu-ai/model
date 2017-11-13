package ai.elimu.model.gson.analytics;

import ai.elimu.model.enums.content.Shape;
import lombok.Getter;
import lombok.Setter;

public class ShapeLearningEventGson extends LearningEventGson {

    @Getter
    @Setter
    private Shape shape;
    
    // TODO: activityType?

}
