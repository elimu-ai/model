package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.multimedia.VideoGson;
import lombok.Getter;
import lombok.Setter;

public class VideoLearningEventGson extends LearningEventGson {

    @Getter
    @Setter
    private VideoGson video;
    
    // TODO: activityType?

}
