package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.content.LetterGson;

public class VideoLearningEventGson extends LearningEventGson {

    private Long videoId;
    
    // TODO: activityType?

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}
