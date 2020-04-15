package ai.elimu.model.gson.content;

import ai.elimu.model.gson.BaseEntityGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public class StoryBookParagraphGson extends BaseEntityGson {
    
    private StoryBookChapterGson storyBookChapter;
    
    private Integer sortOrder;

    private String originalText;
    
    private List<WordGson> words;

    public StoryBookChapterGson getStoryBookChapter() {
        return storyBookChapter;
    }

    public void setStoryBookChapter(StoryBookChapterGson storyBookChapter) {
        this.storyBookChapter = storyBookChapter;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }
}
