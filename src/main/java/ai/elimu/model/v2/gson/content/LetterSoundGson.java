package ai.elimu.model.v2.gson.content;

import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class LetterSoundGson extends ContentGson {
    
    private List<LetterGson> letters;
    
    private List<SoundGson> sounds;

    public List<LetterGson> getLetters() {
        return letters;
    }
    
    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
    }
    
    public List<SoundGson> getSounds() {
        return sounds;
    }

    public void setSounds(List<SoundGson> sounds) {
        this.sounds = sounds;
    }
}
