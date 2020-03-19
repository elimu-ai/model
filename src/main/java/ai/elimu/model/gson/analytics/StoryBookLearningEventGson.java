package ai.elimu.model.gson.analytics;

import ai.elimu.model.enums.analytics.LearningEventType;
import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import ai.elimu.model.gson.content.StoryBookGson;
import java.util.Calendar;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookLearningEventGson extends BaseEntityGson {
    
    private ApplicationGson application;
    
    private Calendar time;
    
    private LearningEventType learningEventType;
    
    private StoryBookGson storyBook;

    public ApplicationGson getApplication() {
        return application;
    }

    public void setApplication(ApplicationGson application) {
        this.application = application;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public LearningEventType getLearningEventType() {
        return learningEventType;
    }

    public void setLearningEventType(LearningEventType learningEventType) {
        this.learningEventType = learningEventType;
    }

    public StoryBookGson getStoryBook() {
        return storyBook;
    }

    public void setStoryBook(StoryBookGson storyBook) {
        this.storyBook = storyBook;
    }
}
