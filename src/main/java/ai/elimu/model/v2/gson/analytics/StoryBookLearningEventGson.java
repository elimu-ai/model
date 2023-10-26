package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class StoryBookLearningEventGson extends LearningEventGson {
    
    private Long storyBookId;
    
    private String storyBookTitle;
    
    public Long getStoryBookId() {
        return storyBookId;
    }

    public void setStoryBookId(Long storyBookId) {
        this.storyBookId = storyBookId;
    }

    public String getStoryBookTitle() {
        return storyBookTitle;
    }

    public void setStoryBookTitle(String storyBookTitle) {
        this.storyBookTitle = storyBookTitle;
    }
}
