package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.content.StoryBookGson;

public class StoryBookLearningEventGson extends LearningEventGson {

    private StoryBookGson storyBook;
    
    // TODO: activityType?

    public StoryBookGson getStoryBook() {
        return storyBook;
    }

    public void setStoryBook(StoryBookGson storyBook) {
        this.storyBook = storyBook;
    }
}
