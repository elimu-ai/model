package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.StoryBookGson;
import lombok.Getter;
import lombok.Setter;

public class StoryBookLearningEventGson extends LearningEventGson {

    @Getter
    @Setter
    private StoryBookGson storyBook;
    
    // TODO: activityType?

}
