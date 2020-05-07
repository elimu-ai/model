package ai.elimu.model.v1.gson.content;

import ai.elimu.model.v1.gson.BaseEntityGson;
import ai.elimu.model.v1.gson.content.multimedia.ImageGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public class StoryBookChapterGson extends BaseEntityGson {
    
    private StoryBookGson storyBook;
    
    private Integer sortOrder;
    
    private ImageGson image;
    
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
