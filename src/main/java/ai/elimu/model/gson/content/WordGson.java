package ai.elimu.model.gson.content;

import java.util.List;
import ai.elimu.model.enums.content.SpellingConsistency;
import ai.elimu.model.enums.content.WordType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class WordGson extends ContentGson {
    
    private String text;
    
    private List<AllophoneGson> allophones;
    
    private int usageCount;
    
    private WordType wordType;
    
    private SpellingConsistency spellingConsistency;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public List<AllophoneGson> getAllophones() {
        return allophones;
    }

    public void setAllophones(List<AllophoneGson> allophones) {
        this.allophones = allophones;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        this.wordType = wordType;
    }

    public SpellingConsistency getSpellingConsistency() {
        return spellingConsistency;
    }

    public void setSpellingConsistency(SpellingConsistency spellingConsistency) {
        this.spellingConsistency = spellingConsistency;
    }
}
