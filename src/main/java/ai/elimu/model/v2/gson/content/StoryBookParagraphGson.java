package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class StoryBookParagraphGson extends BaseEntityGson {
    
    private Integer sortOrder;

    private String originalText;
    
    private List<WordGson> words;

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
