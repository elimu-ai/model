package ai.elimu.model.v2.gson.content;

import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class LetterSoundCorrespondenceGson extends ContentGson {
    
    private List<LetterGson> letters;
    
    private List<AllophoneGson> allophones;

    public List<LetterGson> getLetters() {
        return letters;
    }

    public void setAllophones(List<AllophoneGson> allophones) {
        this.allophones = allophones;
    }
    
    public List<AllophoneGson> getAllophones() {
        return allophones;
    }

    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
    }
}
