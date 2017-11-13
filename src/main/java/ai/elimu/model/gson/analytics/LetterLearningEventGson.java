package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.LetterGson;
import lombok.Getter;
import lombok.Setter;

public class LetterLearningEventGson extends LearningEventGson {

    @Getter
    @Setter
    private LetterGson letter;
    
    // TODO: activityType?

}
