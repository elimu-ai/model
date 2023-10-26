package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.WordType;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class WordGson extends ContentGson {
    
    @Deprecated // TODO: replace with LetterSounds
    private String text;
    
    private List<LetterSoundGson> letterSounds;
    
    private WordType wordType;

    @Deprecated
    public String getText() {
        return text;
    }

    @Deprecated
    public void setText(String text) {
        this.text = text;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        this.wordType = wordType;
    }

    public List<LetterSoundGson> getLetterSounds() {
        return letterSounds;
    }

    public void setLetterSounds(List<LetterSoundGson> letterSounds) {
        this.letterSounds = letterSounds;
    }
}
