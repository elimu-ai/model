package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class LetterToAllophoneMappingGson extends BaseEntityGson {
    
    private List<LetterGson> letters;
    
    private List<AllophoneGson> allophones;
    
    private int usageCount;

    public List<AllophoneGson> getAllophones() {
        return allophones;
    }

    public List<LetterGson> getLetters() {
        return letters;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setAllophones(List<AllophoneGson> allophones) {
        this.allophones = allophones;
    }

    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }
}
