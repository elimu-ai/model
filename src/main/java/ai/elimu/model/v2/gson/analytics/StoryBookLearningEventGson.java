package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookLearningEventGson extends LearningEventGson {
    
    private Long storyBookId;
    
    public Long getStoryBookId() {
        return storyBookId;
    }

    public void setStoryBookId(Long storyBookId) {
        this.storyBookId = storyBookId;
    }
}
