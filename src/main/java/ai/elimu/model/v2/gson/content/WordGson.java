package ai.elimu.model.v2.gson.content;

import ai.elimu.model.enums.content.WordType;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class WordGson extends ContentGson {
    
    @Deprecated // TODO: replace with LetterToAllophoneMappings
    private String text;
    
    private List<LetterToAllophoneMappingGson> letterToAllophoneMappings;
    
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

    public List<LetterToAllophoneMappingGson> getLetterToAllophoneMappings() {
        return letterToAllophoneMappings;
    }

    public void setLetterToAllophoneMappings(List<LetterToAllophoneMappingGson> letterToAllophoneMappings) {
        this.letterToAllophoneMappings = letterToAllophoneMappings;
    }
}
