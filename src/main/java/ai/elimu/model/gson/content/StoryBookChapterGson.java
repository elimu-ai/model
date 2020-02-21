package ai.elimu.model.gson.content;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookChapterGson extends ContentGson {
    
    private StoryBookGson storyBook;
    
    private Integer sortOrder;

    public StoryBookGson getStoryBook() {
        return storyBook;
    }

    public void setStoryBook(StoryBookGson storyBook) {
        this.storyBook = storyBook;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
