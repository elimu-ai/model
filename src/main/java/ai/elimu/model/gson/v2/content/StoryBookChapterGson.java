package ai.elimu.model.gson.v2.content;

import ai.elimu.model.gson.v2.BaseEntityGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookChapterGson extends BaseEntityGson {
    
    private Integer sortOrder;
    
    private ImageGson image;
    
    private List<StoryBookParagraphGson> storyBookParagraphs;

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    public ImageGson getImage() {
        return image;
    }

    public void setImage(ImageGson image) {
        this.image = image;
    }

    public List<StoryBookParagraphGson> getStoryBookParagraphs() {
        return storyBookParagraphs;
    }

    public void setStoryBookParagraphs(List<StoryBookParagraphGson> storyBookParagraphs) {
        this.storyBookParagraphs = storyBookParagraphs;
    }
}
