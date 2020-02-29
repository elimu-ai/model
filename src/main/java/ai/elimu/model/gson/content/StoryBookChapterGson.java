package ai.elimu.model.gson.content;

import ai.elimu.model.gson.BaseEntityGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookChapterGson extends BaseEntityGson {
    
    private StoryBookGson storyBook;
    
    private Integer sortOrder;
    
    private List<StoryBookParagraphGson> storyBookParagraphs;

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

    public List<StoryBookParagraphGson> getStoryBookParagraphs() {
        return storyBookParagraphs;
    }

    public void setStoryBookParagraphs(List<StoryBookParagraphGson> storyBookParagraphs) {
        this.storyBookParagraphs = storyBookParagraphs;
    }
}
