package ai.elimu.model.v2.gson.content;

import ai.elimu.model.enums.content.WordType;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class WordGson extends ContentGson {
    
    @Deprecated // TODO: replace with LetterSoundCorrespondences
    private String text;
    
    private List<LetterSoundCorrespondenceGson> letterSoundCorrespondences;
    
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

    public List<LetterSoundCorrespondenceGson> getLetterSoundCorrespondences() {
        return letterSoundCorrespondences;
    }

    public void setLetterSoundCorrespondences(List<LetterSoundCorrespondenceGson> letterSoundCorrespondences) {
        this.letterSoundCorrespondences = letterSoundCorrespondences;
    }
}
