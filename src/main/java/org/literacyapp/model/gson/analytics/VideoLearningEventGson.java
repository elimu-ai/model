package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.content.multimedia.VideoGson;

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
