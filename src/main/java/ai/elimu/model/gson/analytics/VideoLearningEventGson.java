package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.multimedia.VideoGson;

public class VideoLearningEventGson extends LearningEventGson {

    private VideoGson video;
    
    // TODO: activityType?

    public VideoGson getVideo() {
        return video;
    }

    public void setVideo(VideoGson video) {
        this.video = video;
    }
}
