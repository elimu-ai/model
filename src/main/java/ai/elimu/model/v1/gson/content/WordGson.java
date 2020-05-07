package ai.elimu.model.v1.gson.content;

import java.util.List;
import ai.elimu.model.enums.content.SpellingConsistency;
import ai.elimu.model.enums.content.WordType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public class WordGson extends ContentGson {
    
    @Deprecated // TODO: replace with list of Letters
    private String text;
    
    private List<LetterGson> letters;
    
    private List<AllophoneGson> allophones;
    
    private int usageCount;
    
    private WordType wordType;
    
    private SpellingConsistency spellingConsistency;

    @Deprecated
    public String getText() {
        return text;
    }

    @Deprecated
    public void setText(String text) {
        this.text = text;
    }
    
    public List<LetterGson> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
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
