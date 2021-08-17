package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.LearningEventType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookLearningEventGson extends LearningEventGson {
    
    private Long storyBookId;
    
    private LearningEventType learningEventType;
    
    public Long getStoryBookId() {
        return storyBookId;
    }

    public void setStoryBookId(Long storyBookId) {
        this.storyBookId = storyBookId;
    }

    public LearningEventType getLearningEventType() {
        return learningEventType;
    }

    public void setLearningEventType(LearningEventType learningEventType) {
        this.learningEventType = learningEventType;
    }
}
